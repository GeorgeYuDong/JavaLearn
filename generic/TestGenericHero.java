package generic;

import charactor.ADHero;
import charactor.APHero;
import charactor.Hero;
import property.Item;

import java.util.ArrayList;

/**
 * @Author:YuDong
 * @Description:
 * @Date:created in 17:39 2018/5/29
 * @Modified By:
 */

public class TestGenericHero {
    public static void main(String[] args) {
        ArrayList<APHero> heros = new ArrayList<>();

        //只有APHero可以放进去
        heros.add(new APHero());

        //ADHero甚至放不进去
        //heros.add(new ADHero());

        //获取的时候也不需要进行转型，因为取出来一定是APHero
        APHero apHero =  heros.get(0);


        ArrayList<APHero> apHeroList = new ArrayList<>();
        apHeroList.add(new APHero());

        ArrayList<? extends Hero> heroList = apHeroList;

        //? extends Hero 表示这是一个Hero泛型的子类泛型

        //heroList 的泛型可以是Hero
        //heroList 的泛型可以使APHero
        //heroList 的泛型可以使ADHero

        //可以确凿的是，从heroList取出来的对象，一定是可以转型成Hero的

        System.out.println("h的值");
        Hero h = heroList.get(0);
        System.out.println(h);

        //但是，不能往里面放东西
      //  heroList.add(new ADHero()); //编译错误，因为heroList的泛型 有可能是APHero



        ArrayList<? super Hero> heroListt = new ArrayList<Object>();

        //? super Hero 表示 heroList的泛型是Hero或者其父类泛型

        //heroList 的泛型可以是Hero
        //heroList 的泛型可以是Object

        //所以就可以插入Hero
        heroListt.add(new Hero());
        //也可以插入Hero的子类
        heroListt.add(new APHero());
        heroListt.add(new ADHero());

        System.out.println("hh的值");
        //但是，不能从里面取数据出来,因为其泛型可能是Object,而Object是强转Hero会失败
        Hero hh = heroList.get(0);
        System.out.println(hh);

        //?泛型通配符，表示任意泛型
        ArrayList<?> generalList = apHeroList;

        //?的缺陷1： 既然?代表任意泛型，那么换句话说，你就不知道这个容器里面是什么类型
        //所以只能以Object的形式取出来
        Object o = generalList.get(0);

        //?的缺陷2： 既然?代表任意泛型，那么既有可能是Hero,也有可能是Item
        //所以，放哪种对象进去，都有风险，结果就什么什么类型的对象，都不能放进去
     // generalList.add(new Item()); //编译错误 因为?代表任意泛型，很有可能不是Item
     // generalList.add(new Hero()); //编译错误 因为?代表任意泛型，很有可能不是Hero
     // generalList.add(new APHero()); //编译错误  因为?代表任意泛型，很有可能不是APHero

      //  如果希望只取出，不插入，就使用? extends Hero
      //  如果希望只插入，不取出，就使用? super Hero
      //  如果希望，又能插入，又能取出，就不要用通配符？
        //泛型引用不能做子类和父类之间的转型

    }
}

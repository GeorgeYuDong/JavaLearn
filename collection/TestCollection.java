package collection;

import charactor.APHero;
import charactor.Hero;
import property.Item;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Author:YuDong
 * @Description:
 * @Date:created in 15:45 2018/6/25
 * @Modified By:
 */

public class TestCollection {
    public static void main(String[] args) {

        //对于不使用泛型的容器，可以往里面放英雄，也可以往里面放物品
        List heros = new ArrayList();

        heros.add(new Hero("盖伦"));

        //本来用于存放英雄的容器，现在也可以存放物品了
        heros.add(new Item("冰杖"));

        //对象转型会出现问题
        Hero h1=  (Hero) heros.get(0);
        //尤其是在容器里放的对象太多的时候，就记不清楚哪个位置放的是哪种类型的对象了
       // Hero h2=  (Hero) heros.get(1);

        //引入泛型Generic
        //声明容器的时候，就指定了这种容器，只能放Hero，放其他的就会出错
        List<Hero> genericheros = new ArrayList<>();
        genericheros.add(new Hero("盖伦"));
        //如果不是Hero类型，根本就放不进去
        //genericheros.add(new Item("冰杖"));

        //除此之外，还能存放Hero的子类
        genericheros.add(new APHero());

        //并且在取出数据的时候，不需要再进行转型了，因为里面肯定是放的Hero或者其子类
        Hero h = genericheros.get(0);

        System.out.println(h.toString());

        //接口也可继承
        //指定容器只能放Hero及子类类型
        List<Hero> generic = new ArrayList<>();
        generic.add(new Hero("bb"));
        System.out.println(generic.toString());

        for (int i = 0; i < 5; i++) {
            generic.add(new Hero("abc" + i));
        }
        System.out.println("-------------使用while迭代器iterator----------");
        Iterator<Hero> it = generic.iterator();

        while (it.hasNext()){
            Hero hh = it.next();
            System.out.println(hh.toString());
        }

        System.out.println("-------------使用for迭代器iterator----------");
        for (Iterator<Hero> iterator = generic.iterator(); iterator.hasNext();)  {
             Hero hero = iterator.next();
            System.out.println(hero.toString());
        }

        System.out.println("-------------增强型for循环----------");
        System.out.println("容器和元素写进去就行，不需要步长,会自动迭代");
        System.out.println("编程应该目标导向，逆向推，才能得出设计方法");
        for (Hero o:
             generic) {
            System.out.println(o);
        }





        }
            




}

package collection;

import charactor.APHero;
import charactor.Hero;
import property.Item;

import java.util.*;

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

       // Collections是一个类，容器的工具类,就如同Arrays是数组的工具类

        //Collection是 Set List Queue和 Deque的接口
        //Queue: 先进先出队列
        //Deque: 双向链表
        //Queue继承了Collection

       // 注：Collection和Map之间没有关系，Collection是放一个一个对象的，Map 是放键值对的
       // 注：Deque 继承 Queue,间接得继承了 Collection

        //初始化集合numbers
        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            numbers.add(i);
        }

        System.out.println("集合中的数据:");
        System.out.println(numbers);

        Collections.reverse(numbers);

        System.out.println("翻转后集合中的数据:");
        System.out.println(numbers);

        Collections.shuffle(numbers);

        System.out.println("混淆后集合中的数据:");
        System.out.println(numbers);

        Collections.sort(numbers);
        System.out.println("排序后集合中的数据:");
        System.out.println(numbers);

        Collections.swap(numbers,0,5);
        System.out.println("交换0和5下标的数据后，集合中的数据:");
        System.out.println(numbers);

        Collections.rotate(numbers,2);
        System.out.println("把集合向右滚动2个单位，标的数据后，集合中的数据:");
        System.out.println(numbers);

        System.out.println("把非线程安全的List转换为线程安全的List");
        List<Integer> synchronizedNumbers = Collections.synchronizedList(numbers);
        }
            




}

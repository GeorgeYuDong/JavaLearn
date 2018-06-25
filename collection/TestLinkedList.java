package collection;

import charactor.Hero;

import java.util.LinkedList;

/**
 * @Author:YuDong
 * @Description:
 * @Date:created in 16:47 2018/6/25
 * @Modified By:
 */

public class TestLinkedList {
    public static void main(String[] args) {

        //LinkedList是一个双向链表结构的list
        LinkedList<Hero> ll = new LinkedList<>();

        //所以可以很方便的在头部和尾部插入数据
        //在最后插入新的英雄
        ll.addLast(new Hero("hero1"));
        ll.addLast(new Hero("hero2"));
        ll.addLast(new Hero("hero3"));
        System.out.println(ll);

        //addLast
        //addFirst

        //在最前面插入新的英雄
        ll.addFirst(new Hero("heroX"));
        System.out.println(ll);

        //查看最前面的英雄
        System.out.println(ll.getFirst());
        //查看最后面的英雄
        System.out.println(ll.getLast());

        //getFirst
        //getLast

        //查看不会导致英雄被删除
        System.out.println(ll);
        //取出最前面的英雄
        System.out.println(ll.removeFirst());

        //removeFirst
        //removeLast

        //取出最后面的英雄
        System.out.println(ll.removeLast());

        //取出会导致英雄被删除
        System.out.println(ll);

    }
}

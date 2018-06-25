package collection;

import charactor.Hero;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @Author:YuDong
 * @Description:
 * @Date:created in 16:52 2018/6/25
 * @Modified By:
 */

public class TestQueue {
    public static void main(String[] args) {
        //和ArrayList一样，LinkedList也实现了List接口
        List ll = new LinkedList<Hero>();

        //Deque继承于Queue
        //所不同的是LinkedList还实现了Deque，进而又实现了Queue这个接口
        //Queue代表FIFO 先进先出的队列
        Queue<Hero> q = new LinkedList<>();

        //加在队列的最后面
        //q.offer()
        System.out.print("初始化队列：\t");
        q.offer(new Hero("Hero1"));
        q.offer(new Hero("Hero2"));
        q.offer(new Hero("Hero3"));
        q.offer(new Hero("Hero4"));

        //q.poll(),取出第一个
        System.out.println(q);
        System.out.print("把第一个元素取poll()出来:\t");
        //取出第一个Hero，FIFO 先进先出
        Hero h = q.poll();
        System.out.println(h);
        System.out.print("取出第一个元素之后的队列:\t");
        System.out.println(q);

        //q.peek()，看下第一个
        //把第一个拿出来看一看，但是不取出来
        h = q.peek();
        System.out.print("查看peek()第一个元素:\t");
        System.out.println(h);
        System.out.print("查看并不会导致第一个元素被取出来:\t");
        System.out.println(q);

    }
}

package multiplethread;

import charactor.Hero;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @Author:YuDong
 * @Description:
 * @Date:created in 16:00 2018/7/2
 * @Modified By:
 */

/*
*
*   HashMap和Hashtable都实现了Map接口，都是键值对保存数据的方式
    区别1：
    HashMap可以存放 null
    Hashtable不能存放null
    区别2：
    HashMap不是线程安全的类
    Hashtable是线程安全的类
    StringBuffer 是线程安全的
    StringBuilder 是非线程安全的

    所以当进行大量字符串拼接操作的时候，如果是单线程就用StringBuilder会更快些，如果是多线程，就需要用StringBuffer 保证数据的安全性

    非线程安全的为什么会比线程安全的 快？ 因为不需要同步嘛，省略了些时间

    Vector是线程安全的类，而ArrayList是非线程安全的。

    ArrayList是非线程安全的，换句话说，多个线程可以同时进入一个ArrayList对象的add方法

    借助Collections.synchronizedList，可以把ArrayList转换为线程安全的List。

    与此类似的，还有HashSet,LinkedList,HashMap等等非线程安全的类，都通过工具类Collections转换为线程安全的
*
*
*
*
*
*
* */



public class TestUseSynchroThread {

    public static void main(String[] args) {

        //List是非线程安全的，多个类可以同时进入一个List对象的add方法
        List<Integer> list1 = new ArrayList<>();
        //使用Collections.sysnchronizedList方法，可以转换为线程安全类
        List<Integer> list2 = Collections.synchronizedList(list1);

        final Object someObject = new Object();

        final Hero gareen = new Hero();

        gareen.name = "盖伦";
        gareen.hp = 10000;

        int n = 10000;

        Thread[] addThreads = new Thread[n];
        Thread[] reduceThreads = new Thread[n];

        for (int i = 0; i < n; i++) {
            Thread t = new Thread(() -> {

                //任何线程要修改hp的值，必须先占用someObject
                synchronized (someObject) {
                    gareen.recover();
                }

                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            });
            t.start();
            addThreads[i] = t;

        }

        for (int i = 0; i < n; i++) {
            Thread t = new Thread(() -> {
                //任何线程要修改hp的值，必须先占用someObject
                synchronized (someObject) {
                    gareen.hurt();
                }

                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            });
            t.start();
            reduceThreads[i] = t;
        }

        for (Thread t : addThreads) {
            try {
                t.join();
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        for (Thread t : reduceThreads) {
            try {
                t.join();
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

        System.out.printf("%d个增加线程和%d个减少线程结束后%n盖伦的血量是 %.0f%n", n,n,gareen.hp);

    }

}

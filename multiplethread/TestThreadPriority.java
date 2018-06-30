package multiplethread;

import charactor.Hero;

/**
 * @Author:YuDong
 * @Description:
 * @Date:created in 14:41 2018/6/29
 * @Modified By:
 */

public class TestThreadPriority {

    /*
    当线程处于竞争关系的时候，优先级高的线程会有更大的几率获得CPU资源
    为了演示该效果，要把暂停时间去掉，多条线程各自会尽力去占有CPU资源
    同时把英雄的血量增加100倍，攻击减低到1，才有足够的时间观察到优先级的演示
    如图可见，线程1的优先级是MAX_PRIORITY，所以它争取到了更多的CPU资源执行代码
    */

    public static void main(String[] args) {

        final Hero gareen = new Hero();
        gareen.name = "盖伦";
        gareen.hp = 6160;
        gareen.damage = 1;

        final Hero teemo = new Hero();
        teemo.name = "提莫";
        teemo.hp = 3000;
        teemo.damage = 1;

        final Hero bh = new Hero();
        bh.name = "赏金猎人";
        bh.hp = 5000;
        bh.damage = 1;

        final Hero leesin = new Hero();
        leesin.name = "盲僧";
        leesin.hp = 4505;
        leesin.damage = 1;

        Thread t1= new Thread(){
            @Override
            public void run(){
                while(!teemo.isDead()){
                    gareen.attackHero(teemo);
                }
            }
        };

        Thread t2= new Thread(){
            @Override
            public void run(){
                while(!leesin.isDead()){
                    bh.attackHero(leesin);
                }
            }
        };

        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();

    }
}

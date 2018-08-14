package multiplethread;

import charactor.Hero;

/**
 * @Author:YuDong
 * @Description:
 * @Date:created in 13:56 2018/6/29
 * @Modified By:
 */

public class Battle implements Runnable {
    private Hero h1;
    private Hero h2;

    public Battle(Hero h1, Hero h2){
        this.h1 = h1;
        this.h2 = h2;
    }


    @Override
    public void run(){
        while(!h2.isDead()){
            h1.attackHero(h2);
        }
    }
}

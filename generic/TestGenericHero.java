package generic;

import charactor.APHero;

import java.util.ArrayList;

/**
 * @Author:YuDong
 * @Description:
 * @Date:created in 17:39 2018/5/29
 * @Modified By:
 */

public class TestGenericHero {
    public static void main(String[] args) {
        ArrayList<APHero> heros = new ArrayList<APHero>();

        //只有APHero可以放进去
        heros.add(new APHero());

        //ADHero甚至放不进去
        //heros.add(new ADHero());

        //获取的时候也不需要进行转型，因为取出来一定是APHero
        APHero apHero =  heros.get(0);

    }
}

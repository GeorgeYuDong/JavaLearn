package lambda;

import charactor.Hero;

import java.util.*;

/**
 * @Author:YuDong
 * @Description:
 * @Date:created in 17:28 2018/6/27
 * @Modified By:
 */

public class TestAggregate {
    public static void main(String[] args) {
        Random r = new Random();
        List<Hero> heros = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            heros.add(new Hero("hero " + i, r.nextInt(1000), r.nextInt(100)));
        }
        //nextInt表示一个范围内的随机数

        System.out.println("初始化集合后的数据 (最后一个数据重复)：");
        System.out.println(heros);

        //传统方式
        Collections.sort(heros,new Comparator<Hero>() {
            @Override
            public int compare(Hero o1, Hero o2) {
                return (int) (o2.hp-o1.hp);
            }
        });

        Hero hero = heros.get(2);
        System.out.println("通过传统方式找出来的hp第三高的英雄名称是:" + hero.name);

        //聚合方式
        String name = heros
                .stream()
                .sorted((h1,h2)->h1.hp>h2.hp?-1:1)
                .skip(2)
                .map(h->h.getName())
                .findFirst()
                .get();

        System.out.println("通过聚合操作找出来的hp第三高的英雄名称是:" + name);




    }
}

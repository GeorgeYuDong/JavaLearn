package lambda;

import charactor.Hero;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @Author:YuDong
 * @Description:
 * @Date:created in 9:33 2018/6/28
 * @Modified By:
 */

public class TestHeroChecker {
    public static void main(String[] args) {
        Random r = new Random();
        List<Hero> heros = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            heros.add(new Hero("hero " + i, r.nextInt(1000), r.nextInt(100)));
        }
        System.out.println("初始化后的集合：");
        System.out.println(heros);
        System.out.println("使用匿名类的方式，筛选出 hp>100 && damange<50的英雄");

        /*
        HeroChecker checker = new HeroChecker() {
            @Override
            public boolean test(Hero h) {
                return (h.hp>100 && h.damage<50);
            }
        };
        */
      //   HeroChecker checker = h -> (h.hp>100 && h.damage<50);

        //Lambda表达式虽然带来了代码的简洁，但是也有其局限性。
        //1. 可读性差，与啰嗦的但是清晰的匿名类代码结构比较起来，Lambda表达式一旦变得比较长，就难以理解
        //2. 不便于调试，很难在Lambda表达式中增加调试信息，比如日志
        //3. 版本支持，Lambda表达式在JDK8版本中才开始支持，如果系统使用的是以前的版本，考虑系统的稳定性等原因，而不愿意升级，那么就无法使用。
        //Lambda比较适合用在简短的业务代码中，并不适合用在复杂的系统中，会加大维护成本。
        //与匿名类 概念相比较，
        //Lambda 其实就是匿名方法，这是一种把方法作为参数进行传递的编程思想。
        //但是Java会在背后，悄悄的，把这些都还原成匿名类方式。
        //引入Lambda表达式，会使得代码更加紧凑，而不是各种接口和匿名类到处飞。

        System.out.println("使用Lamdba的方式，筛选出 hp>100 && damange<50的英雄");
        filter(heros,h->h.hp>100 && h.damage<50);

      //  filter(heros,checker);
    }

    private static void filter(List<Hero> heros,HeroChecker checker) {
        for (Hero hero : heros) {
            if(checker.test(hero)) {
                System.out.print(hero);
            }
        }
    }
}

package lambda;

import charactor.Hero;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * @Author:YuDong
 * @Description:
 * @Date:created in 15:45 2018/6/28
 * @Modified By:
 */

public class TestCollection {
    public static void main(String[] args) {
        Random r =new Random();
        List<Hero> heros = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            heros.add(new Hero("hero "+ i, r.nextInt(100), r.nextInt(100)));
        }
        System.out.println("初始化后的集合：");
        System.out.println(heros);

        Collections.sort(heros,(h1, h2)->TestCollection.compare(h1, h2));

        System.out.println(heros);

        Collections.sort(heros,TestCollection::compare);

        System.out.println(heros);
    }

    public static int compare(Hero h1, Hero h2){
        return h1.hp>=h2.hp?1:-1;
    }
}

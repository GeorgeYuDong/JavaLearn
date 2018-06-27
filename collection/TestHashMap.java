package collection;

import charactor.Hero;

import java.sql.Connection;
import java.util.HashMap;
import java.util.HashSet;

/**
 * @Author:YuDong
 * @Description:
 * @Date:created in 18:23 2018/6/25
 * @Modified By:
 */

public class TestHashMap {
    public static void main(String[] args) {

        HashMap<String,String> dictionary = new HashMap<>();

        dictionary.put("adc", "物理英雄");
        dictionary.put("apc", "魔法英雄");
        dictionary.put("t", "坦克");

        System.out.println(dictionary.get("t"));


        HashMap<String, Hero> heroMap = new HashMap<>();

        //put()方法添加键值对
        heroMap.put("gareen", new Hero("gareen1"));
        System.out.println(heroMap);

        //key为gareen已经有value了，再以gareen作为key放入数据，会导致原英雄，被覆盖

        //不会增加新的元素到Map中

        heroMap.put("gareen", new Hero("gareen2"));
        System.out.println(heroMap);

        //清空map
        heroMap.clear();
        Hero gareen = new Hero("gareen");

        //同一个对象可以作为值插入到map中，只要对应的key不一样
        heroMap.put("hero1", gareen);
        heroMap.put("hero2", gareen);

        System.out.println(heroMap);

        //应用编程
        System.out.println("--------------HashSet-----------------------");
        HashSet<String> names = new HashSet<>();

        names.add("gareen");

        System.out.println(names);

        //第二次插入同样的数据，是插不进去的，容器中只会保留一个
        names.add("gareen");
        System.out.println(names);

        HashMap<String, String> str = new HashMap<>();
        str.put("a", "b");
        str.put("b", "c");
        System.out.println(str);




    }

}

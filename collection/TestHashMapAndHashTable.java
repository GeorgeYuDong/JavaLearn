package collection;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Set;

/**
 * @Author:YuDong
 * @Description:
 * @Date:created in 15:12 2018/6/27
 * @Modified By:
 */

public class TestHashMapAndHashTable {
    public static void main(String[] args) {

        //HashMap和Hashtable都实现了Map接口，都是键值对保存数据的方式

        HashMap<String,String> hashMap = new HashMap<>();

        //HashMap可以用null作key,作value
        hashMap.put(null, "123");
        hashMap.put("123", null);
        System.out.println(hashMap);

        Hashtable<String,String> hashtable = new Hashtable<>();
        //Hashtable不能用null作key，不能用null作value
       //hashtable.put(null, "123");
       //hashtable.put("123", null);

        //HashMap不是线程安全的类
        //Hashtable是线程安全的类

        HashMap<String,String> map = new HashMap<>();
        HashMap<String,String> temp = new HashMap<>();
        map.put("adc", "物理英雄");
        map.put("apc", "魔法英雄");
        map.put("t", "坦克");

        System.out.println("初始化后的Map:");
        System.out.println(map);
        //Set为一个接口,keySet返回的对象实现了Set方法，这是多态
        Set<String> keys = map.keySet();

        for (String key : keys) {
            String value = map.get(key);
            temp.put(value, key);
        }
        map.clear();
        map.putAll(temp);

        System.out.println("反转后的Map:");
        System.out.println(map);

    }
}

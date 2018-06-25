package collection;

import java.util.HashMap;

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
    }

}

package collection;

import charactor.Hero;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

/**
 * @Author:YuDong
 * @Description:
 * @Date:created in 15:27 2018/6/27
 * @Modified By:
 */

public class TestSet {
    public static void main(String[] args) {
        HashSet<Integer> numberSet1 = new HashSet<>();
        //HashSet中的数据不是按照插入顺序存放
        numberSet1.add(88);
        numberSet1.add(88);
        numberSet1.add(888);

        System.out.println("HashSet中的数据");
        System.out.println(numberSet1);
        /*
        LinkedHashSet<Integer> numberSet2 = new LinkedHashSet<>();
        //LinkedHashSet中的数据是按照插入顺序存放
        numberSet2.add(88);
        numberSet2.add(8);
        numberSet2.add(888);

        System.out.println("LinkedHashSet中的数据");

        System.out.println(numberSet2);
        TreeSet<Integer> numberSet3 = new TreeSet<>();
        //TreeSet 中的数据是进行了排序的
        numberSet3.add(88);
        numberSet3.add(8);
        numberSet3.add(888);

        System.out.println("TreeSet中的数据，排了序");
        System.out.println(numberSet3);

        HashMap<String,Hero> heroMap = new HashMap<>();
        for (int j = 0; j < 2000000; j++) {
            Hero h = new Hero("Hero " + j);
            heroMap.put(h.name, h);
        }
        System.out.println("数据准备完成");
        */

        /*
        for (int i = 0; i < 10; i++) {
            long start = System.currentTimeMillis();

            //查找名字是Hero 1000000的对象
            Hero target = heroMap.get("Hero 1000000");
            System.out.println("找到了 hero!" + target.name);

            long end = System.currentTimeMillis();
            long elapsed = end - start;
            System.out.println("一共花了：" + elapsed + " 毫秒");
        }
        */

    }
}

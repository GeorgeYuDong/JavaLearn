package collection;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * @Author:YuDong
 * @Description:
 * @Date:created in 10:56 2018/6/27
 * @Modified By:
 */

public class TestArrayListAndHashSet {

    public static void main(String[] args) {
        ArrayList<Integer> numberList = new ArrayList<>();
        //List中的数据按照插入顺序存放
        System.out.println("----------List----------");
        System.out.println("向List 中插入 9 5 1");
        numberList.add(9);
        numberList.add(5);
        numberList.add(1);
        System.out.println("List 按照顺序存放数据:");
        System.out.println(numberList);
        System.out.println("----------Set----------");
        HashSet<Integer> numberSet = new HashSet<>();
        System.out.println("向Set 中插入9 5 1");
        //Set中的数据不是按照插入顺序存放
        numberSet.add(9);
        numberSet.add(5);
        numberSet.add(1);
        System.out.println("Set 不是按照顺序存放数据:");
        System.out.println(numberSet);

        //List按插入顺序，Set不按插入顺序放
        ArrayList<Integer> ii = new ArrayList<>();
        ii.add(4);
        ii.add(2);
        ii.add(5);
        ii.add(6);
        ii.add(7);
        ii.add(8);
        System.out.println(ii);
        HashSet<Integer> aa = new HashSet<>();
        aa.add(4);
        aa.add(2);
        aa.add(5);
        aa.add(6);
        aa.add(7);
        aa.add(8);
        System.out.println(aa);

        //List中的数据可以重复
        System.out.println("----------List----------");
        System.out.println("向List 中插入 9 9");
        numberList.add(9);
        numberList.add(9);
        System.out.println("List 中出现两个9:");
        System.out.println(numberList);
        System.out.println("----------Set----------");
        System.out.println("向Set 中插入9 9");
        //Set中的数据不能重复
        numberSet.add(9);
        numberSet.add(9);
        System.out.println("Set 中只会保留一个9:");
        System.out.println(numberSet);



    }
}

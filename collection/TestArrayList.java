package collection;

import charactor.Hero;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author:YuDong
 * @Description:
 * @Date:created in 14:20 2018/6/25
 * @Modified By:
 */

public class TestArrayList {
    @SuppressWarnings("rawtypes")
    public static void main(String[] args) {
        //容器类ArrayList，用于存放对象
        ArrayList heros = new ArrayList();
        heros.add( new Hero("盖伦"));
        System.out.println("对象个数:" + heros.size());

        //容器的容量"capacity"会随着对象的增加，自动增长
        //只需要不断往容器里增加英雄即可，不用担心会出现数组的边界问题。
        heros.add( new Hero("提莫"));
        System.out.println("对象个数:" + heros.size());
        //一个列表[盖伦，提莫]
        System.out.println(heros.toString());

        //重写了equals方法后，contains方法不管用
        Hero dbd = new Hero("dbd");
        System.out.println(heros.contains(dbd));


        Hero abc = new Hero("abc");
        heros.add(abc);

        //获取指定位置的对象,越界报错
        System.out.println(heros.get(1));

        System.out.println(heros.indexOf(abc));

        System.out.println(heros.toString());

        //对象删除
        heros.remove(abc);

        System.out.println(heros.toString());
        //替换提莫对象
        heros.set(1,new Hero("mmm"));
        System.out.println(heros.toString());

        ArrayList anotherArrayList = new ArrayList();
        anotherArrayList.add(new Hero("a"));
        anotherArrayList.add(new Hero("b"));
        anotherArrayList.add(new Hero("c"));

        //把另一个容器所有对象加进来
        heros.addAll(anotherArrayList);

        System.out.println(heros.toString());

        //最核心，肌肉记忆，理论知识，两方面,数据结构就可以了

        Hero[] hs = (Hero[])heros.toArray(new Hero[]{});
        System.out.println(heros.toArray());
        System.out.println(hs);

        //清空对象
        heros.clear();
        System.out.println(heros.toString());

        //ArrayList实现了List接口
        List h = new ArrayList();
        h.add(new Hero("aa"));
        System.out.println(h.size());

        //











    }
}

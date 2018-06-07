package digit;

/**
 * @Author:YuDong
 * @Description:
 * @Date:created in 17:48 2018/6/7
 * @Modified By:
 */

public class TestMath {
    public static void main(String[] args) {

        //Math类静态方法
        //ctrl+shift+E,切换文件

        //在好的IDE下面编程就是一种奖励,心旷神怡,美哉
        System.out.println(Math.abs(-1));
        System.out.println(Math.round(12.56));
        System.out.println("随机数: " + Math.random());

        System.out.println(Math.sqrt(25));
        System.out.println(Math.E);
        System.out.println(Math.PI);

        System.out.println("乘方:"+ Math.pow(2,4));

        //取1-10之间的随机数,取不到10
        System.out.println((int)(Math.random()*10));


    }
}

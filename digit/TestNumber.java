package digit;

/**
 * @Author:YuDong
 * @Description:
 * @Date:created in 20:49 2018/6/6
 * @Modified By:
 */
//默认导入了java.lang.*的类

public class TestNumber {
    public static void main(String[] args) {
        int i = 5;

        //封装类
        //构造方法，把属性值value初始化
        //把基本类型变量转换为Integer对象
        Integer it = new Integer(i);
        System.out.println(it);

        //把一个Integer对象转换为一个基本类型int
        //调用对象方法,返回int值
        int i2 = it.intValue();

        System.out.println(i2);

        //Integer是Number的子类
        System.out.println(it instanceof Number);

        //自动转换就是装箱,基本类型自动转换到封装类
        Integer it2 = i;

        //封装类转换到基本类型,拆箱
        int i3 = it;

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);





    }
}

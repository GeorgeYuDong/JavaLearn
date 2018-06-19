package digit;

/**
 * @Author:YuDong
 * @Description:
 * @Date:created in 17:09 2018/6/7
 * @Modified By:
 */

public class TestNumberToString {
    public static void main(String[] args) {
        int i = 9;

        //第一种
        //数字转字符串，String类的静态valueOf方法
        //valueOf静态方法，不需要使用new创建对象,调用Integer.toString()静态方法
        //一般是 工具类，使用静态方法,不用创建对象
        String str = String.valueOf(i);
        System.out.println(str);

        //第二种
        //先装箱为对象，再调用toString方法
        Integer it = i;
        String str2 = it.toString();

        System.out.println(str2);
        //无为null,没有为空字符"",老子之无
        //Java程序员上班的那些事儿


        

    }
}

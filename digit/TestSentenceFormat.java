package digit;

import java.util.Locale;

/**
 * @Author:YuDong
 * @Description:
 * @Date:created in 19:31 2018/6/7
 * @Modified By:
 */

public class TestSentenceFormat {
    public static void main(String[] args) {

        //格式化输出对象
        String content = "abc %d abd %s 的冯绍峰 %n";
        System.out.printf(content, 12, "胜多负少");

        //%n 换行
        //%s 字符串
        //%d 整数
        String format = "aadd %f adfs %n";
        System.out.printf(format, 12.5);
        System.out.format(format, 30.5);

        int year = 2020;
        //总长度，左对齐，补0，千位分隔符，小数点位数，本地化表达

        //直接打印数字
        System.out.format("%d%n",year);
        //总长度是8,默认右对齐
        System.out.format("%8d%n",year);
        //总长度是8,左对齐
        System.out.format("%-8d%n",year);
        //总长度是8,不够补0
        System.out.format("%08d%n",year);
        //千位分隔符
        System.out.format("%,8d%n",year*10000);

        //小数点位数
        System.out.format("%.2f%n",Math.PI);

        //不同国家的千位分隔符
        System.out.format(Locale.FRANCE,"%,.2f%n",Math.PI*10000);
        System.out.format(Locale.US,"%,.2f%n",Math.PI*10000);
        System.out.format(Locale.UK,"%,.2f%n",Math.PI*10000);
    }
}

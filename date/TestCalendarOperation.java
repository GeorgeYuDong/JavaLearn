package date;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @Author:YuDong
 * @Description:
 * @Date:created in 18:08 2018/6/6
 * @Modified By:
 */

public class TestCalendarOperation {
    //类属性，无论如何都会创建一个

    private static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    public static void main(String[] args) {

        //单例模式获取引用
        Calendar c = Calendar.getInstance();
        //c.getTime返回Date类型对象
        Date now = c.getTime();
        // 当前日期
        System.out.println("当前日期：\t" + format(c.getTime()));

        // 下个月的今天
        c.setTime(now);
        c.add(Calendar.MONTH, 1);
        System.out.println("下个月的今天:\t" +format(c.getTime()));

        // 去年的今天
        c.setTime(now);
        c.add(Calendar.YEAR, -1);
        System.out.println("去年的今天:\t" +format(c.getTime()));

        // 上个月的第三天
        c.setTime(now);
        c.add(Calendar.MONTH, -1);
        c.set(Calendar.DATE, 3);
        System.out.println("上个月的第三天:\t" +format(c.getTime()));
        System.out.println("hello,world");
    }

    private static String format(Date time) {
        return sdf.format(time);
    }
}

package date;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author:YuDong
 * @Description:
 * @Date:created in 16:40 2018/6/5
 * @Modified By:
 */

public class TestDate {
    public static void main(String[] args) {
        // 当前时间,构造方法空值，输出当前日期
        Date d1 = new Date();
        System.out.println("当前时间:");
        System.out.println(d1);
        System.out.println();
        // 从1970年1月1日 早上8点0分0秒 开始经历的毫秒数
        Date d2 = new Date(5000);
        System.out.println("从1970年1月1日 早上8点0分0秒 开始经历了5秒的时间");
        System.out.println(d2);

        Date d = new Date();
        System.out.println(d.getTime());

        //0作为构造方法入参,就是1970年1.1,8.0.0 am
        Date zero = new Date(0);
        System.out.println(zero);

        //理论上与getTime是一样的,当前日期的毫秒数
        System.out.println(System.currentTimeMillis());

        //日期格式化
        //SSS,代表毫秒
        //日期格式化对象
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS" );

        System.out.println(sdf.format(d));

    }
}

package date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author:YuDong
 * @Description:
 * @Date:created in 10:18 2018/6/6
 * @Modified By:
 */

public class TestStringToDate {
    public static void main(String[] args) {

        //日期格式化类
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

        String str = "2016/1/5 12:12:12";

        try {
            //用日期格式化对象，解析字符串，返回日期对象
            Date d = sdf.parse(str);
            System.out.printf("字符串 %s 通过格式  yyyy/MM/dd HH:mm:ss %n转换为日期对象: %s", str, d.toString());
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}

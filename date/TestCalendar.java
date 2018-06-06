package date;

import java.util.Calendar;
import java.util.Date;

/**
 * @Author:YuDong
 * @Description:
 * @Date:created in 17:34 2018/6/6
 * @Modified By:
 */

public class TestCalendar {
  public static void main(String[] args) {
      //采用单例模式获取日历对象Calendar.getInstance();
      Calendar c = Calendar.getInstance();

      //通过日历对象得到日期对象
      Date d = c.getTime();

      Date d2 = new Date(0);
      c.setTime(d2);

      System.out.println(d2);

      //把这个日历，调成日期 : 1970.1.1 08:00:00
  }

}

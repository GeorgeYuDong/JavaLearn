package digit;

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
    }
}

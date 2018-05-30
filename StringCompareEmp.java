/**
 * @Author:YuDong
 * @Description:
 * @Date:created in 17:05 2017/11/29
 * @Modified By:
 */

public class StringCompareEmp {
    public static void main(String[] args) {
        String str = "Hello World";
        String anotherString = "hello world";
        Object objStr = str;

        System.out.println( str.compareTo(anotherString) );
        System.out.println( str.compareToIgnoreCase(anotherString) );  //忽略大小写
        System.out.println( str.compareTo(objStr.toString()));
    }
}

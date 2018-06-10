package character;

/**
 * @Author:YuDong
 * @Description:
 * @Date:created in 11:34 2018/6/8
 * @Modified By:
 */

public class TestString {


    public static void main(String[] args) {

        //  通过字符数组创建一个字符串对象

        char[] cs = new char[]{'a', 'c'};
        //ab为新创建的字符串
        String ab = new String(cs);

        System.out.println(ab);

        cs[0] = 'b';
        //对ab引用无影响，因为ab是新创建的
        System.out.println(ab);

        //格式化:
        //日期格式化
        //String格式化
        //打印格式化

        String sentence = "abcd %d adsfsdf %d sfsdf %n";
        //调用format方法，得到新的字符串对象,返回的是String
        String s = String.format(sentence,12,3);
        System.out.println(s);

        //输出流，按照指定字符串格式,返回的是输出流PrintStream
        System.out.format(sentence, 12,3);
        System.out.printf(sentence, 12,3);


        //length()方法，获取字符串长度
        System.out.println(sentence.length());

        //操纵字符串
        //charAt()方法获取指定位置的字符串
        System.out.println(sentence.charAt(3));

        //获取对应的字符数组
        //char[],toCharArray()方法
        char[] cc = s.toCharArray();
        System.out.println(cc);

        //去空格
        String ss = "      sdfsfsdf, sfsdf, sfsd,sdfs";
        System.out.println(ss.trim());
        System.out.println(ss);

        //按照,逗号字符串分隔句子到各子字符串数组
        //split分隔的意思,返回的是String[]
        //特别要注意返回的方法类型
        System.out.println("分隔字符串");
        String[] subSentences = ss.split(",");
        for (String sub: subSentences
             ) {
            System.out.println(sub);
        }





    }

}

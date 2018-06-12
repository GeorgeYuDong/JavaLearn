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

        //截取字符串,左开右闭
        String str3 = "halo,worlod, 123,水电费了的";
        System.out.println(str3.substring(4));
        System.out.println(str3.substring(4,10));

        //转换大小写，toLower,toUpper
        System.out.println(str3.toLowerCase());
        System.out.println(str3.toUpperCase());

        //返回d第一个字符出现的下标
        System.out.println(str3.indexOf('d'));
        //不要忘记一点，面向对象编程是对数据和行为的封装
        //规定数据和方法的访问权限
        //
        System.out.println("cont");
        //str3本身没有变化
        System.out.println(str3);
        System.out.println(str3.concat("abc"));

        System.out.println(str3.lastIndexOf("了"));

        //是否包含子串
        System.out.println(str3.contains("123"));

        //从位置1开始，第一次出现,的下标
        System.out.println(str3.indexOf(',',1));

        //替换所有子串,本身str3是没有变化的
        System.out.println(str3.replaceAll("lo", "iii"));

        System.out.println(str3);

        System.out.println(str3.replaceFirst("o","lo"));

        //原串没有变化
        System.out.println(str3);
        System.out.println(str3.replaceFirst("lo","d"));


        String str1 = "the light";
        String str2 = new String(str1);

        //两个对象不同
        System.out.println(str1 == str2);

        //两个对象的内容是一样的
        System.out.println(str1.equals(str2));

        String str4 = "the light";
        //字面值一样，编译器不再重复创建对象
        System.out.println(str1 == str4);

        //str5为大写
        String str5  = str1.toUpperCase();
        System.out.println(str5);
        //比较内容，忽略大小写
        System.out.println(str1.equalsIgnoreCase(str5));

        System.out.println("是否以子字符串开始或结束");
        String start = "the";
        String end = "Ight";
        System.out.println(str1.startsWith(start));
        System.out.println(str1.endsWith(end));




    }

}

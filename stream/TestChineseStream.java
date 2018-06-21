package stream;

import sun.nio.cs.ext.GBK;

import java.io.UnsupportedEncodingException;

/**
 * @Author:YuDong
 * @Description:
 * @Date:created in 17:33 2018/6/21
 * @Modified By:
 */

public class TestChineseStream {
    public static void main(String[] args) {
        String str = "中";
        showCode(str);
    }

    //ISO-8859-1 ASCII 数字和西欧字母
    //GBK GB2312 BIG5 中文
    //UNICODE (统一码，万国码)

    private static void showCode(String str) {
        String[] encodes = { "BIG5", "GBK", "GB2312", "UTF-8", "UTF-16", "UTF-32" };
        for (String encode : encodes) {
            showCode(str, encode);
        }
    }

    private static void showCode(String str, String encode) {
        try {
            System.out.printf("字符: \"%s\" 的在编码方式%s下的十六进制值是%n", str, encode);
            byte[] bs = str.getBytes(encode);

            for (byte b : bs) {
                int i = b&0xff;
                System.out.print(Integer.toHexString(i) + "\t");
            }
            System.out.println();
            System.out.println();
        } catch (UnsupportedEncodingException e) {
            System.out.printf("UnsupportedEncodingException: %s编码方式无法解析字符%s\n", encode, str);
        }
    }
}

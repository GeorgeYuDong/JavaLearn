package stream;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @Author:YuDong
 * @Description:
 * @Date:created in 11:47 2018/6/21
 * @Modified By:
 */

public class TestCharacterStream {
    public static void main(String[] args) {
        // 准备文件lol2.txt
        File f = new File("d:/lol2.txt");

        // 创建基于文件的Writer,而非FileOutPutStream
        try (FileWriter fr = new FileWriter(f)) {
            // 以字符流的形式把数据写入到文件中
            String data="1234567890";
            char[] cs = data.toCharArray();
            fr.write(cs);
            System.out.println(data);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }


        // 准备文件lol.txt其中的内容是AB
        File ff = new File("d:/lol.txt");
        // 创建基于文件的Reader
        try (FileReader fr = new FileReader(ff)) {
            // 创建字符数组，其长度就是文件的长度
            char[] all = new char[(int) ff.length()];
            // 以字符流的形式读取文件所有内容
            fr.read(all);
            for (char b : all) {
                // 打印出来是A B
                System.out.println(b);
            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}

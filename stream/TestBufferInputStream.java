package stream;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * @Author:YuDong
 * @Description:
 * @Date:created in 10:57 2018/6/25
 * @Modified By:
 */
//缓存字符输入流,加强性能 BufferedReader
    //字节流，字符流一个一个硬盘操作，IO太慢

public class TestBufferInputStream {
    public static void main(String[] args) {
        // 准备文件lol.txt其中的内容是
        // garen kill teemo
        // teemo revive after 1 minutes
        // teemo try to garen, but killed again
        File f = new File("d:/lol.txt");
        // 创建文件字符流
        // 缓存流必须建立在一个存在的流的基础上
        try (
                FileReader fr = new FileReader(f);
                BufferedReader br = new BufferedReader(fr)
        )
        {
            while (true) {
                // 一次读一行
                String line = br.readLine();
                if (null == line) {
                    break;
                }
                System.out.println(line);
            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}

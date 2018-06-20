package stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Author:YuDong
 * @Description:
 * @Date:created in 19:51 2018/6/20
 * @Modified By:
 */

public class TestStream {
    //输入输出流是针对内存本身来说的

    public static void main(String[] args) {
        try {
            File f = new File("d:/lol.txt");
            // 创建基于文件的输入流
            FileInputStream fis = new FileInputStream(f);
            // 通过这个输入流，就可以把数据从硬盘，读取到Java的虚拟机中来，也就是读取到内存中
            System.out.println(fis);

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        try {
            File ff = new File("d:/lol.txt");
            // 创建基于文件的输出流,把内存数据输出到硬盘文件上
            FileOutputStream fos = new FileOutputStream(ff);
            // 通过这个输出流，就可以把数据从内存，输出到硬盘的文件上
            System.out.println(fos);
        } catch (IOException ee) {
            // TODO Auto-generated catch block
            ee.printStackTrace();
        }


    }
}

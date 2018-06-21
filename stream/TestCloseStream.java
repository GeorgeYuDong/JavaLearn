package stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * @Author:YuDong
 * @Description:
 * @Date:created in 16:52 2018/6/21
 * @Modified By:
 */

public class TestCloseStream {

    public static void main(String[] args) {
        File f = new File("d:/lol.txt");

        //FileInputStream实现AutoCloseable接口,使用try-with-resources方式关闭流
        //把流定义在try()里面，try,catch,finally结束的时候，会自动关闭
        try (FileInputStream fis = new FileInputStream(f)){
            //byte[] all = new byte[5];
            byte[] all = new byte[(int) f.length()];
            fis.read(all);
            for (byte b: all){
                System.out.println(b);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}

package exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * @Author:YuDong
 * @Description:
 * @Date:created in 17:06 2018/6/12
 * @Modified By:
 */

public class TestException {
    //jdk参数设置，这个要好好看下

    //throws出现异常的可能性，并不一定会发生异常,出现在方法声明上
    //throw是抛出了异常，执行throw一定是抛出了某个异常对象
    //异常分类：
    //1.必须处理的异常，文件不存在等
    //2.运行时异常,除数不能为0，下标越界等，不是必须使用try,catch处理的异常

    //Error,系统级别的异常,比如内存用光了,OutOfMemoryError,不要求强制捕捉
    //catch即捕捉到异常
    //Throwable是Exception和Error的基类，可以用它来捕捉异常
    //还可以自定义异常，先声明后抛出,先throws后throw


    public static void main(String[] args) throws FileNotFoundException {
        //File java.io FileNotFoundException
       File f = new File("d:/LOL.exe");

        try{

             new FileInputStream(f);
        }/*catch (Exception e){
           // e.printStackTrace();
            //不抛出
            System.out.println("无论如何都执行1");
        }*/
        catch (Throwable t){
            System.out.println("throwable");
        }
        finally {
            System.out.println("无论如何都执行");
        }
    }

}

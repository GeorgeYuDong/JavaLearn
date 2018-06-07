package charactor;

/**
 * @Author:YuDong
 * @Description:
 * @Date:created in 18:18 2018/6/6
 * @Modified By:
 */

public class TestClassStatic {

    //实例属性，对象属性，非静态属性

    public String name;


    protected float hp;

    //类属性,静态属性

    static String copyright;

    public static void main(String[] args) {

        System.out.println(25);

        Hero garen =  new Hero();
        garen.name = "盖伦";

        Hero.copyright = "版权由abc所有";

        System.out.println(32);

        System.out.println(garen.name);
        System.out.println(Hero.copyright);

        System.out.println(37);

        Hero teemo =  new Hero();
        teemo.name = "提莫";
        System.out.println(teemo.name);
        System.out.println(Hero.copyright);

        System.out.println(44);



        //看原理，然后落实代码学习,奖励机制,用这个编译器写代码本身就是一种奖励
        //jvm用C/C++编写，不同平台需不同jvm
        //jvm可以监控使用频率高的代码并进行优化，甚至消除函数调用，进行内联
        //Gui程序很慢，与平台无关的绘图方式
        //应用方向web开发和android开发
        //高并发，集群
        //类是图纸，new了以后才会有零件出来。变量是属性，函数是方法
        //目的 :方便程序员组织和管理代码，快速梳理编程思路，带来编程思想上的革新
        //java类库:
        //java.*是核心包,javax.*是扩展包,x是extension的意思
        //org.*是机构或组织开发的包
        //java.text:与自然语言无关的方式处理文本，日期，数字，消息
        //java.lang:基础类,Object,Math,String,StringBuffer,System,Thread等
        //java.util:集合框架，事件模型，日期和时间实施，国际化，遗留的集合类
        //java.io:文件，数据流和序列化
        //java.net:网络应用与开发
        //java.sql:数据库API
        //java.awt,java.swing:GUI设计与开发的类

    }
}

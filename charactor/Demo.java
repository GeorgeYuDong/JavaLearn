package charactor;

/**
 * @Author:YuDong
 * @Description:
 * @Date:created in 10:47 2018/6/5
 * @Modified By:
 */

public abstract class Demo extends Object{
    //尽快迈出第一步
    //尽快建立自信和成就感,让自己有勇气走下去
    //然后缺什么，补什么
    //真正让人望而却步的不是技术本身，而是对自身的不自信
    //唯有果断开工，才能战胜心魔
    //默认导入了类import java.lang.*，包含System,Object,String,Math等

    //添加override注解

    public int num = 3;
/*
    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Demo){
           Demo d = (Demo) obj;
           return this.num == d.num;
        }
        return false;
    }
    */
    //方法abstract，返回值前面加abstract关键字
    public abstract void printNum();

    public static void main(String[] args) {
       // System.out.println("hello world");


        //File,String,Date及包装类,是比较类型及内容,不用考虑引用的是否是同一个类型

        //equals方法只能比较引用是否相同
        //==可比较引用类型和基本类型

        String str = "hello,world";

        String str2 = "hello,worlds";

        String str3 = "hello,worlds";

        System.out.println(str);
        System.out.println(str.equals(str2));
        System.out.println(str == str2);

        System.out.println("str3与str2 == 比较:"+ (str3 == str2) + "abc");
        System.out.println("str3与str2 equals 方法比较:"+ (str3.equals(str2)));

        System.out.println(str.toString());

        System.out.println(123);


        //Object 类中实现的 toString() 方法是返回当前对象的类型和内存地址信息
        //但在一些子类（如 String、Date 等）中进行了重写，也可以根据需要在用户自定义类型中重写 toString() 方法，以返回更适用的信息。

       // 除显式调用对象的 toString() 方法外，在进行 String 与其它类型数据的连接操作时，会自动调用 toString() 方法。

        //匿名类

        Demo d = new Demo() {
            @Override
            public void printNum(){
                System.out.println(this.num);
            }
        };

        //类名为charactor.Demo$1
        System.out.println(d);

         //本地类可以理解为有名字的匿名类
        //与内部类不一样的是，内部类必须声明在成员的位置，即与属性和方法平等的位置。
        //本地类和匿名类一样，直接声明在代码块里面，可以是主方法，for循环里等等地方
        //外部变量默认加final
        int num = 5;

        //本地类

        class SomeDemo extends Demo{
            @Override
            public void printNum() {
                System.out.println(this.num);
            }
        }
        SomeDemo sd = new SomeDemo();
        System.out.println(sd);
        System.out.println(sd.num);

        System.out.println(num);

    }



}

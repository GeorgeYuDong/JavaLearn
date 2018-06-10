package character;

/**
 * @Author:YuDong
 * @Description:
 * @Date:created in 9:27 2018/6/8
 * @Modified By:
 */

public class TestChar {
    public static void main(String[] args) {
        //字符类型用关键字char
        //只能用单引号，哪怕是一个字符
        //
        char c = '总';
        System.out.println(c);

        //自动装箱
        Character c1 = c;
        System.out.println(c1);

        //自动拆箱
        c = c1;
        System.out.println(c);

        //重点是理解面向对象的设计理念,这是精髓
        //面向对象，是把每个类自己封装,自己定义里面的内容,做到可维护，可靠性，安全性
        //继承:是为了复用,继承之后，本质是每个对象各管各家，各管爹妈
        //多态:是提高了灵活性，依赖于继承，由基类提供接口，子类针对接口，实现不同方法
        //在使用过程中，使用到子类对象的话，如果需要调用到子类方法，可以通过基类动态调用
        //就好像C语言的函数指针，如果是子类对象，把子类对象的函数指针赋值给基类，基类调用子类对象的方法
        //C语言的函数指针，也是一个变量，本质上也是为了重用
        //可以通过基类，来实现软件架构。应实际需求产生，看实际应用，面向对象的开发，我还需要学习
        //C++使用虚函数


        //数组创建,不用new，直接初始化
        int[] b = {1,2,3};
        for (int each: b
             ) {
            System.out.println(each);
        }

        //数组创建，new int后面如果初始化，指定具体内容，就不设置具体长度
        int[] a = new int[]{11,22,33,44};
        System.out.println(a.length);

        //分配长度是5的数组，但不初始化
        int[] d = new int[5];

        d[0] = 55;
        System.out.println(d[0]);
        System.out.println(d[1]);
        System.out.println(Character.isDigit('a'));

        //数组的复制，等等再看
        //Array类，数组的封装类，这个也要看

        // valueof 返回的Character实例

        System.out.println(Character.valueOf(c));





    }
}

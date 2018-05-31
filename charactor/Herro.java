package charactor;

/**
 * @Author:YuDong
 * @Description:
 * @Date:created in 9:42 2018/5/31
 * @Modified By:
 */

public abstract class Herro {
    //没有body,抽象方法，没有实现
    //有抽象方法，该类就必须声明为抽象类
    public abstract void gameWin();

    public void chrisPaul(){

    }

   /* 抽象类与接口的区别
    区别1：
    子类只能继承一个抽象类，不能继承多个
    子类可以实现多个接口
    区别2：
    抽象类可以定义
    public,protected,package,private
    静态和非静态属性
    final和非final属性
    但是接口中声明的属性，只能是
    public
    静态
    final的
    即便没有显式的声明*/
    //注: 抽象类和接口都可以有实体方法。 接口中的实体方法，叫做默认方法
    public static void main(String[] args) {
      //  Herro h;
        //抽象类不能直接被实例化
       // h = new Herro();
    }
}

package charactor;

/**
 * @Author:YuDong
 * @Description:
 * @Date:created in 14:39 2018/5/29
 * @Modified By:
 */

public class GiantDragon {
    //私有化构造方法,使得无法在外部通过new进行实例化
    //注释与方法或属性隔一行，就没有破浪线

    private GiantDragon(){
    }
    //饿汉模式
    //实例化一个类属性,指向一个实例化对象，因为是类属性,所以只有一个
    //单例模式，无论如何都会创建一个

    private static GiantDragon instance = new GiantDragon();

    //懒汉模式

    private static GiantDragon in;

    //返回一个类属性实例

    public static GiantDragon getInstance(){
        return instance;
    }

    //懒汉模式,与饿汉模式不一样在于，类引用先是null.在调用方法时,判断是否已有对象实例，没有创建。

    public static GiantDragon getIn(){
        if (null == in){
            in = new GiantDragon();
        }
        return in;
    }

    public static void main(String[] args){
        GiantDragon g1 = GiantDragon.getInstance();
        GiantDragon g2 = GiantDragon.getInstance();
        GiantDragon g3 = GiantDragon.getInstance();

        System.out.println("饿汉模式");

        System.out.println(g1 == g2);
        System.out.println(g1 == g3);
        System.out.println(g2 == g3);

        System.out.println("懒汉模式");

        GiantDragon g4 = GiantDragon.getIn();
        GiantDragon g5 = GiantDragon.getIn();
        GiantDragon g6 = GiantDragon.getIn();

        System.out.println(g4 == g5);
        System.out.println(g5 == g6);
        System.out.println(g6 == g4);
        System.out.println(g6 == g4);
    }
}

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
    }
}

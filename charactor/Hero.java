package charactor;

import property.Item;
import property.LifePotion;
import property.MagicPotion;

/**
 * @Author:YuDong
 * @Description:
 * @Date:created in 11:29 2018/5/29
 * @Modified By:
 */

public class Hero extends Object {
    //血量
    private float hp;
    //伤害
    private int damage;
    private int id;

    static String copyright;

    static {
        System.out.println("初始化 copyright");
        copyright = "版权由Riot Games公司所有";
        System.out.println(copyright);
    }

    //类属性 static
    //类方法 static 不与具体对象相关,可以使用类方法，不需要依赖任何实例


    //private 自身可以访问
    //不写，默认同包，自身可以访问，同包子类可以继承,不同包子类不能继承.package,friendly,default,同包可以访问，不同包不能访问
    //protect,其他类不能访问,同包不同包子类都可以继承,但不同包类不能访问.与默认的修饰符区别在于可以被不同包子类继承
    //public没有限制


    //访问控制符使用原则
    // 1. 属性通常使用private封装起来
    // 2. 方法一般使用public用于被调用
    // 3. 会被子类继承的方法，通常使用protected
    // 4. package用的不多，一般新手会用package,因为还不知道有修饰符这个东西

    //存在有参构造方法时，无参的构造方法,必须显式的声明

    //带一个参数的构造方法
    public void setId(int id){
        this.id = id;
    }
    //带一个参数的构造方法
    public Hero(String heroname){
        System.out.println("一个参数的构造方法");
        this.name = heroname;
    }

    //打印内存中的虚拟地址
    public void showAddressInMemory(){
        System.out.println("打印this看到的虚拟地址："+this);
    }

    //赋值与引用的差异在于，赋值指的是变量本身.引用则不是，
    //引用是引用，对象是对象.分开的.就好像指针与指针所指向的对象的关系

    //带两个参数的构造方法
    public Hero(String heroname,float herohp){
        //调用一个参数的构造方法
       // this(heroname);
        this.name = heroname;
        System.out.println("两个参数的构造方法");
        this.hp = herohp;
    }

    //通过this访问属性
    public void setName(String name){
        //name代表的是参数name
        //this.name代表的是属性name
        this.name = name;
    }

    public String name = Hero.getName("属性声明") ;

    //最后才是构造方法中的初始化
    public Hero()
    {
        name = Hero.getName("构造方法");
    }
   /* {
        name = Hero.getName("初始化块");
    }*/

    public static String getName(String pos){
        String result= "name "+pos;
    //    System.out.println(result);
        return result;
    }

    //类方法，静态方法
    //通过类就可以直接调用
    public static void battleWin(){
        System.out.println("hero battle win");
    }

    public void useItem(Item i){
        i.effect();
    }

    public static void main(String[] args) {
        Hero garen = new Hero();
        garen.name = "盖伦";

        LifePotion lp = new LifePotion();
        MagicPotion mp = new MagicPotion();

        //多态:依赖于继承，依赖于重写.
        garen.useItem(lp);
        garen.useItem(mp);

        Hero.battleWin();

        //还有一个隐藏，复写类方法

        //关于super
        /*当创建一个子类对象时，会自动先调用父类的构造方法。
        如果父类无构造方法，系统会默认一个无参的构造方法。
        如果父类有两个构造方法，一个有参 一个无参 ，系统会默认调用无参的构造方法 。此时如果你想调用有参的构造方法必须使用super关键字
        如果父类只有一个有参构造方法时，在子类中创建对象时，必须用super调用有参的父类构造方法。否则报错
        原因：有了有参构造方法系统不会再默认给出无参构造方法，而不用super关键字调用有参构造方法时，是默认调用父类无参构造方法的。而此时父类没有无参构造方法，系统也不会自动补一个*/

        //类对象，是对类本身的一种描述，一种抽象,一个结构体
        //分为属性，方法,记录元数据的一个对象

        //超类Object说明

       // toString()的意思是返回当前对象的字符串表达
        System.out.println(garen.toString());
        System.out.println(garen);

        //itar for循环快捷键
        for (int i = 0; i < args.length; i++) {
            String arg = args[i];

        }
        Hero hero = new Hero("英雄");
        System.out.println(hero.name);
        Hero teemo = new Hero("提莫", 383);
        System.out.println(teemo.name);
        System.out.println("hero的虚拟地址");
        hero.showAddressInMemory();
        System.out.println("teemo的虚拟地址");
        teemo.showAddressInMemory();
        teemo.setId(123);
        System.out.println("abc");
        System.out.println(teemo.id);
    }
}

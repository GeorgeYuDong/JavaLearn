package charactor;

import property.Item;
import property.LifePotion;
import property.MagicPotion;

import java.io.Serializable;

/**
 * @Author:YuDong
 * @Description:
 * @Date:created in 11:29 2018/5/29
 * @Modified By:
 */

public class Hero extends Object implements Serializable{

    //表示这个类当前的版本，如果有了变化，比如新设计了属性，就应该修改这个版本号

    private static final long serialVersionUID = 1L;

    //血量

    public float hp;
    //伤害

    public int damage;

    private int id;

    static String copyright;

    static {
        System.out.println("初始化 copyright");
        copyright = "版权由Riot Games公司所有";
        System.out.println(copyright);
    }

    //快捷键说明：
    //ctrl+1,切换当前窗口和项目窗口，创建类快捷键alt+Insert
    //alt+Insert：在文件窗口，可以快速创建set,get方法，构造方法等
    //alt+~,commit窗口，提交快捷键



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

    //自Java9已不在被使用,过时了deprecated

    @Override
    public void finalize(){
        System.out.println("这个英雄正在被回收");
    }
/*
    @Override
    public boolean equals(Object o){
        if(o instanceof Hero){
            Hero h = (Hero) o;
            return this.hp == h.hp;
        }
        return false;
    }
    */

    // 非静态内部类，只有一个外部类对象存在的时候，才有意义
    // 战斗成绩只有在一个英雄对象存在的时候才有意义

    class BattleScore {

        int kill;

        public void legendary() {
            if (kill >= 8) {
                System.out.println(name + "超神！");
            } else {
                System.out.println(name + "尚未超神！");
            }
        }
    }
    //静态内部类

    /*在一个类里面声明一个静态内部类
    比如敌方水晶，当敌方水晶没有血的时候，己方所有英雄都取得胜利，而不只是某一个具体的英雄取得胜利。
    与非静态内部类不同，静态内部类水晶类的实例化 不需要一个外部类的实例为基础，可以直接实例化
    语法：new 外部类.静态内部类();
    因为没有一个外部类的实例，所以在静态内部类里面不可以访问外部类的实例属性和方法
    除了可以访问外部类的私有静态成员外，静态内部类和普通类没什么大的区别*/

    static class EnemyCrystal{
        int hp=5000;

        //如果水晶的血量为0，则宣布胜利

        public void checkIfVictory(){

            if(hp==5000){
                Hero.battleWin();

                //静态内部类不能直接访问外部类的对象属性
             //   System.out.println(name + " win this game");
            }
        }
    }

    @Override
    public String toString(){
       return this.name;
    }

    public static void main(String[] args) {

        Hero garen = new Hero();
        garen.name = "盖伦";

        // 实例化内部类
        // BattleScore对象只有在一个英雄对象存在的时候才有意义
        // 所以其实例化必须建立在一个外部类对象的基础之上
        BattleScore score = garen.new BattleScore();
        score.kill = 9;
        score.legendary();

        //实例化静态内部类
        Hero.EnemyCrystal crystal = new Hero.EnemyCrystal();
        crystal.checkIfVictory();

        System.out.println("hello");


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

        Hero hero = new Hero("英雄");
        System.out.println(hero.name);
        Hero teemo = new Hero("提莫", 383);
        System.out.println(teemo.name);
        System.out.println("hero的虚拟地址");
        hero.showAddressInMemory();
        System.out.println("teemo的虚拟地址");
        teemo.showAddressInMemory();
        teemo.setId(123);
        System.out.println(teemo.id);

        //只有一个引用
        /*
        Hero h;
        for (int i = 0; i < 100000; i++) {
            //不断生成新的对象
            //每创建一个对象，前一个对象，就没有引用指向了
            //那些对象，就满足垃圾回收的条件
            //当，垃圾堆积的比较多的时候，就会触发垃圾回收
            //一旦这个对象被回收，它的finalize()方法就会被调用
            h = new Hero();
        }
        */

        Hero h1 = new Hero();
        h1.hp = 300;
        //子类对象类型默认转换成父类引用类型
        Hero h2 = new ADHero();
        h2.hp = 400;
        Hero h3 = new APHero();
        h3.hp = 300;

        System.out.println("equals用法");
        System.out.println(h1.equals(h2));
        System.out.println(h1.equals(h3));
        System.out.println(h1 == h3);

        ADHero ad = new ADHero();
        APHero ap = new APHero();

        h1 = ad;
        h2 = ap;
        System.out.println("instanceof 用法");
        /*
        System.out.println(h1 instanceof APHero);
        System.out.println(h1 instanceof ADHero);
        System.out.println(h2 instanceof ADHero);
        System.out.println(h2 instanceof APHero);
        System.out.println(h1 instanceof Hero);
        System.out.println(h2 instanceof Hero);*/

        //向上转换,ad转换成接口adi,ad中含有adi的实现，一定可以转换成功
        AD adi = ad;


        Hero h4 = new Hero();

        ADHero add = new ADHero();

        //物理攻击英雄是英雄，所以不需要强制转换,物理攻击英雄包含了英雄，是英雄的类型之一，所以可以指向物理攻击英雄对象
        //普通英雄是物理攻击英雄吗，是物理攻击英雄类型吗，未必，所以必须强制转换
        //这里=不是赋值,是指向,不要用赋值思想，要用两边类型是否一致的思想
        //add = (ADHero)h4;


        //instanceof,valueof这两种用法也要看一下

        //对象转型
        /*首先，明确引用类型与对象类型的概念
        在这个例子里，有一个对象 new ADHero(), 同时也有一个引用ad
        对象是有类型的， 是ADHero
        引用也是有类型的，是ADHero
        通常情况下，引用类型和对象类型是一样的*/
        //到底能否转换成功? 教大家一个很简单的判别办法
       // 把右边的当做左边来用，看说得通不
        //所有的子类转换为父类，都是说得通的,比如AD英雄是英雄，所以英雄引用可以指向AD英雄
        //没有继承关系的两个类互相转换，一定会失败
        //实现类转换成接口（向上转换）是可行的

        //final用法
        //修饰类，不能被继承
        //修饰方法，不能被重写
        //修饰引用，引用只有一次指向对象的机会
        //修饰static常量

        //接口与继承章节里面，最后一章是UML图，这个也要好好学，暂时不看


    }
}

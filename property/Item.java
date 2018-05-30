package property;


/**
 * @Author:YuDong
 * @Description:
 * @Date:created in 14:08 2018/5/29
 * @Modified By:
 */

public class Item {
    String name;
    int price;

    public void buy(){
        System.out.println("购买");
    }
    public void effect() {
        System.out.println("物品使用后，可以有效果");
    }

    public static void main(String[] args) {
        //重写测试
        Item i = new Item();
        i.effect();

        System.out.println("lifepotion");
        LifePotion lp = new LifePotion();
        lp.effect();

        //多态测试
        //多态条件：1.父类引用指向子类对象 2.调用的方法有重写
        Item i1 = new LifePotion();
        Item i2 = new MagicPotion();
        System.out.print("i1是Item类型，执行effect打印:");
        i1.effect();
        System.out.print("i2也是Item类型，执行effect打印:");
        i2.effect();
    }
}

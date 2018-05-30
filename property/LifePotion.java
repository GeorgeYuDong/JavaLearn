package property;

/**
 * @Author:YuDong
 * @Description:
 * @Date:created in 19:34 2018/5/29
 * @Modified By:
 */

public class LifePotion extends Item {
    //方法可以重写,使得继承才有意义
    @Override
    public void effect() {
        //sout简写
        System.out.println("血瓶使用后，可以回血");
    }
}

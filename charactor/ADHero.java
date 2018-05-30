package charactor;

/**
 * @Author:YuDong
 * @Description:
 * @Date:created in 14:53 2018/5/29
 * @Modified By:
 */
public class ADHero extends Hero implements AD{
    public void attack() {
        System.out.println(name + " 进行了一次攻击 ，但是不确定打中谁了");
    }

    public void attack(Hero h1) {
        System.out.println(name + "对" + h1.name + "进行了一次攻击 ");
    }

    //ALT+Insert快捷键，快速实现接口方法
    @Override
    public void physicAttack() {
        System.out.println("物理攻击");
    }
    /*
            public void attack(Hero h1, Hero h2) {
                System.out.println(name + "同时对" + h1.name + "和" + h2.name + "进行了攻击 ");
            }
            */

    // 可变数量的参数
    public void attack(Hero... heros) {
        for (int i = 0; i < heros.length; i++) {
            System.out.println(name + " 攻击了 " + heros[i].name);

        }
    }

    //类方法，静态方法
    //通过类就可以直接调用
    public static void battleWin(){
        System.out.println("ad hero battle win");
    }

    public static void main(String[] args) {
        ADHero bh = new ADHero();
        bh.name = "赏金猎人";

        Hero h1 = new Hero();
        h1.name = "盖伦";
        Hero h2 = new Hero();
        h2.name = "提莫";

        bh.attack(h1);
        bh.attack(h1, h2);

        //静态方法，由调用者类型决定
        ADHero.battleWin();
        Hero.battleWin();
    }
}

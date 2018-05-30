package charactor;

/**
 * @Author:YuDong
 * @Description:
 * @Date:created in 19:11 2018/5/29
 * @Modified By:
 */
public class APHero extends Hero implements AP {
    @Override
    public void magicAttack() {
        System.out.println("进行魔法攻击");
    }

}

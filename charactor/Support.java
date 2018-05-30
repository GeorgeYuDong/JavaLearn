package charactor;

/**
 * @Author:YuDong
 * @Description:
 * @Date:created in 19:20 2018/5/29
 * @Modified By:
 */

public class Support extends Hero implements Healer {
    @Override
    public void heal() {
        System.out.println(name+" 加了一口血");
    }
}

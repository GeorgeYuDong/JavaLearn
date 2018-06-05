package charactor;

/**
 * @Author:YuDong
 * @Description:
 * @Date:created in 16:33 2018/6/5
 * @Modified By:
 */

public interface Mortal {

    //默认是public,而且必须是public

    void die();


    //方法前面加default，默认方法，接口里面也可以有实现体了

    default public void revive(){
        System.out.println("本英雄又复活了");
    }
}

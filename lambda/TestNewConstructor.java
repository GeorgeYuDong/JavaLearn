package lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

/**
 * @Author:YuDong
 * @Description:
 * @Date:created in 15:54 2018/6/28
 * @Modified By:
 */

public class TestNewConstructor {
    public static void main(String[] args) {
        Supplier<List> s = new Supplier<List>() {
            @Override
            public List get() {
                return new ArrayList();
            }
        };

        //匿名类
        List list1 = getList(s);

        //Lambda表达式
        List list2 = getList(()->new ArrayList());

        //引用构造器
        List list3 = getList(ArrayList::new);

    }

    public static List getList(Supplier<List> s){
        return s.get();
    }

}

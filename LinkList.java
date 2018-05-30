import java.util.LinkedList;

/**
 * @Author:YuDong
 * @Description:
 * @Date:created in 17:11 2017/11/29
 * @Modified By:
 */

public class LinkList {
    public static void main(String[] args) {
        LinkedList List = new LinkedList();
        List.add("1");
        List.add("2");
        List.add("3");
        List.add("4");
        List.add("5");
        List.add("2");
        System.out.println("元素 2 第一次出现的位置：" + List.indexOf("2"));
        System.out.println("元素 2 最后一次出现的位置："+ List.lastIndexOf("2"));
    }
}

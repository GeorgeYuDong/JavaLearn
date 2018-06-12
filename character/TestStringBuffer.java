package character;

/**
 * @Author:YuDong
 * @Description:
 * @Date:created in 15:45 2018/6/12
 * @Modified By:
 */

public class TestStringBuffer {
    public static void main(String[] args) {
        String str = "let there";
        //可变长度字符串
        StringBuffer sb = new StringBuffer(str);
        System.out.println(sb.capacity());

        sb.append(", be a light");
        System.out.println(sb);
        //左闭右开删除
        sb.delete(1,4);
        System.out.println(sb);

        System.out.println(sb.capacity());
        //从下标1开始
        sb.insert(1,"aa");
        System.out.println(sb);

        //反转
        sb.reverse();
        System.out.println(sb);

        System.out.println(sb.length());
        System.out.println(sb.capacity());

        sb.insert(20, "twenty");
        System.out.println(sb.length());
        System.out.println(sb.capacity());


    }
}

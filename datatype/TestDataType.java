package datatype;

/**
 * @Author:YuDong
 * @Description:
 * @Date:created in 18:40 2018/5/29
 * @Modified By:
 */

public class TestDataType {
    public static void main(String[] args) {
        //char 只能存放一个字符，超过一个字符就会产生编译错误
        String c2 = "中国";
        //报错
        String c3 = "ab";
        //报错

        char c = 'A';

        switch (c){
            case 'A':
            case 'B':
            case 'C':
                System.out.println("A-Z");break;
            default:
                System.out.println("b");break;

        }

    }
}

package stream;

import java.util.Scanner;

/**
 * @Author:YuDong
 * @Description:
 * @Date:created in 11:56 2018/6/25
 * @Modified By:
 */

public class TestSystemInStream {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        while(true){
            String line = s.nextLine();
            System.out.println(line);
        }

    }
}

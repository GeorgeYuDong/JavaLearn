package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @Author:YuDong
 * @Description:
 * @Date:created in 15:22 2018/5/29
 * @Modified By:
 */

public class TryWithResource {
    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try (
                Connection c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/how2java?characterEncoding=UTF-8",
                        "root", "admin");
                Statement s = c.createStatement();
        )
        {
            String sql = "insert into hero values(null," + "'提莫'" + "," + 314.0f + "," + 50 + ")";
            s.execute(sql);
            System.out.println("插入成功");

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}

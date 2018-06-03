package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TestJDDBC {
    public static void main(String[] args) {
        Connection c = null;
        Statement s = null;
        //初始化驱动
        try {
            //驱动类com.mysql.cj.jdbc.Driver
            //就在 mysql-connector-java-8.0.11-bin.jar中
            //如果忘记了第一个步骤的导包，就会抛出ClassNotFoundException
            Class.forName("com.mysql.cj.jdbc.Driver");

            System.out.println("数据库驱动加载成功 ！");

            // 建立与数据库的Connection连接
            // 这里需要提供：
            // 数据库所处于的ip:127.0.0.1 (本机)
            // 数据库的端口号： 3306 （mysql专用端口号）
            // 数据库名称 how2java
            // 编码方式 UTF-8
            // 账号 root
            // 密码 mysql-8.0.11为yd4665071

            c = DriverManager.getConnection(
                            "jdbc:mysql://localhost:3306/how2java?characterEncoding=utf8&useSSL=false",
                            "root", "yd4665071");

            System.out.println("连接成功，获取连接对象： " + c);

            // 注意：使用的是 java.sql.Statement
            // 不要不小心使用到： com.mysql.jdbc.Statement;
            s = c.createStatement();

            System.out.println("获取Statement对象： " + s);

            // 准备sql语句
            // 注意： 字符串要用单引号'
            String sql = "insert into hero values(null," + "'提莫'" + "," + 313.0f + "," + 50 + ")";
            s.execute(sql);

            System.out.println("执行插入语句成功");

        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}

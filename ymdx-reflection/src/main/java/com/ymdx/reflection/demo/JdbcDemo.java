package com.ymdx.reflection.demo;

import java.sql.*;

/**
 * @ClassName: JdbcDemo
 * @Description: 反射应用之Jdbc连接数据库示例
 * @Author: ymdx
 * @Email: y_m_d_x@163.com
 * @Date: 2019-12-25 17:13
 * @Version: 1.0
 **/
public class JdbcDemo {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // 1.加载驱动
        Class.forName("com.mysql.jdbc.Driver");
        // 2.获取连接
        Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1/ymdx_test", "root", "123456");
        // 3.创建sql预处理对象
        PreparedStatement ps = conn.prepareStatement("insert into t_user(code, name, password) values (?, ?, ?)");
        // 4.传递sql参数，注意下标从1开始
        ps.setString(1, "test_001");
        ps.setString(2, "test_001");
        ps.setString(3, "test_001");
        // 5.执行
        ps.executeUpdate();
        // 6.获取查询结果集对象
        ResultSet rs = ps.executeQuery("select * from t_user");
        while (rs.next()){
            System.out.println("id=" + rs.getLong(1) + ";code=" + rs.getString(2) + ";name=" + rs.getString(3) + ";password=" + rs.getString(4));
        }
        // 7.关闭连接资源
        rs.close();
        ps.close();
        conn.close();
    }

}

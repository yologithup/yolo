package JDBC练习;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author yolo
 * @date 2019/12/26-20:34
 */
public class Demo01 {
    public static void main(String[] args) {
        Connection connection=null;
        Statement statement=null;
        //注册qudo
        try {
            Class.forName("com.mysql.jdbc.Driver");
            //定义sql语句
            String sql="create table student(id int,grade int)";//创建表
            //获得数据库连接对象
             connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3305/students", "root", "mmwan980815");
             statement = connection.createStatement();
            int count=statement.executeUpdate(sql);
            System.out.println(count);
            if(count>0){
                System.out.println("添加成功，影响"+count+"行");
            }else {
                System.out.println("添加失败");
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            if(statement!=null){
                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if(connection!=null){
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}

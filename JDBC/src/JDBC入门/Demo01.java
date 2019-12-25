package JDBC入门;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author yolo
 * @date 2019/12/23-19:04
 * JDBC：Java语言操作数据库（Java　Database　connectivity--java数据库连接）
 * 本质：
 *      官方定义的一套操作关系型数据库的规则，即接口。各个数据库厂商实现这个接口，提供数据库驱动jar包，我们可以使用这套接口（JDBC）进行编程，真更的执行代码
 * 快速入门：
 *   步骤：
 *      1.导入驱动jar包
 *          1.复制jar包到项目目录lib下，于src同级
 *          2.右击
 *      2.注册驱动
 *      3.获取数据库连接对象Connection
 *      4.定义SQL
 *      5.执行SQL语句的对象Staement
 *      6.执行SQL，接收返回值
 *      7.处理结果
 *      8.释放资源
 *
 *
 *
 */
public class Demo01 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //1.导入jar包
        //2.注册驱动
        Class.forName("com.mysql.jdbc.Driver");
        //3.获取数据库连接对象Connection
        Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3305/students", "root", "mmwan980815");
        //4.定义SQL语句
        String sql="update student set 姓名='小米' where 学号=1 ";
        //5.获取执行SQL的对象Statement
        Statement statement = connection.createStatement();
        //6.执行sql
        int count=statement.executeUpdate(sql);
        //7.处理结果
        System.out.println(count);
        //8.释放资源
        connection.close();
    }
}

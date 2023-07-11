package project;

import java.sql.*;

public class DBUtil {

    public static Connection getDBConnection() {
        Connection conn = null;
        try {
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "localhost");
        } catch (SQLException e) {
            System.out.println(e);
        }
        return conn;
    }

}

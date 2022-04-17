package JDBC.JDBCimtiaz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCcurdUpdate {
    public static void main(String[] args) {
        String url="jdbc:mysql://127.0.0.1:3306/employees_database";
        int rowsAffected;
        try {
            Connection conn = DriverManager.getConnection(url, "root", "Mo123456789");
            Statement statement= conn.createStatement();

            rowsAffected =statement.executeUpdate(
                    "UPDATE employees_tbl SET salary=5500 WHERE id= 700;");
            System.out.println("Execute a Insert statement - rows affected : " +rowsAffected);
        } catch (SQLException e) {
            System.out.println("Error while Update");
        }


    }
}

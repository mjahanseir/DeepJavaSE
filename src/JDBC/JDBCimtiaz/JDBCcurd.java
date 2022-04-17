package JDBC.JDBCimtiaz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCcurd {
    public static void main(String[] args) {
        String url="jdbc:mysql://127.0.0.1:3306/employees_database";
        int rowsAffected;
        try {
            //Establish Connection Object
            Connection conn = DriverManager.getConnection(url, "root", "Mo123456789");

            //CREATE statement object to send to the database
            Statement statement= conn.createStatement();

            //SEND query to DB -> EXECUTE the statement
//            rowsAffected =statement.executeUpdate("insert into employees_tbl " +
//                    "(id, name, dept, salary) " +
//                    "value (800, \"John\", \"Sales\", 5500);");

            rowsAffected =statement.executeUpdate("insert into employees_tbl " +
                    "(id, name, dept, salary) " +
                    "value (900, \"Robert\", \"Sales\", 5100);");
            //Process the result
            System.out.println("Execute an Insert statement - rows affected : " +rowsAffected);
        } catch (SQLException e) {
            System.out.println("Error while insertion");
        }


    }
}

package JDBC.JDBCimtiaz;

import java.sql.*;

public class JDBCdemo {
    public static void main(String[] args) {
        String url="jdbc:mysql://127.0.0.1:3306/employees_database";
        try {
            //Establish Connection Object
            Connection conn = DriverManager.getConnection(url, "root", "Mo123456789");

            //CREATE statement object to send to the database
            Statement statement= conn.createStatement();

            //SEND query to DB -> EXECUTE the statement
            ResultSet resultSet=statement.executeQuery("select * from employees_tbl");
            //Process the result
            while(resultSet.next()){
                System.out.println(resultSet.getString("dept"));
                System.out.println(resultSet.getString("salary"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
}

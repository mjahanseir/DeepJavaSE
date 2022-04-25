package JDBC.Review;

import java.sql.*;

public class C1_JDBC {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
       // Class.forName("com.mysql.jdbc.Driver");
       try( Connection connection= DriverManager.getConnection("jdbc:mysql://localhost/sakila", "root", "Mo123456789")) {
           Statement statement = connection.createStatement();
           ResultSet resultSet = statement.executeQuery("SELECT * FROM actor");

           while (resultSet.next()) {
               System.out.println(resultSet.getString(1) + "\t" +
                       resultSet.getString(2) + "\t" +
                       resultSet.getString(3) + "\t" + resultSet.getString(4));
           }
       }catch (SQLException sqlException){
           sqlException.getMessage();
       }
    }
}

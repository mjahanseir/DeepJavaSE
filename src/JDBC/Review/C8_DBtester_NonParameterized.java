package JDBC.Review;

import java.sql.*;

public class C8_DBtester_NonParameterized {
    public static void main(String[] args) {
        //1
        try(Connection connection= DriverManager.getConnection(
                "jdbc:mysql://localhost/sakila", "root", "Mo123456789")) {
            //2
            Statement statement = connection.createStatement();
            //3
            ResultSet resultSet= statement.executeQuery("select * from actor");
            //4
            while (resultSet.next()){
                System.out.println(resultSet.getString(1) + "\t"+ resultSet.getString(3) + "\t"+resultSet.getString(3) + "\t"+ resultSet.getString(4) + "\t");
            }
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
    }
}

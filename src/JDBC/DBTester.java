package JDBC;

import java.sql.*;

public class DBTester {
    public static void main(String[] args) throws ClassNotFoundException {
/**
 **************************JBDC setup:

 1- create a connection:
        Connection conn = DriverManager.getConnection(....... );

 2- Create a Statement
        Statement stat = conn.createStatement()

 3- Create a ResultSet
        ResultSet resultSet = stat.executeQuery ( );

 **/

        //////////////////////////////////////// 1
        // Load the JDBC driver
        // Class.forName("com.mysql.jdbc.Driver");

        //////////////////////////////////////// 2
        // Establish a connection
        //                                                         ome: jdbc:mysql://localhost/sakila" , username , Password
        try(Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/sakila","root","Mo123456789" )) {
            //////////////////////////////////////// 3
            // Create a statement
            Statement statement = connection.createStatement();

            //////////////////////////////////////// 4
            // Execute a statement
            ResultSet results= statement.executeQuery ("select * from actor");

            //////////////////////////////////////// 5
            results.next();
            System.out.println(results.getString(1) + "  " +
                                results.getString(2) + "  " +
                                results.getString(3));

            //////////////////////////////////////// 5
            // Iterate through the result and print
//            while (results.next())
//                System.out.println(results.getString(1) + "\t" + results.getString(2) + "\t" + results.getString(3) +  "\t" + results.getString(4) );

            //////////////////////////////////////// 6

            PreparedStatement preparedStatement= connection.prepareStatement("select * from actor where actor_id=?");
            preparedStatement.setString(1,"50");

            ResultSet prepResult= preparedStatement.executeQuery();
            while (results.next()) {
                System.out.println( results.getString(1) + "\t" +
                                    results.getString(2) + "\t" +
                                    results.getString(3) +  "\t" +
                                    results.getString(4) );
            }
        }catch(SQLException sqle) {
            System.out.println(sqle.getMessage());
        }
    }
}


package JDBC;

import java.sql.*;

public class DBTesterPrep {
    public static void main(String[] args) throws ClassNotFoundException {
/**
                             **************************   JBDC setup:  **************************

                             1- create a connection:
                             Connection connection = DriverManager.getConnection(....... );

                             2- Create a Statement
                             Statement statement = connection.createStatement()

                             3- Create a ResultSet
                             ResultSet resultSet = statement.executeQuery ( );

                             **/

        //////////////////////////////////////// 1
        // Load the JDBC driver
        // Class.forName("com.mysql.jdbc.Driver");

        //////////////////////////////////////// 2
        // Establish a connection

        //the connection string to determine the driver
        //                                                         ome: jdbc:mysql://localhost/sakila" , username , Password
        try(Connection connection = DriverManager.getConnection("jdbc:mysql://192.168.75.128/sakila","student","letmein" )) {
            //////////////////////////////////////// 3
            // Create a statement
            // Use the connection object to create a simple statement
            //simple meaning unparametrized.
            Statement statement = connection.createStatement();

            //////////////////////////////////////// 4
            // Execute a statement
            //we then can generate a resultset by calling executeQuery or
            //executeUpdate. We would use the latter if th query is for DDL or Update

            ResultSet results= statement.executeQuery ("select * from actor");

            //////////////////////////////////////// 5
            //// A resultSet stores the result of the query so consists of rows and columns.
            // This means we can iterate through it using a loop, much like we did with files
            // or the scanner.
            // We'll use next() to check if there is a row available to be read, then use
            // get  to read a particular value according to the columns in the results.
            // The columns are determined by the query and what it returns
           while( results.next()) {
               System.out.println(results.getString(1) + " \t" +
                       results.getString(2) + "\t " +
                       results.getString(3) + "\t " +
                       results.getString(4));
           }
            //////////////////////////////////////// 5
            // Iterate through the result and print
//            while (results.next())
//                System.out.println(results.getString(1) + "\t" + results.getString(2) + "\t" + results.getString(3) +  "\t" + results.getString(4) );

            //////////////////////////////////////// 6
            /**
             * 34.5 PreparedStatement
             * PreparedStatement enables you to create parameterized SQL statements.
             *
             Once a connection to a particular database is established, it can be used to send SQL statements
             from your program to the database. The Statement interface is used to execute static SQL
             statements that don’t contain any parameters. The PreparedStatement interface, extending
             Statement, is used to execute a precompiled SQL statement with or without parameters.
             Since the SQL statements are precompiled, they are efficient for repeated executions.
             A PreparedStatement object is created using the prepareStatement method in the
             Connection interface. For example, the following code creates a PreparedStatement for
             an SQL insert statement:
                     PreparedStatement preparedStatement = connection.prepareStatement
                     ("insert into Student (firstName, mi, lastName) " +
                     "values (?, ?, ?)");
             This insert statement has three question marks as placeholders for parameters representing
             values for firstName, mi, and lastName in a record of the Student table.
             As a subinterface of Statement, the PreparedStatement interface inherits all the methods
             defined in Statement. It also provides the methods for setting parameters in the object
             of PreparedStatement. These methods are used to set the values for the parameters before
             executing statements or procedures. In general, the setter methods have the following name
             and signature:
                     setX(int parameterIndex, X value);
             where X is the type of the parameter, and parameterIndex is the index of the parameter
             in the statement. The index starts from 1. For example, the method setString(int
             parameterIndex, String value) sets a String value to the specified parameter.
             The following statements pass the parameters "Jack", "A", and "Ryan" to the placeholders
             for firstName, mi, and lastName in preparedStatement:
                     preparedStatement.setString(1, "Jack");
                     preparedStatement.setString(2, "A");
                     preparedStatement.setString(3, "Ryan");
             After setting the parameters, you can execute the prepared statement by invoking execute-
             Query() for a SELECT statement and executeUpdate() for a DDL or update statement.
             The executeQuery() and executeUpdate() methods are similar to the ones defined
             in the Statement interface except that they don’t have any parameters, because the SQL
             statements are already specified in the prepareStatement method when the object of
             PreparedStatement is created.
             **/



            // If our query is parameterized, we need to use a prepared statement
            // The danger of parameterized queries is SQL injection.
            // This allows malicious entries to be made which can alter a query's function.
            // A  prepared statement separates the query from the parameterso it cannot
            // alter the original query text.'


            int idNum=50;
            String name="DAVE";

            //when using prepared statement, use a ? in place of the parameter in the query. you ca
            //add as many as you need. They are processed in order

            PreparedStatement preparedStatement= connection.prepareStatement("select * from actor where actor_id = ?");
            PreparedStatement preparedStatement2= connection.prepareStatement("select * from actor where actor_id = ? and first_name like ?");

            //  use set_________ to bind the parameter .....  specify what variable gets substituted
            //  where when th db server actually execute the query

            preparedStatement.setString(1,"50");


            preparedStatement2.setInt(1, idNum);
            preparedStatement2.setString(2, name);


            ResultSet prepResult= preparedStatement.executeQuery();
            while (prepResult.next()) {
                System.out.println(results.getString(1) + "\t" +
                        prepResult.getString(2) + "\t" +
                        prepResult.getString(3) +  "\t" +
                        prepResult.getString(4) );
            }

        }catch(SQLException sqle) {
            System.out.println(sqle.getMessage());
        }
    }
}


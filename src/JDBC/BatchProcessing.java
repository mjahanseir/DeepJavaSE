package JDBC;

import java.sql.*;

public class BatchProcessing {
  public static void main(String[] args)  {
    // Establish a connection
    try (Connection connection = DriverManager.getConnection("jdbc:mysql://192.168.75.128/sakila", "student", "letmein")) {


      Statement statement= connection.createStatement();
/*
                          In all the preceding examples, SQL commands are submitted to the database for execution
                          one at a time. This is inefficient for processing a large number of updates. For example,
                          suppose you wanted to insert a thousand rows into a table. Submitting one INSERT command
                          at a time would take nearly a thousand times longer than submitting all the INSERT
                          commands in a batch at once. To improve performance, JDBC introduced the batch update
                          for processing nonselect SQL commands. A batch update consists of a sequence of nonselect
                          SQL commands. These commands are collected in a batch and submitted to the database
                          all together.
                          To use the batch update, you add nonselect commands to a batch using the addBatch
                          method in the Statement interface. After all the SQL commands are added to the batch, use
                          the executeBatch method to submit the batch to the database for execution.
                          For example, the following code adds a create table command, adds two insert statements
                          in a batch, and executes the batch:
                          Statement statement = connection.createStatement();
                          // Add SQL commands to the batch
                          statement.addBatch("create table T (C1 integer, C2 varchar(15))");

                          statement.addBatch("insert into T values (100, 'Smith')");
                          statement.addBatch("insert into T values (200, 'Jones')");
                          // Execute the batch
                          int count[] = statement.executeBatch();
                          The executeBatch() method returns an array of counts, each of which counts the number of
                          rows affected by the SQL command. The first count returns 0 because it is a DDL command.
                          The other counts return 1 because only one row is affected.
      */

      statement.addBatch("create table mytable (id integer, name varchar(20))");
      statement.addBatch("insert into mytable(id, name) values (1, 'Derrick')");
      statement.addBatch("update actor set last_name='CHANGED!' WHERE actor_id=1");

      int count[] = statement.executeBatch();

    } catch (SQLException sqle) {

    }
  }
}
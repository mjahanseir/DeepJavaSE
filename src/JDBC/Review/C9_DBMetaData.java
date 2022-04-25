package JDBC.Review;

import java.sql.*;

public class C9_DBMetaData {
  public static void main(String[] args) {
    // Establish a connection
    //1
    try (Connection connection = DriverManager.getConnection(
            "jdbc:mysql://localhost/sakila", "root", "Mo123456789")) {
      //2
      //Access information about database
      DatabaseMetaData dbMeta = connection.getMetaData();
      System.out.println("Database connected");
      //3
      System.out.println("database URL: " + dbMeta.getURL());
      System.out.println("database username: " + dbMeta.getUserName());

      //Type of database
      System.out.println("database product name: " + dbMeta.getDatabaseProductName());

      System.out.println("database product version: " + dbMeta.getDatabaseProductVersion());

      System.out.println("JDBC driver name: " +dbMeta.getDriverName());
      System.out.println("JDBC driver version: " +dbMeta.getDriverVersion());
      System.out.println("Max # of connections: " +dbMeta.getMaxConnections());
      System.out.println("Max Table Name Length: " +dbMeta.getMaxTableNameLength());
      System.out.println("Max number of Columns In Table: " +dbMeta.getMaxColumnsInTable());

      //4
      Statement statement= connection.createStatement();
      ResultSet results= statement.executeQuery("SELECT * FROM actor");
      ResultSetMetaData resultSetMetaData = results.getMetaData();

      System.out.println("___________________________");

      System.out.println("Columns in results: " + resultSetMetaData.getColumnCount());

      for (int i=1 ; i<=resultSetMetaData.getColumnCount() ; i++){
        System.out.print(resultSetMetaData.getColumnName(i) + "\t");
      }

      System.out.println();


      while(results.next()){
        for (int i=1 ; i<=resultSetMetaData.getColumnCount() ; i++){
          System.out.print(results.getObject(i)+ "\t\t");
        }
        System.out.println();
      }


    } catch (SQLException sqle) {

    }
  }
}
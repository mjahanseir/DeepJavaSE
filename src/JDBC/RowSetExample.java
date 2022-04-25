package JDBC;

import javax.sql.RowSet;
 import com.sun.rowset.*;

 import java.sql.SQLException;

 public class RowSetExample {

    public static void main(String[] args) throws SQLException {

        RowSet rowSet = new JdbcRowSetImpl();

        // Set RowSet properties
        rowSet.setUrl("jdbc:mysql://192.168.75.128/sakila");

        rowSet.setUsername("studet");
        rowSet.setPassword("letmein");


        rowSet.setCommand("SELECT * FROM  actor");
        rowSet.execute();

        rowSet.setCommand("SELECT * FROM  actor WHERE actor_id=?");
        rowSet.setString(1,"10");

        rowSet.absolute(10);
        rowSet.updateString(3, "SMITH");
        rowSet.updateRow();


        System.out.println(rowSet.getString(3));

        // Close the connection
        rowSet.close();
    }
}

package JDBC.Review;

import java.sql.*;

public class C8_DBtester_Parameterized {
    public static void main(String[] args) {
        //1
        try(Connection connection= DriverManager.getConnection(
                "jdbc:mysql://localhost/sakila", "root", "Mo123456789")) {
            //2
            CallableStatement callableStatement= connection.prepareCall("{call movie_report(?,?)}");
             //3
            callableStatement.setString(1,"OPUS ICE");
            //4
            callableStatement.registerOutParameter(2,Types.VARCHAR);
            //5
callableStatement.execute();
            //6
            System.out.println(  callableStatement.getString(2)  );

        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
    }
}

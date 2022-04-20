import java.sql.*;

public class DBCallable {
    public static void main(String[] args) {

//        Step 1
//        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/sakila", "user", "pass")) {
//        } catch (SQLException sqle) {
//            System.out.println(sqle.getMessage());
//        }

        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/sakila","root","Mo123456789")) {

            // use a CallableStatement object to run things like stored procedures
            // the call in bracket will be {call procedure( ? , ? , ?  , ......)}
            //many variables we need.
            CallableStatement callable= connection.prepareCall( "   {    call movie_report( ? , ?)     }   " );

            ///////////////////BINDING PARAMETERS
            callable.setString(1,"OPUS ICE");
            callable.registerOutParameter(2, Types.VARCHAR);
            ///////////////////execute
            callable.execute();

            System.out.println(       callable.getString(2)         );

        } catch (SQLException sqle) {
            System.out.println(sqle.getMessage());
        }
        //call movie report("OPUS ICE",@myvar);


    }
}

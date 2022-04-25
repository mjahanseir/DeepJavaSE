package JDBC.Review;

import java.sql.*;

public class C8_DBtester_Callable {
    public static void main(String[] args) {
        //1
        try(Connection connection= DriverManager.getConnection(
                "jdbc:mysql://localhost/sakila", "root", "Mo123456789")) {
            //2
            PreparedStatement ps = connection.prepareStatement(
                    "select * from actor where actor_id=?");
            PreparedStatement ps2 = connection.prepareStatement(
                    "select * from actor where actor_id=? and first_name like ?");
            //3
            int id=201;
            String name= "DAVE";
            //4
            ps2.setInt(1,id);
            ps2.setString(2,name);
            //5
            ResultSet resultSet=ps2.executeQuery();
            //6
            while (resultSet.next()){
                System.out.println(resultSet.getString(1) + "\t"+
                        resultSet.getString(2) + "\t"+
                        resultSet.getString(3) + "\t"+
                        resultSet.getString(4) + "\t");
            }
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
    }
}

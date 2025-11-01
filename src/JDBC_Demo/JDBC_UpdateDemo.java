package JDBC_Demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBC_UpdateDemo {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mystd", "root", "KusHagra4321abcd1234ktkt..");
            Statement statement = con.createStatement();
            String query = "update student set age=16 where id=4";
            int update = statement.executeUpdate(query);
            System.out.println("Updated " + update + " row");
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}

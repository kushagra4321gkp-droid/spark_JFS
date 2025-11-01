package JDBC_Demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.concurrent.locks.Condition;

public class JDBC_DeleteDemo {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mystd", "root", "KusHagra4321abcd1234ktkt..");
            Statement statement = con.createStatement();
            String query = "Delete from student where id = 1";
            int delete = statement.executeUpdate(query);
            System.out.println("deleted " + delete + " rows");
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}

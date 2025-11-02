package JDBC_Demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Scroll_InsensitiveDemo {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mystd", "root", "KusHagra4321abcd1234ktkt..");
            Statement statement = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            String query = "select * from student";
            ResultSet rs = statement.executeQuery(query);
            System.out.println("fetching data in update mode.....");
            Thread.sleep(20000);
            rs.beforeFirst();
            while (rs.next()){
                System.out.println(rs.getInt("id") + " | " + rs.getString("stdName") +
                        " | " + rs.getInt("age"));
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}

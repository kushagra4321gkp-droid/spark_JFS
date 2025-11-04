package Practice_Sessions;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class practice1_JDBC {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/myDB", "root", "KusHagra4321abcd1234ktkt..");
            Statement statement = con.createStatement();
            //String query = "select * from myData";
            //ResultSet rs = statement.executeQuery(query);
            String query = "insert into myData values(5,'Koniggsegg')";
            int update = statement.executeUpdate(query);
            System.out.println("--------Read Data--------");
            System.out.println("inserted " + update + " rows");
//            while (rs.next()){
//                System.out.println(rs.getInt("id") + " | " + rs.getString("carName"));
//            }
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}

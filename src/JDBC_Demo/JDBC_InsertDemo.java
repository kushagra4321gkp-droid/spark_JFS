package JDBC_Demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBC_InsertDemo {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); //load Driver class
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/mystd", "root", "KusHagra4321abcd1234ktkt..");
            Statement statement = con.createStatement();
            //String query = "select * from student";
            String query = "insert into student (id, stdName, age) values(4, 'savita', 25)";
            //ResultSet rs = statement.executeQuery(query);
            //ResultSet rs = statement.executeUpdate(query); it will throw an error of type conversion
            int insert = statement.executeUpdate(query);
            System.out.println("inserted " + insert + " rows");

//            System.out.println("--------------------Read Data--------------------");
//            while(rs.next()){
//                System.out.println(rs.getInt("id") + " | " +
//                        rs.getString("stdName") + " | " +
//                        rs.getInt("age"));
//            }

        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}

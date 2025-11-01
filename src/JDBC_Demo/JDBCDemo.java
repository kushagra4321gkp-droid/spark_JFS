package JDBC_Demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCDemo {
    //(1)load the Driver class
    //(2)Get Connection form db
    //(3)Create Statement
    //(4)Execute Query

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); //load Driver class
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/mystd", "root", "KusHagra4321abcd1234ktkt..");
            Statement statement = con.createStatement();
            String query = "select * from student";
            ResultSet rs = statement.executeQuery(query);
            System.out.println("--------------------Read Data--------------------");
            while(rs.next()){
                System.out.println(rs.getInt("id") + " | " +
                        rs.getString("stdName") + " | " +
                        rs.getInt("age"));
            }

        }
        catch (Exception e){
            e.printStackTrace();
        }


    }
}

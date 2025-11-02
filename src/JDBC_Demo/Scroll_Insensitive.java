package JDBC_Demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Scroll_Insensitive {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); //load Driver class
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/mystd", "root", "KusHagra4321abcd1234ktkt..");

            Statement statement =
                    con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
                            ResultSet.CONCUR_READ_ONLY);

            String query = "select * from student";
            //Default of ResultSet, means this rs is TYPE_FORWARD_ONLY, CONCURRENT_READ_ONLY
            ResultSet rs = statement.executeQuery(query);


            System.out.println("----------Scroll Insensitive, Read Only----------");
            //Now rs has become powerful.

            rs.last();
            System.out.println(rs.getInt("id"));
            System.out.println(rs.getString("stdName"));

            rs.first();
            System.out.println(rs.getInt("id"));
            System.out.println(rs.getString("stdName"));

            rs.absolute(2);
            System.out.println(rs.getInt("id"));
            System.out.println(rs.getString("stdName"));


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


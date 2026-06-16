
import java.sql.*;
import java.util.Scanner;

public class login {
    public static void main(String[] args) {
        try{
        Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/login",

        "root","sarah@05");
         Scanner sc=new Scanner(System.in);
         Statement stmt=con.createStatement();
         System.out.println("Enter a username");
         String u=sc.nextLine();
          System.out.println("Enter a password");
         String p=sc.nextLine();
         String q="Select * from user where username='sarah05_' OR '1'='1' and password='"+p+"'";
         
         ResultSet rs=stmt.executeQuery(q);
         while(rs.next()){
             System.out.println("Login succesfull");
         }





        }
        catch(Exception e){

        }


    }
}

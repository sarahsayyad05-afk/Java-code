import java.sql.*;
import java.util.Scanner;
import java.util.regex.*;

public class userlogin {
    public static void main(String[] args) {
    
         //Hw: table for user, store username and paswword. 
               // let him login if correct js print succesfull else invalid msg
               //also let him update details after his login

        try {
            Scanner sc = new Scanner(System.in);
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/",
            "root",
            "sarah@05");
            
            Statement s=con.createStatement();

            String q="CREATE DATABASE IF NOT EXISTS login";
            s.executeUpdate(q);
            s.execute("USE login");

            String q1="CREATE TABLE IF NOT EXISTS user(username VARCHAR(20), password VARCHAR(10))";
            s.execute(q1);

            
            System.out.println("----Login----");
            System.out.println("Username:");
            String username=sc.nextLine();
            System.out.println("Password:");
            String pass=sc.nextLine();
            
            String pattern="^[a-zA-Z0-9]+[@_.#]+{8,}";
            Pattern p=Pattern.compile(pattern);
            Matcher m=p.matcher(username);

            if(m.matches() && username.length()>=8 && username.length()<=20 && pass.length()>=8){
                 String q2="Insert into user values(?,?)";
                 PreparedStatement ps=con.prepareStatement(q2);
                 ps.setString(1, username);
                 ps.setString(2,pass);
                 ps.executeUpdate();

                 System.out.println("Login successful!"); 

                 System.out.println("Do you want to update your details? (yes/no)");
                 String choice = sc.nextLine();

                 if(choice.equalsIgnoreCase("yes")){
                System.out.println("Enter new username:");
                String newUsername = sc.nextLine();
                System.out.println("Enter new password:");
                String newPass = sc.nextLine();

                if(m.matches() && newUsername.length()<=20 && newPass.length()>=8){
                    String q3="Update user set username=?, password=? where username=?";
                    PreparedStatement ps1=con.prepareStatement(q3);
                    ps1.setString(1, newUsername);
                    ps1.setString(2, newPass);
                    ps1.setString(3, username);
                    ps1.executeUpdate();

                    System.out.println("Details updated successfully!");
                }
                else{
                    System.out.println("Invalid username or password");
                }
            }

            }
            else{
                System.out.println("Invalid username or password");
            }

           
            con.close();

           
            
            





        }
        catch(Exception e){
            System.out.println(e);
        }


    }
}

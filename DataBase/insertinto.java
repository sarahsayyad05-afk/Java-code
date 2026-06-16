
import java.sql.*;
import java.util.*;

public class insertinto {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try{
Connection con=DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/testdb",
                "root",
                ""
           );
           Statement stmt=con.createStatement();
        String add;
           System.out.println("How many Data you want to insert in table?");
           int n=sc.nextInt();
           sc.nextLine();
           for (int i = 0 ; i < n; i++){
                  System.out.println("Enter "+ (i+1) + " Data");
                  System.out.println("Email: ");
                  String a=sc.nextLine();
                  System.out.println("Phone no: ");
                  int a1=sc.nextInt();
                  sc.nextLine();
                  add="insert into studentinfo values('"+ a+"',"+a1+")";
                  stmt.executeUpdate(add);
           }
           //HW: Validate using regex
           
            System.out.println("Data Entered Succesfuly!");
           

        
            con.close();

        }
        catch(Exception e){
            System.out.println("Error: "+ e);
        }
    }
}

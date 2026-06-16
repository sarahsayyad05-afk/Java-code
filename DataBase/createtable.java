
import java.sql.*;

public class createtable {
   public static void main(String[] args) {
       try {
           Connection con=DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/testdb",
                "root",
                ""
           );
           Statement stmt=con.createStatement();

            String query="CREATE TABLE IF NOT EXISTS studentinfo("+
            "emailid Varchar(30) primary key,"+
            "mno int)";
            stmt.executeUpdate(query);
            System.out.println("Table Created Succesfully");
           
            String add="insert into studentinfo values('xyz@gmail.com', 11423)";
            stmt.executeUpdate(add);
             con.close();


       } catch (Exception e) {
        System.out.println(e);
       }
   }
}

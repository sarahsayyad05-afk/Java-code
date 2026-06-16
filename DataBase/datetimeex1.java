
import java.sql.*;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
public class datetimeex1 {
    public static void main(String[] args) {
        try{

        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb",
            "root",
            "sarah@05"
        );
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter ID:");
        int id=sc.nextInt();
        sc.nextLine();

        System.out.println("Enter a Date(dd/mm/yyyy): ");
        String date=sc.nextLine();

        DateTimeFormatter d= DateTimeFormatter.ofPattern("dd/MM/yyyy");//using datetimeformatter (dtf)
        LocalDate ld=LocalDate.parse(date,d);

       
        String s="Update student set dob=? where Id=?";
        PreparedStatement ps=con.prepareStatement(s);

        
       ps.setDate(1,Date.valueOf(ld));//using dtf

    //    LocalDate current=LocalDate.now(); //ts for setting current date
    //    ps.setDate(1,Date.valueOf(current));


        // ps.setString(1,date.valueOf(date)); //ts line for setting date without datetimeformatter
        ps.setInt(2, id);
        ps.executeUpdate();



        con.close();


    }
    catch(Exception e){
        System.out.println(e);
    }
    }
}

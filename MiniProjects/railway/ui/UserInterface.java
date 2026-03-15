package railway.ui;
import railway.service.RailwaySystem;
import railway.exception.InvalidBookingException;
import java.util.Scanner;
public class UserInterface {
    public static void main(String[] args) {
        RailwaySystem rs=new RailwaySystem();
        Scanner sc=new Scanner(System.in);
     
        System.out.println("Train 0 available seats: 50");
        System.out.println("Train 1 available seats: 40");
        System.out.println("Train 2 available seats: 60");
        System.out.println();
        System.out.println("Enter Passenger Name:");
        String name=sc.nextLine();
        System.out.println("Enter Age:");
        int age=sc.nextInt();
        System.out.println("Enter Train Number:");
        int train=sc.nextInt();
        System.out.println("Enter Seats Required:");
        int seat=sc.nextInt();
        System.out.println();
        
         try{
          if(!(rs.validatePassenger(name,age,train,seat))){

          }
          else{
            rs.bookTicket(train, seat);
           System.out.println( rs.generateTicketID(name,train));
          }
        }
        catch(InvalidBookingException i){
            System.out.println(i);
        }

    }
    
}


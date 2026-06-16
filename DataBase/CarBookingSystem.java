

import java.sql.*;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Admin{
    
    public void adminMenu(){
        System.out.println("1.Add Car");
        System.out.println("2.View All Cars");
        System.out.println("3.Search Car");
        System.out.println("4.Update Car Details");
        System.out.println("5.Delete Car");
        System.out.println("6.View Available Cars");
        System.out.println("7.View Booked Cars");
        System.out.println("8.View All Customers");
        System.out.println("9.View Booking History");
        System.out.println("10.Total number of Cars");
        System.out.println("11.Most Expensive Car");
        System.out.println("12.Cheapest Car");
        System.out.println("13.Average Rental Price");
        System.out.println("14.Cars Within Budget Range");
        System.out.println("15.Cars by Multiple Brands");
        System.out.println("16.Sort Cars by Rental Price");
        System.out.println("17.Most Booked Car Report");
        System.out.println("18.Customer-wise Booking Report");
        System.out.println("19.Revenue Report");
        System.out.println("20.Daily Booking Report");
        System.out.println("21.Car Availability Report");
        System.out.println("22.Logout");
        System.out.println("Enter Your Choice: ");
        

    }
    public void addCar(Scanner sc, Connection con){
        
        try{
            System.out.println("===Add New Car===");
            System.out.println("Enter Car ID: ");
            int carId=sc.nextInt();
            sc.nextLine(); 
            System.out.println("Enter Car Name: ");
            String carName=sc.nextLine();
            System.out.println("Enter Brand: ");
            String brand=sc.nextLine();
            System.out.println("Enter Model: ");
            String model=sc.nextLine();
            System.out.println("Enter Rent Per Day: ");
            double rentPerDay=sc.nextDouble();
            String status="available";

            String q="INSERT INTO car(car_id,car_name, brand, model, rent_per_day, status) VALUES (?, ?, ?, ?, ?,?)";
            PreparedStatement ps=con.prepareStatement(q);
            ps.setInt(1, carId);
            ps.setString(2, carName);
            ps.setString(3, brand);
            ps.setString(4, model);
            ps.setDouble(5, rentPerDay);
            ps.setString(6, status);
            int rowsInserted=ps.executeUpdate();
            if(rowsInserted>0){
                System.out.println("Car added successfully!");
            }
        }
    
        catch(Exception e){
            System.out.println(e);
        }
    
    }

    public void viewAllCars(Connection con){
        try{
            String q="SELECT * FROM car";
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery(q);
            System.out.println("Car ID   | Car Name    | Brand    | Model   | Rent Per Day   | Status");
            while(rs.next()){
                 System.out.println(
                                rs.getInt(1) + " "
                                + rs.getString(2) + " "
                                + rs.getString(3) + " "
                                + rs.getString(4) + " "
                                + rs.getDouble(5)+""
                                + rs.getString(6)

                            );
                
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    public void searchCar(Scanner sc,Connection con){
        try{
            System.out.println("Enter Brand:");
            String brand=sc.nextLine();
            String q="SELECT * FROM car where brand=?";
            PreparedStatement ps=con.prepareStatement(q);
            ps.setString(1,brand);
            ResultSet rs=ps.executeQuery();
            System.out.println("Car ID   | Car Name    | Brand    | Model   | Rent Per Day   | Status");

            while(rs.next()){
                 System.out.println(
                                rs.getInt(1) + "        "
                                + rs.getString(2) + "       "
                                + rs.getString(3) + "       "
                                + rs.getString(4) + "       "
                                + rs.getDouble(5) + "       "
                                + rs.getString(6)

                            );
                
            }
            
            

        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    public void updateCarDetails(Scanner sc, Connection con){
        try{
            System.out.println("Enter Car ID to Update:");
            int carId=sc.nextInt();
            sc.nextLine();
            
            System.out.println("Enter New Rent Per Day:");
            double rentPerDay=sc.nextDouble();

            String q="UPDATE car SET  rent_per_day=? WHERE car_id=?";
            PreparedStatement ps=con.prepareStatement(q);
            
            ps.setDouble(1, rentPerDay);
            ps.setInt(2, carId);
            int rowsUpdated=ps.executeUpdate();
            if(rowsUpdated>0){
                System.out.println("Car details updated successfully!");
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    public void deleteCar(Scanner sc, Connection con){
        try{
            System.out.println("Enter Car ID to Delete:");
            int carId=sc.nextInt();
            String q="DELETE FROM car WHERE car_id=?";
            PreparedStatement ps=con.prepareStatement(q);
            ps.setInt(1, carId);
            int rowsDeleted=ps.executeUpdate();
            if(rowsDeleted>0){
                System.out.println("Car deleted successfully!");
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    } 
    
    public void viewAvailableCars(Connection con){
        try{
            String q="SELECT * FROM car WHERE status='available'";
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery(q);
            System.out.println("Car ID   | Car Name    | Brand    | Model   | Rent Per Day   | Status");
            while(rs.next()){
                 System.out.println(
                                rs.getInt(1) + "        "
                                + rs.getString(2) + "       "
                                + rs.getString(3) + "       "
                                + rs.getString(4) + "       "
                                + rs.getDouble(5)+"       "
                                + rs.getString(6)

                            );
                
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
}
public void viewBookedCars(Connection con){
    try{
        String q="SELECT * FROM car WHERE status='booked'";
        Statement stmt=con.createStatement();
        ResultSet rs=stmt.executeQuery(q);
        System.out.println("Car ID   | Car Name    | Brand    | Model   | Rent Per Day   | Status");
        while(rs.next()){
             System.out.println(
                            rs.getInt(1) + "       "
                            + rs.getString(2) + "       "
                            + rs.getString(3) + "        "
                            + rs.getString(4) + "        "
                            + rs.getDouble(5)+"       "
                            + rs.getString(6)

                        );
            
        }
    }
    catch(Exception e){
        System.out.println(e);
    }
}
public void viewAllCustomers(Connection con){
    try{
     String q="SELECT customer_id, customer_name, mobile, city FROM customer";
     Statement stmt=con.createStatement();
    ResultSet rs=stmt.executeQuery(q);
    System.out.println("ID    | Name    | Mobile  | City ");
    while(rs.next()){
        System.out.println(rs.getInt(1)+"      "
                        + rs.getString(2)+"       "
                       + rs.getString(3)+"       "
                      +rs.getString(4));
    }

    }
    catch(Exception e){
        System.out.println(e);
    }
     
}
public void viewBookingHistory(Connection con){
    try {
        String q="SELECT b.booking_id ,c.customer_name, car_name, b.total_amount FROM booking b JOIN customer c ON b.customer_id=c.customer_id JOIN car ON b.car_id=car.car_id";
        Statement stmt=con.createStatement();
        ResultSet rs=stmt.executeQuery(q);
        System.out.println("Booking ID | Customer Name | Car Name | Total Amount");
        while(rs.next()){
            System.out.println(rs.getInt(1)+"       "
                            + rs.getString(2)+"       "
                           + rs.getString(3)+"       "
                          +rs.getDouble(4));
        }
    } catch (Exception e) {
        System.out.println(e);
    }
}
public void totalNumberOfCars(Connection con){
    try{
        String q="SELECT count(*) FROM car";
        Statement stmt=con.createStatement();
        ResultSet rs=stmt.executeQuery(q);
        if(rs.next()){
            System.out.println("Total Number of Cars: "+rs.getInt(1));
        }
    }
    catch(Exception e){
        System.out.println(e);
    }
}
public void mostExpensiveCar(Connection con){
    try{
        String q="SELECT car_name, rent_per_day FROM car WHERE rent_per_day=(SELECT MAX(rent_per_day) FROM car)";
        Statement stmt=con.createStatement();
        ResultSet rs=stmt.executeQuery(q);
        if(rs.next()){
            System.out.println(rs.getString(1)+": Rs. "+rs.getDouble(2)+"/day");
        }
    }
    catch(Exception e){
        System.out.println(e);
    }
}

 public void cheapestCar(Connection con){
    try{
        String q="SELECT car_name, rent_per_day FROM car WHERE rent_per_day=(SELECT MIN(rent_per_day) FROM car)";
        Statement stmt=con.createStatement();
        ResultSet rs=stmt.executeQuery(q);
        if(rs.next()){
            System.out.println(rs.getString(1)+": Rs. "+rs.getDouble(2)+"/day");
        }
    }
    catch(Exception e){
        System.out.println(e);
    }
}
public void averageRentalPrice(Connection con){
    try{
        String q="SELECT AVG(rent_per_day) FROM car";
        Statement stmt=con.createStatement();
        ResultSet rs=stmt.executeQuery(q);
        if(rs.next()){
            System.out.println("Average Rent: Rs. "+rs.getDouble(1)+"/day");
        }
    }
    catch(Exception e){
        System.out.println(e);
    }
 

}
public void carsWithinBudgetRange(Scanner sc, Connection con){
    try{
        System.out.println("Enter Minimum Rent: ");
        double minRent=sc.nextDouble();
        System.out.println("Enter Maximum Rent: ");
        double maxRent=sc.nextDouble();
        String q="SELECT car_name , rent_per_day FROM car WHERE rent_per_day BETWEEN ? AND ?";
        PreparedStatement ps=con.prepareStatement(q);
        ps.setDouble(1, minRent);
        ps.setDouble(2, maxRent);
        ResultSet rs=ps.executeQuery();
        System.out.println(" Car Name    | Rent Per Day   ");
         while(rs.next()){
             System.out.println(
                            rs.getString(1) + "    "
                            + rs.getDouble(2)

                        );
            
        }
        
    }
    catch(Exception e){
        System.out.println(e);
    }
}
public void carsByMultipleBrands(Scanner sc, Connection con){
    try{
       //Error here
       System.out.println("Enter a Brand:");
        String q=("SELECT  brand, count(brand) from car group by brand having count(brand)>1 ");
        Statement ps=con.createStatement();
       
        ResultSet rs=ps.executeQuery(q);
        System.out.println(" Brand Name    | Count   ");
         while(rs.next()){
             System.out.println(
                            
                            rs.getString(1)+" "
                            + rs.getInt(2)

                        );
            
        }
        
    }
    catch(Exception e){
        System.out.println(e);
    }

}
public void sortCarsByRentalPrice(Connection con){
    try{
        String q="SELECT car_name, rent_per_day FROM car ORDER BY rent_per_day ";
        Statement stmt=con.createStatement();
        ResultSet rs=stmt.executeQuery(q);
        System.out.println(" Car Name    | Rent Per Day   ");
         while(rs.next()){
             System.out.println(
                            rs.getString(1) + "    "
                            + rs.getDouble(2)

                        );
            
        }
        
    }
    catch(Exception e){
        System.out.println(e);
    }

}
public void mostBookedCarReport(Connection con){
    try{
        String q="SELECT c.car_id, c.car_name, COUNT(*) AS booking_count FROM car c JOIN booking b ON c.car_id=b.car_id GROUP BY c.car_id ORDER BY booking_count";
        Statement stmt=con.createStatement();
        ResultSet rs=stmt.executeQuery(q);
        System.out.println("Car ID | Car Name    | Booking Count   ");
         while(rs.next()){
             System.out.println(
                            rs.getInt(1) + "    "
                            + rs.getString(2) + "    "
                            + rs.getInt(3)

                        );
            
        }
    }
    catch(Exception e){
        System.out.println(e);
    }
}
public void customerWiseBookingReport(Connection con){
    try{
        String q="SELECT c.customer_id, c.customer_name, COUNT(*) AS booking_count FROM customer c JOIN booking b ON c.customer_id=b.customer_id GROUP BY c.customer_id ORDER BY booking_count DESC";
        Statement stmt=con.createStatement();
        ResultSet rs=stmt.executeQuery(q);
        System.out.println(" Customer Name    | Booking Count   ");
         while(rs.next()){
             System.out.println(
                            
                             rs.getString(2) + "      "
                            + rs.getInt(3)

                        );
            
        }
    }
    catch(Exception e){
        System.out.println(e);
    }

}public void revenueReport(Connection con){
    try{
        String q="SELECT SUM(total_amount) FROM booking";
        Statement stmt=con.createStatement();
        ResultSet rs=stmt.executeQuery(q);
        if(rs.next()){
            System.out.println("Total Revenue: Rs. "+rs.getDouble(1));
        }
    }
    catch(Exception e){
        System.out.println(e);
    }
}
public void dailyBookingreport(Connection con){
    try{
        String q="SELECT booking_date, COUNT(*) from booking GROUP BY booking_date" ;
        Statement stmt =con.createStatement();
        ResultSet rs=stmt.executeQuery(q);
        System.out.println("Booking Date | Booking Count");
        while(rs.next()){
            System.out.println(rs.getDate(1)+"    "+ rs.getInt(2));
        }

       }
    catch(Exception e){
        System.out.println(e);
    }
}
public void carAvailabilityReport(Connection con){
    try{
        String q="SELECT car_id,car_name from car where status='available'";
        Statement stmt=con.createStatement();
        ResultSet rs=stmt.executeQuery(q);
        System.out.println("Available Cars:  ");
        while(rs.next()){
            System.out.println(rs.getInt(1)+ "    "+ rs.getString(2));
        }
    }
    catch(Exception e){
        System.out.println(e);
    }
}
}


class Customer{

    public void customerMenu(){
        System.out.println("1.View Available Cars");
        System.out.println("2.Search Car");
        System.out.println("3.Book  Car");
        System.out.println("4.Cancel a Booking");
         System.out.println("5.View My Bookings History");
        System.out.println("6.View Profile");
        System.out.println("7.Logout");
        System.out.println("Enter Your Choice: ");
    }
    public void bookCar(Scanner sc, Connection con){
        try{
            System.out.println("Enter Booking ID:");
            int carId=sc.nextInt();
            sc.nextLine();
             System.out.println("Enter Car ID");
            int car=sc.nextInt();
            sc.nextLine();
            System.out.println("Enter Your Customer ID");
            int cus=sc.nextInt();
            sc.nextLine();
            System.out.println("Enter Booking Date (DD/MM/yyyy):");
            String bookingDate=sc.nextLine();
            System.out.println("Enter Return Date (DD/MM/yyyy):");
            String returnDate=sc.nextLine();
           
             DateTimeFormatter df=DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate d=LocalDate.parse(bookingDate,df);
        LocalDate d1=LocalDate.parse(returnDate,df);
            
           Period p = Period.between(d, d1);

            double totalAmount=0.0;

            String q1="SELECT rent_per_day FROM car WHERE car_id=?";
            PreparedStatement ps1=con.prepareStatement(q1);
            ps1.setInt(1, car);
            ResultSet rs=ps1.executeQuery();
            //TOTAL AMOUNT CALCULATION IS NOT WORKING PROPERLY
            if(rs.next()){
                System.out.println(rs.getDouble(1));
                totalAmount+=rs.getDouble(1)*p.getDays();
            }
           
            String q2="insert into booking values (?,?,?,?,?,?,?)";
            PreparedStatement ps2=con.prepareStatement(q2);
            ps2.setInt(1, carId);
            ps2.setInt(2,cus);
            ps2.setInt(3, car);
             ps2.setDate(4,Date.valueOf(d));
            ps2.setDate(5,Date.valueOf(d1));
            ps2.setInt(6, p.getDays());
            ps2.setDouble(7, totalAmount);
            int rowsInserted=ps2.executeUpdate();
            if(rowsInserted>0){ 
                System.out.println("Car booked successfully! Total Amount: Rs. "+totalAmount);
                String q3="UPDATE car SET status='booked' WHERE car_id=?";
                PreparedStatement ps3=con.prepareStatement(q3);
                ps3.setInt(1, car);
                ps3.executeUpdate();
            }


        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    public void cancelBooking(Scanner sc, Connection con){
        try{
            System.out.println("Enter Booking ID to Cancel:");
            int bookingId=sc.nextInt();
            String q1="SELECT car_id FROM booking WHERE booking_id=?";
            PreparedStatement ps1=con.prepareStatement(q1);
            ps1.setInt(1, bookingId);
            ResultSet rs=ps1.executeQuery();
            if(rs.next()){
                int carId=rs.getInt(1);
                String q2="DELETE FROM booking WHERE booking_id=?";
                PreparedStatement ps2=con.prepareStatement(q2);
                ps2.setInt(1, bookingId);
                int rowsDeleted=ps2.executeUpdate();
                if(rowsDeleted>0){
                    System.out.println("Booking cancelled successfully!");
                    String q3="UPDATE car SET status='available' WHERE car_id=?";
                    PreparedStatement ps3=con.prepareStatement(q3);
                    ps3.setInt(1, carId);
                    ps3.executeUpdate();
                }
            }
            else{
                System.out.println("Booking not found!");
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    public void viewBookingHistory(Connection con, Scanner sc){
        try{
            System.out.println("Enter Your Customer ID:");
            int cusId=sc.nextInt();
            String q="SELECT b.booking_id, car_name, b.booking_date, b.return_date, b.total_amount FROM booking b JOIN car ON b.car_id=car.car_id WHERE b.customer_id=?";
            PreparedStatement ps=con.prepareStatement(q);
            ps.setInt(1, cusId);
            ResultSet rs=ps.executeQuery();
            System.out.println("Booking ID | Car Name    | Booking Date | Return Date | Total Amount");
            while(rs.next()){
                System.out.println(rs.getInt(1)+" "
                                + rs.getString(2)+" "
                               + rs.getDate(3)+" "
                              +rs.getDate(4)+" "
                              +rs.getDouble(5));
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }

    public void viewProfile(Connection con, Scanner sc){
        try{
            System.out.println("Enter Your Customer ID:");
            int cusId=sc.nextInt();
            String q="SELECT customer_name, mobile, city, license_no FROM customer WHERE customer_id=?";
            PreparedStatement ps=con.prepareStatement(q);
            ps.setInt(1, cusId);
            ResultSet rs=ps.executeQuery();
            if(rs.next()){
                System.out.println("Name: "+rs.getString(1));
                System.out.println("Mobile: "+rs.getString(2));
                System.out.println("City: "+rs.getString(3));
                System.out.println("License No: "+rs.getString(4));
            }
            else{
                System.out.println("Customer not found!");
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}


class Resgistration{

    public Resgistration(Scanner sc, Connection con) {
        try {
            System.out.println("===CUSTOMER REGISTRACTION===");
            System.out.println("Enter Customer ID: ");
            int cid=sc.nextInt();
            sc.nextLine();
            System.out.println("Enter Customer Name: ");
            String name=sc.nextLine();
            System.out.println("Enter Mobile Number: ");    
            String mobile=sc.nextLine();
            System.out.println("Enter City: ");
            String city=sc.nextLine();
            System.out.println("Enter License Number: ");
            String license=sc.nextLine();

            System.out.println("--Please Set You Your Username and Password--");
            System.out.println("Enter Username: ");
            String username=sc.nextLine();
            System.out.println("Enter Password: ");
            String password=sc.nextLine();
            String pattern="^[a-zA-Z0-9]+[@_.#]+{8,}";
            Pattern p=Pattern.compile(pattern);
            Matcher m=p.matcher(username);
            if(m.matches() && username.length()>=8 && username.length()<=30 && password.length()>=8){
                String q="INSERT INTO customer(customer_id, customer_name, mobile, city, license_no, username, password) VALUES (?, ?, ?, ?, ?, ?, ?)";
                PreparedStatement ps=con.prepareStatement(q);
                ps.setInt(1, cid);
                ps.setString(2, name);
                ps.setString(3, mobile);
                ps.setString(4, city);
                ps.setString(5, license);
                ps.setString(6, username);
                ps.setString(7, password);
                int rowsInserted=ps.executeUpdate();
                if(rowsInserted>0){
                    System.out.println("Registration successful!");
                }
            }
            else{
                System.out.println("Invalid username or password format! Username must be 8-30 characters long and can include letters, numbers and special characters (@_.#). Password must be at least 8 characters long.");
            }

            
        } catch (Exception e) {
            System.out.println(e);
        }
    }

   
}

public class CarBookingSystem {
 public static void main(String[] args) {
    try{
    Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306",
        "root",
        "sarah@05");
    String db="CREATE DATABASE IF NOT EXISTS carbookingsystem";
    Statement stmt=con.createStatement();
    stmt.executeUpdate(db);
    stmt.execute("use carbookingsystem");
    int choice=0;
    Scanner sc= new Scanner (System.in);

    String admin="CREATE TABLE IF NOT EXISTS admin( "+ "admin_id INT PRIMARY KEY,"+
    "username VARCHAR(30),"+"password VARCHAR(30)"+")";
    stmt.executeUpdate(admin);

    String customer="CREATE TABLE IF NOT EXISTS customer( "+ "customer_id INT PRIMARY KEY,"+
    "customer_name VARCHAR(50),"+"mobile VARCHAR(15),"+
    "city VARCHAR(30),"+"license_no VARCHAR(30),"+
    "username VARCHAR(30),"+"password VARCHAR(30)" +")";
    stmt.executeUpdate(customer);
    
    String car="CREATE TABLE IF NOT EXISTS car( "+ "car_id INT PRIMARY KEY,"+
"car_name VARCHAR(50),"+ "brand VARCHAR(50),"+
"model VARCHAR(30)," + "rent_per_day DOUBLE,"
 +"status VARCHAR(20)" +")";
stmt.executeUpdate(car);

 String booking="CREATE TABLE IF NOT EXISTS booking(" + "booking_id INT PRIMARY KEY," +
          "customer_id INT," + "car_id INT," + "booking_date DATE," +
           "return_date DATE," +
          "total_days INT," + 
          "total_amount DOUBLE" +
          ")"; 
stmt.executeUpdate(booking);





    do{
    System.out.println("====================================");
    System.out.println("       CAR BOOKING SYSTEM");
    System.out.println("1.Admin Login");
    System.out.println("2.Customer Login");
    System.out.println("3.Customer Registration");
    System.out.println("4.Exit");
    System.out.println("Enter Your Choice: ");
    choice=sc.nextInt();
    if (choice==1){
       System.out.println();
       System.out.println("======Admin Login======");
       System.out.println("  Enter Username: ");
       String username=sc.next();
        System.out.println("  Enter Password: ");
        String adminPass=sc.next();

         String pattern="^[a-zA-Z0-9]+[@_.#]+{8,}";
            Pattern p=Pattern.compile(pattern);
            Matcher m=p.matcher(username);
        
        if(m.matches() && username.length()>=8 && username.length()<=30 && adminPass.length()>=8){
            String q="SELECT * FROM admin WHERE username=? AND password=?";
            PreparedStatement ps=con.prepareStatement(q);
            ps.setString(1, username);
            ps.setString(2, adminPass);
            ResultSet rs=ps.executeQuery();
            if(rs.next()){
                System.out.println("Admin login successful!");
                System.out.println();
                
                Admin ad=new Admin();
                int adminchoice;
                do{
                    System.out.println("===Admin Menu===");
                ad.adminMenu();
                adminchoice=sc.nextInt();
                sc.nextLine();
               if(adminchoice==1){
                    ad.addCar(sc, con);
                   
            
               }
               else if(adminchoice==2){
                    ad.viewAllCars(con);
                    
               }
               else if(adminchoice==3){
                    ad.searchCar(sc, con);
                   
               }
               else if(adminchoice==4){
                    ad.updateCarDetails(sc, con);
                    
               }
               else if(adminchoice==5){
                    ad.deleteCar(sc, con);
                    
               }
               else if(adminchoice==6){
                    ad.viewAvailableCars(con);
                    
               }
                else if(adminchoice==7){
                      ad.viewBookedCars(con);
                      
                }
                else if(adminchoice==8){
                      ad.viewAllCustomers(con);
                      
                }
                else if(adminchoice==9){
                      ad.viewBookingHistory(con);
                      
                }
                else if(adminchoice==10){
                      ad.totalNumberOfCars(con);
                      
                }
                else if(adminchoice==11){
                      ad.mostExpensiveCar(con);
                      
                }
                else if(adminchoice==12){
                      ad.cheapestCar(con);
                      
                }
                else if(adminchoice==13){
                      ad.averageRentalPrice(con);
                      
                }
                else if(adminchoice==14){
                      ad.carsWithinBudgetRange(sc, con);
                      
                }
                else if(adminchoice==15){
                    //execption
                      ad.carsByMultipleBrands(sc, con);
                      
                }
                else if(adminchoice==16){
                      ad.sortCarsByRentalPrice(con);
                      
                }
                 else if(adminchoice==17){
                      ad.mostBookedCarReport(con);
                      
                }
                    else if(adminchoice==18){
                        ad.customerWiseBookingReport(con);
                        
                    }
                    else if(adminchoice==19){
                        ad.revenueReport(con);
                        
                    }
                    else if(adminchoice==20){
                        ad.dailyBookingreport(con);
                        
                    }
                    else if(adminchoice==21){
                        ad.carAvailabilityReport(con);
                    }

                } while(adminchoice!=22);


               
            }
            else{
                System.out.println("User not found! Please register first.");
                Resgistration reg=new Resgistration(sc, con);
            }
        }
        else{
            System.out.println("Invalid username or password format!");
        }

       
    }
    else if(choice==2){
        try{
        System.out.println("===Customer Login===");
        System.out.println("  Enter Username: ");
       String username=sc.next();
        System.out.println("  Enter Password: ");
        String userPass=sc.next();

    
            String q="SELECT * FROM customer WHERE username=? AND password=?";
            PreparedStatement ps=con.prepareStatement(q);
            ps.setString(1, username);
            ps.setString(2, userPass);
            ResultSet rs=ps.executeQuery();
            if(rs.next()){
                System.out.println("Customer login successful!");
                System.out.println("Welcome, "+rs.getString(1)+"!");
                System.out.println();
                
                 Admin ad=new Admin();
                 Customer cus=new Customer();
                int c_choice;
                do{
                    System.out.println("===Customer Menu===");
                cus.customerMenu();
                c_choice=sc.nextInt();
                sc.nextLine();
               if(c_choice==1){
                    ad.viewAvailableCars(con);
                   
            
               }
               else if(c_choice==2){
                ad.searchCar(sc, con);
               }
               else if(c_choice==3){
                cus.bookCar(sc, con);
               }
                else if(c_choice==4){
                 cus.cancelBooking(sc, con);
                }
                else if(c_choice==5){
                 cus.viewBookingHistory(con, sc);
                }
                else if(c_choice==6){
                    cus.viewProfile(con, sc);
                }
            }
            while(c_choice!=7);

            }
            else{
                System.out.println("User not found! Please register first.");
                Resgistration reg=new Resgistration(sc, con);
        }
    }
    catch(Exception e){
        System.out.println(e);

    }}

    else if(choice==3){
        System.out.println("Customer Registration");
        Resgistration reg=new Resgistration(sc, con);
        
          }
    }
    while(choice!=4);



}
   catch (Exception e){
    System.out.println(e);
}

 }   
}

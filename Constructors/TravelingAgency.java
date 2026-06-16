import java.util.Scanner;
class Passenger{
    int passID;
    String VT;
    String Pname;
    void print(){
        System.out.println();
        System.out.println("Passenger Info:");
        System.out.println("Passenger name: "+Pname);
        System.out.println("Passenger Id: "+passID);
        System.out.println("Vehicle Type: "+VT);
        System.out.println();
        
}
}

class Travelingexp extends Passenger{
 String SLoc;
 String EndLoc;
 int rent=0;
 int distance;
 
 void getdata(Scanner sc){

    System.out.println("Enter Passenger name:");
    Pname=sc.nextLine();
     System.out.println("Enter Starting Loc:");
    SLoc=sc.nextLine();
     System.out.println("Enter Ending Loc:");
    EndLoc=sc.nextLine();
     System.out.println("Enter Vehical Type");
    VT=sc.nextLine();
    System.out.println("Enter Passenger ID:");
    passID=sc.nextInt();
     System.out.println("Enter Distance:");
    distance=sc.nextInt();
 }
 void calculate(){
    if(VT.equalsIgnoreCase("maruti 800"))
        rent=10;
    else if(VT.equalsIgnoreCase("Swift"))
        rent=12;
    else if(VT.equalsIgnoreCase("mini bus")) 
        rent=20;
    else{
        rent=30;
    }

    System.out.println("Total Charges:");
    int charges=rent*distance; 
    System.out.println(charges);
 }
 
 void display(){
    
    System.out.println("Traveling Info:");
    System.out.println("Starting Loc: "+SLoc);
    System.out.println("Ending Loc: "+EndLoc);
    System.out.println("Distance : "+distance);
    System.out.println();
    
   
 }
}
class TravelingAgency{
public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    Travelingexp te=new Travelingexp();
    te.getdata(sc);
    te.print();
    te.display();
    te.calculate();
}
}

import java.util.Scanner;

class Cus{
String Cname;
int c_id;
}
class UnitConsumed extends Cus {
 int lastreading;
 int current_reading;
}
class bill extends UnitConsumed{
float total_unit;
float rate_per_unit;
float amount;
float metercharges=200;
void getdata(Scanner sc){
  System.out.println("Enter Customer name: ");
  Cname=sc.nextLine();
  System.out.println("Enter Customer ID: ");
  c_id=sc.nextInt();
  System.out.println("Enter Last reading: ");
  lastreading=sc.nextInt();
  System.out.println("Enter Current reading: ");
  current_reading=sc.nextInt();
  total_unit=current_reading-lastreading;



}
void calculate(){
   if( total_unit<100 ){
      rate_per_unit=1.20f;
      amount=total_unit*rate_per_unit;
   }
   else if((total_unit<300) && (total_unit>=100))
   {
    rate_per_unit=1.75f;
      amount=total_unit*rate_per_unit;
   }
   else if((total_unit<500)&&(total_unit>=300))
   {
    rate_per_unit=2.75f;
      amount=(total_unit*rate_per_unit);
   }
   else{
    rate_per_unit=3.75f;
      amount=total_unit*rate_per_unit;
   }

}
void display(){
    System.out.println();
   System.out.println("Customer  Electricity Information: ");
   System.out.println("Customer name: "+Cname);
    System.out.println("Customer ID: "+c_id);
   System.out.println("Last Reading: "+lastreading);
    System.out.println("Current reading: "+current_reading);
    System.out.println("Total Units: "+total_unit);
     System.out.println("Amount: "+(amount+metercharges));
     System.out.println();
}
}
class customerunit{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        bill b=new bill();
        b.getdata(sc);
        b.calculate();
        b.display();
    }

}
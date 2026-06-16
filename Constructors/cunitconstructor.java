//SAME AS CUSTOMERUNIT.JAVA BUT USING CONSTRUCTOR

class Cus{
String Cname;
int c_id;
}
class UnitConsumed extends Cus {
 int lastreading;
 int current_reading;
}
class cunitconstructor extends UnitConsumed{
float total_unit;
float rate_per_unit;
float amount;
cunitconstructor(String Cname,int c_id,int lastreading,int current_reading){
 
  this.Cname=Cname;
 
 this.c_id=c_id;
  
  this.lastreading=lastreading;
  
  this.current_reading=current_reading;
  total_unit=current_reading-lastreading;



}
void cal(){
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
      amount=total_unit*rate_per_unit;
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
    System.out.println("Amount: "+amount);
    System.out.println();

}

public static void main(String[] args) {
        
        cunitconstructor b=new cunitconstructor("Sarah",143,500,900);
         
       b.cal();
        b.display();

    }
}

import java.util.Scanner;
class InvalidTouristDetailsException extends Exception{
    String msg;
    public InvalidTouristDetailsException (String msg){
        super(msg);
        
    }

}
class TouristManagementsSystem{
    public boolean ValidateTouristDetails( String n, int age,long phno, String travelmode) throws InvalidTouristDetailsException {
       
        if(!(n.matches("[A-Za-z ]+") )){

               throw new InvalidTouristDetailsException ("Name must contain only letter and spaces");

        }
        else if((age<60 || age>99)){
            throw new InvalidTouristDetailsException ("Age Must be Between 60 and 99");

        }
         else if((String.valueOf(phno)).length()!=10){
            throw new InvalidTouristDetailsException ("Phone number must have 10 digits");
            
        }
        else if(!(travelmode.equalsIgnoreCase("Airway") || travelmode.equalsIgnoreCase("Roadway"))){
             throw new InvalidTouristDetailsException ("Travel Method must be Airway or Roadway");
        }
        else{
            System.out.println("Information Accepted!");
        }

        return true;

    }
    public String getTouristID(String n, int age,long phno, String travelmode){

return "id"+n.substring(0,2)+age+String.valueOf(phno).substring(0,2)+travelmode.substring(0,2);

    }
}

public class UserInterface {
    public static void main(String[] args) { 
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter User Name:");
        String name=sc.nextLine();
        System.out.println("Enter User Age:");
        int age=sc.nextInt();
        System.out.println("Enter Phone Number:");
        long ph=sc.nextLong();
        sc.nextLine();
         System.out.println("Enter Travel Mode:");
        String mode=sc.nextLine();
        TouristManagementsSystem tms=new TouristManagementsSystem();
        try{
          if((tms.ValidateTouristDetails(name,age,ph,mode))){

          }
          else{
           System.out.println(tms.getTouristID(name, age, ph, mode)); 
          }
        }
        catch(InvalidTouristDetailsException v){
            System.out.println(v);
        }



        
    }
    
}

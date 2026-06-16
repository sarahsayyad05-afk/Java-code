import java.util.Scanner;

class  Authentication_Faliure_Exception extends Exception{
String msg;
    public Authentication_Faliure_Exception (String msg) {
        super(msg);
        this.msg=msg;
    }
    @Override
    public String toString(){
         return msg;
    }

}
public class passwordfailure {
     public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter Original Pasword:");
         String s1=sc.nextLine();
         System.out.println("Enter Pasword Again:");
         String s2=sc.nextLine();
         try {
             if(!(s1.equalsIgnoreCase(s2))){
                throw new Authentication_Faliure_Exception ("Incorrect Password");
             }
         } catch (MAuthentication_Faliure_Exception  mse) {
            System.out.println(mse);
            
         }
    }
}

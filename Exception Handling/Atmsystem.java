import java.util.Scanner;
class  DailyLimitExceededException extends Exception{
String msg;
    public DailyLimitExceededException (String msg) {
        super(msg);
        this.msg=msg;
    }
    @Override
    public String toString(){
         return msg;
    }

}
class  InsufficiantBalanceException extends Exception{
String msg;
    public  InsufficiantBalanceException(String msg) {
        super(msg);
        this.msg=msg;
    }
    @Override
    public String toString(){
         return msg;
    }

}
public class Atmsystem {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter Account Balance:");
         int Balance=sc.nextInt();
         System.out.println("Enter Withdrawal Amout:");
         int withdraw=sc.nextInt();
         try {
            if(withdraw>20000 && withdraw<Balance ){
                throw new DailyLimitExceededException("Error! You cannot withdraw more than 20,000 rs");
            }
            else if(withdraw>Balance){
                throw new InsufficiantBalanceException("Error! Withdrawal amout is exceeding your balance");
                        }

            else{
                System.out.println("Withdrawal REquest Accepted! Your balance is:"+(Balance-withdraw));
            }
             
         } catch (DailyLimitExceededException de) {
             System.out.println(de.getMessage());
         }
         catch(InsufficiantBalanceException i){
                System.out.println(i.getMessage());
         }
    }
}

import java.util.Scanner;
public class atmsimulator
{
    public static void main(String args[])
    {   Scanner sc=new Scanner(System.in);
        System.out.println("simulate simple atm withdrawal process");
        // conditions:
        //user enter withdrawal amt, check if it is +ve or -ve,
        //  if -ve display withdrawal amt must be +ve, if withdrawal amt is valid,
        //  check if user haves sufficiant balance or not if balance is enough then withdraw the amount.
        // else display insufficiant balance
        int balance=50000;
        System.out.println("Enter your withdrawal amount");
        int balanceamt=sc.nextInt();
        if (balanceamt>0)
        {
            if (balanceamt<=balance)
            {   int withdraw=balance-balanceamt;
                System.out.println("the withdrawal request is accepted!");
                System.out.println("the withdrawal of "+balanceamt+" is made.");
                balance-=balanceamt;
                System.out.println("your updated balance is "+balance);
            }
            else
            {
                System.out.println("the withdrawal request is not accepted");
                System.out.println("your balance is"+balance+". it is insufficiant");
            }

        }
        else{
            System.out.println("Enter a valid withdrawal amount");
        }

     
    }

}
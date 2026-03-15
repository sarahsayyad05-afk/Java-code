import java.util.Scanner;

public class Mini_ATM_Simulation
{
    public static void main(String args[])
    {   Scanner sc=new Scanner(System.in);
        System.out.println("-----WELCOME TO MINI ATM-----");
        int pin=1234;
        int u_pin;
        char ch;
        int atempt=1;
        int balance=50000;
        boolean b=false;
        while (atempt<=3)
        {
            System.out.println("Please enter your pin");
            u_pin=sc.nextInt();
            if (u_pin==pin)
            {
                System.out.println("Correct PIN!Access Granted");
                b=true;
                break;
            }
            else
            {
                System.out.println("Incorrect PIN Atempt Left:"+(3-atempt));
                atempt++;
            }
        }
            if(b)
            {
                do{
                   
                    System.out.println("------ ATM_MENU------");
                    System.out.print("1) Check Balance\n2) Deposite Money\n3) Withdraw Money\nQ) Quit\n");
                    System.out.println("Enter Your Choice:");
                    ch=sc.next().charAt(0);
                    switch(ch)
                    {
                        case'1':
                        System.out.println("Current Balance:"+balance);
                        break;
                        case'2':
                        int deposite;
                        System.out.println("Enter a amount to deposite:");
                        deposite=sc.nextInt();
                        if(deposite>0)
                        {
                            balance+=deposite;
                            System.out.println("Deposite Successful! New Balance:"+balance);

                        }
                        else
                            System.out.println("Please Enter a Valid Amount");
                        break;
                        case'3':
                        int withdraw;
                        System.out.println("Enter a amount to withdraw:");
                        withdraw=sc.nextInt();
                        if(withdraw>0  &&  withdraw<balance && balance-withdraw>1000)
                        {
                            balance-=withdraw;
                            System.out.println("Withdrawal Successful! New Balance:"+balance);


                        }
                        else{
                            System.out.println("Amount Should be positive or less than the balance");

                        }
                        break;
                        case'Q':
                        case'q':
                            System.out.println("Thank You For Using Mini ATM!");
                        default:
                            System.out.println("Enter a Valid Choice");



                        
                    }
                }while(ch!='Q' && ch!='q');
                
            }
           
            
            

            
           
        


 

    }    
}
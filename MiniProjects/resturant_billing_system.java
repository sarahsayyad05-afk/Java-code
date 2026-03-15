import java.util.Scanner;

public class resturant_billing_system
{
     public static void main(String args[])
    {   Scanner sc=new Scanner(System.in);
        System.out.println("WELCOME TO OUR RESTAURANT");
        char item;
        int bill=0;
        do{

        
             System.out.println("------MENU------");
             System.out.print("1) Burger rs.80\n2)Pizza rs.150\n3)French Fries rs.60\n4)Coke rs.40\n5)Print Bill and Exit\n");
             System.out.println("Select your items (1-4):");
             item=sc.next().charAt(0);
             int q;
             
             switch(item)
             {
                case '1':
                    System.out.println("Please enter the quantity:");
                     q=sc.nextInt();
                    System.out.println(q+" Burger added to your order!");
                    bill+=q*80;
                    
                    break;
                case '2':
                    System.out.println("Please enter the quantity:");
                    q=sc.nextInt();
                    System.out.println(q+" Pizza added to your order!");
                    bill+=q*150;
                    break;
                case '3':
                    System.out.println("Please enter the quantity:");
                    q=sc.nextInt();
                    System.out.println(q+" French Fries added to your order!");
                    bill+=q*60;
                    break;
                case '4':
                    System.out.println("Please enter the quantity:");
                    q=sc.nextInt();
                    System.out.println(q+" Coke added to your order!");
                    bill+=q*40;

                    break;
                case '5':
                    System.out.println("====FINAL BILL====");
                    
                    
                    break;
                    
             }

        } while (item!='5');
        System.err.println("Total Amount to Pay: rs."+bill);
        System.out.println("Thank You for your order");
        System.out.println("Please visit again!");






    }


}
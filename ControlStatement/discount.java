import java.util.Scanner;
public class discount
{
    public static void main(String args[])
    {   Scanner sc=new Scanner(System.in);
        // take bill amt frm user,if amt is -ve display enter valid amt");
        // if amt is>10000, then it will get %5discount. if amt is greater thna 15000 then discount will be %10,");
       // display final amt, after discount with discounted amt other wise no discount");
        double discount;
        System.out.println("Discount on bill according to its amount");
        System.out.println("Enter your Bill amount");
        double billamt=sc.nextDouble();
        if (billamt>0)
        {
            if ((billamt>=10000) && (billamt<=14999))
            {   discount=billamt*0.05;
                double finalamt=billamt-discount;
                System.out.println("you got discount of %5!");
                System.out.println("Your final amout is "+finalamt+" with discounted amout of "+discount);
                
            }
            else if (billamt>=15000)
            {   discount=billamt*0.10;
                double finalamt=billamt-discount;
                System.out.println("you got discount of %10!");
                System.out.println("Your final amout is "+finalamt+" with discounted amout of "+discount);
                
            }
            else {
            System.out.println("Your bill does not fit the discount criteria. Hence, no discount applied");
            System.out.println("Original bill="+billamt);
             }
        }
        else
        {
            System.out.println("Enter a valid bill amount");
        }
    }
}
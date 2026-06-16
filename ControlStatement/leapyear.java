import java.util.Scanner;
public class leapyear
{
    public static void main(String args[])
    {   Scanner sc=new Scanner(System.in);
        System.out.println("check if the entred year is leap year");
        System.out.println("Enter a year");
        int year=sc.nextInt();
        if ((year%4)==0)
        {
            if ((year%100)==0)
            {
                if ((year%400)==0)
                {
                    System.out.println("the entred year "+year+" is leap year");
                }
                else{
                    System.out.println("the entred year "+year+" is not a leap year");
                }
            }
            else{
                System.out.println("the entred year "+year+" is not leap year");
            }
        }
        else{
            System.out.println("the entred year "+year+" is not leap year");
        }
        //in simple if else
        //if ((y%4))
        System.out.println("take bill amt frm user,if amt is -ve display enter valid amt");
        System.out.println("if amt is>10000, then it will get %5discount. if amt is greater thna 15000 then discount will be %10,");
        System.out.println("display final amt, after discount with discounted amt other wise no discount");

    
    }

}

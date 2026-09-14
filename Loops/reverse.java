import java.util.Scanner;
public class reverse
{
    public static void main(String args[])
    {   Scanner  sc=new Scanner(System.in);
        
        System.out.println("reverse the didgits in given number");
        int rev=0,r=0;
        System.out.println("enter a number=");
        int num=sc.nextInt();
        while(num>0)
        {
            r=num%10;
            rev=rev*10+r;
            num/=10;


        }
        System.out.println("reverse of digits in number= "+rev);
         System.out.println("check if the reverse of number given is palindrome");
         //plaindrome:if we reverse a number or word they remain the same
        int rev1=0,r1=0;
        System.out.println("enter a number=");
        int num1=sc.nextInt();
        int temp=num1;
        while(num1>0)
        {
            r=num1%10;
            rev=rev*10+r;
            num1/=10;
           
            


        }
        System.out.println("reverse of digits in number= "+rev);
        if (temp==rev)
            {
                System.out.println("given number is palindrome");
            }
        else
              System.err.println("given number is not palindrome");



       
       


        

        

    }
}
    

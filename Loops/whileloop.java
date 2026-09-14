import java.util.Scanner;
public class whileloop
{
    public static void main(String args[])
    {   Scanner  sc=new Scanner(System.in);
        // System.out.println("print number betwn given range");
        // System.out.println("enter range one");
        // System.out.println("print 2's table");
        // // int a=2;
        // // while(a<=20)
        // // {
        // //     System.out.println(a);
        // //     a+=2;
        // // }
        // int a=1;
        // // while (a<=10)
        // // {
        // //     System.out.println("2*"+a+"="+(2*a));
        // //    a++;
        // // }
        // System.out.println("print cube of odd number in given range");
        
        // System.out.println("enter range1");
        // int r=sc.nextInt();
        
        // System.out.println("enter range2");
        // int r1=sc.nextInt();
        // while (r<r1)
        // {
        //     if (r%2!=0)
        //     {
        //         int cube=r*r*r;
        //         System.out.println("cube of odd num="+cube);


        //     }
        //     r++;

        // }
        // System.out.println("print alphabets from a to z");
        // char ch='a';
        // char ch1='A';
        // while ((ch<='z')||(ch1<='Z'))
        // {

        //     System.out.print(""+ch1+""+ch+" ");
        //     ch++;
        //     ch1++;
        // }
        //  System.out.println("write a program to print sum of first 100 natural number");
        // int i=1,sum=0;
        // while (i<=100)
        // {
        //     sum+=i;
        //     i++;

        // }
        //  System.out.println("sum of 100 numbers= "+sum);

        // System.out.println("print first 20 odd natural numbers and their sum");
        // int a=1;
        // int sum1=0; 
        // while (a<=40)
        // {
        //     if (a%2!=0)
        //     {
        //         System.out.println(a);
                
        //         sum1+=a;
                
            
        
        
        //     }
        // //     a++;
           
            
            
        // // }
        // // System.out.println("sum of odd numbers= "+sum1);
        // // System.out.println("count number of didgits in given number");
        // // int a=0;
        // // System.out.println("enter a number=");
        // // int num=sc.nextInt();
        // // while(num>0)
        // // {
        // //     a+=1;
        // //     num/=10;

        // // }
        // System.out.println("sum of didgits in given number");
        // int sum=0,r=0;
        // System.out.println("enter a number=");
        // int num=sc.nextInt();
        // while(num>0)
        // {
        //     r=num%10;
        //     sum+=r;
        //     num/=10;


        // }
        // System.out.println("sum of digits in number= "+sum);
        // System.out.println("reverse the didgits in given number");
        // int rev=0,r=0;
        // System.out.println("enter a number=");
        // int num=sc.nextInt();
        // while(num>0)
        // {
        //     r=num%10;
        //     rev=rev*10+r;
        //     num/=10;


        // }
        // System.out.println("reverse of digits in number= "+rev);
         System.out.println("check if the reverse of number given is palindrome");
         //plaindrome:if we reverse a number or word they remain the same
        int rev=0,r=0;
        System.out.println("enter a number=");
        int num=sc.nextInt();
        int temp=num;
        while(num>0)
        {
            r=num%10;
            rev=rev*10+r;
            num/=10;
           
            


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
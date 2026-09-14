import java.util.Scanner;
public class forloop
{
    public static void main(String args[])
    {   Scanner sc=new Scanner(System.in);
        
        // System.out.println("check given number is prime or not");
        // System.out.println("enter a number=");
        // int a=sc.nextInt();
        // int count=0;
        // for (int i = 1; i <=a; i++) {
        //     if(a%i==0)
        //     {
        //         count++;
        //     }
        // }
        // if (count==2)
        // {
        //     System.out.println("it is a prime number");
        // }
        // else
        // {
        //     System.out.println("it is not a prime number");
        // }
        // System.out.println("check given number is strong or not");
        // //strong number = 145-> 1!+4!+5!=145
        // System.out.println("enter a number=");
        // int num=sc.nextInt();
        // int temp=num;
        // int r;
        // int sum=0;
        //  while(num>0)
        // {
            
        //     r=num%10;
        //     int fact=1;
        //     for (int i = r; i >=1; i--) {
        //         fact=fact*i;

                
        //     }
        //     sum+=fact;
        //     num/=10;
            


        // }
        // System.out.println(sum);

        // if (temp==sum)
        // {
        //     System.out.println("given number is strong number");
        // }
        // else 
        //     System.out.println("given number is not strong number");
        // System.out.println(" check given number is perfect number or not number");
        // System.out.println("enter a number=");
        // int num1=sc.nextInt();
        
        // int sum1=0;
        // for (int i = 1; i <num1; i++) {
        //     if (num1%i==0)
        //     {
        //         sum1=sum1+i;
        //     }
            
        // }
        // if (num1==sum1)
        // {
        //     System.out.println("given number is perfect number");
        // }
        // else 
        //     System.out.println("given number is not perfect number");

        System.out.println("fibonaci series of given number");
        System.out.println("number upto=6");
        int n1=0,n2=1,n3;
        int n=8;
        for (int i = 0; i < n; i++) {
            System.out.print(" "+n1+" ");
            n3=n1+n2;
            n1=n2;
            n2=n3;
            
        }




    }
}
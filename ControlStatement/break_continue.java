//continue:skips the current iteration and the loop continues w next iteration
//break:stops the loop completely,control jumps out of the loop
import java.util.Scanner;
public class break_continue
{
    public static void main(String args[])
    {   Scanner  sc=new Scanner(System.in);
    for (int i = 0; i < 10; i++) {
        if(i==5)
        {
            break;
        }
        System.out.print(i);
    }
    //continue
    for (int i = 0; i <5; i++) {
        if(i==3)
        {
            continue;
        }
        System.out.println(i);
    }
    // System.out.println("write a program to take a number from user and stop accepting when user enters negative number");
    // int a=10,i;
    
    // for(i=0;i<10;i++)
    // {
    //     System.out.println("Enter a number");
    //     int n=sc.nextInt();
    //     if(n<0)
    //     {
    //         break;
    //     }
        

   
    // }
    // System.out.println(i);
    System.out.println("accept first 20 even numbers");
    for (int i = 0; i < 10; i++)
    {
       System.out.println("Enter even number"); 
       int a1=sc.nextInt();
       if(a1>40 || a1%2!=0 )
       {
             System.out.println("please enter a number between 40 and a even number");
             continue;
       }
       System.out.println(a1);
       
    }
   
    }
    
}
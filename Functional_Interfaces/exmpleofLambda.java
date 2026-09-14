
import java.util.*;
interface cube{
    public int c(int a);
}
interface len{
    public int s(String s1);
}
interface evenodd{
    public String e(int a);
}
public class exmpleofLambda {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //write a program to find cube of given no. using lambda expression
        System.out.println("Enter a number to find cube");
        int x=sc.nextInt();
        sc.nextLine();
        cube ab=(a)-> { return a*a*a;};
        System.out.println("Cube: "+ ab.c(x));
        

        //find lenght of given string using lambda function
        System.out.println("Enter a string to find length");
        String str=sc.nextLine();
        len l=s1->s1.length();
        System.out.println("Lenght of given string: "+ l.s(str));

        //check given no is even or odd
         System.out.println("Enter a number to find even odd");
        int x1=sc.nextInt();
        evenodd e=(a)->{ return  (a%2==0)? "even": "odd" ; } ;
        System.out.println("given no is : "+ e.e(x1));
    }
}

public class Ternary_operator
{
    public static void main(String args[])
    {
        System.out.println("Ternary operator examples:");
        int a=15;
        System.out.println("1, a=15 equals to 10 or not:");
        String result=(a==10)?"equals to 10":"not equal to 10"; 
        System.out.println(result);

        //write a java program to find maximum of two numbers
        System.out.println("2, max of two number a1=15,a2=30:");
        int a1=15,a2=30;
        int result1=(a1>a2)?a1:a2;
        System.out.println(result1);

        //write a program to check number is positive or negative
        System.out.println("3, checking if no is +ve or -ve x=-3");
        int x=-3;
        String result2=(x>0)?"x is positive":"x is negative";
        System.out.println(result2);

        //write a program to check given number is odd or even
        System.out.println("4, checking if no is odd or even y=15");
        int y=15;
        String result3=((y%2)==0)?"y is even":"y is odd";
        System.out.println(result3);

        //write a program to find maximum of three
        System.out.println("5, maximum of three no x1=10,x2=13,x3=9");
        int x1=10,x2=13,x3=9;
        int result4=((x1>x2) && (x1>x3))?x1:((x2>x3)?x2:x3);
        System.out.println(result4);

        //write a program to find minimum of 4 numbers
         System.out.println("6, minimum of four no A=10,A1=13,A2=9,A3=4");
        int  A=10,A1=13,A2=9,A3=4;
        int result5=((A<A1) && (A<A2) && (A<A3))?A:(((A1<A2) && (A1<A3))? A1:((A2<A3)? A2:A3));
         System.out.println(result5);

        



    }
}
public class Swapping
{
    public static void main(String args[])
    {
        int a=10,b=20,temp;
        System.out.println("a="+a);
        System.out.println("b="+b);
        temp=a;
        a=b;
        b=temp;
        System.out.println("variables swapping using new variable.");
        System.out.println("After swaping:");
        System.out.println("a="+a);
        System.out.println("b="+b);
        int a1=5,b1=10;
        System.out.println("variables swapping w/o new variable.");
        System.out.println("a="+a1);
        System.out.println("b="+b1);
        a1+=b1;
        b1=a1-b1;
        a1=a1-b1;
        System.out.println("After swaping:");
        System.out.println("a="+a1);
        System.out.println("b="+b1);
        int A=15,B=3;
        System.out.println("value A="+A);
        System.out.println("value B="+B);
        System.out.println("shifting value of A to left using value of B");
        System.out.println("A<<B= "+(A<<B));
      
    }
}
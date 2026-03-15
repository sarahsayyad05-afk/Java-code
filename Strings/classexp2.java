// WAP to crete class reactangle having properties length and breath and
      // one member which calculate area of reactangle.

import java.util.Scanner;

class classexp2
    {
      int l;
      int b;
      void accept()
      {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a length");
        l=sc.nextInt();

        System.out.println("Enter a breadth");
        b= sc.nextInt();
      }
        void calculate()
        {
          System.out.println("Area of rectangle is : "+l*b);
        }
        public static void main(String args[])
        {
          classexp2 c = new classexp2();
          c.accept();
          c.calculate();
        }
    }
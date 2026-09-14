import java.util.Scanner;
public class nestedloops
{
    public static void main(String args[])
    {   Scanner  sc=new Scanner(System.in);
        
        int i,j,k;
        // for(i=1;i<=4;i++)
        // {
        //     for(k=1;k<=4-i;k++)
        //     {
        //         System.out.print(" ");
        //     }
        //     for(j=1;j<=i;j++)
        //     {
        //         System.out.print("*");
        //     }
        //     System.out.println();



        // }
        // for(i=4;i>=1;i--)
        // {
        //     for(k=1;k<i;k++)
        //     {
        //         System.out.print(" ");
        //     }
        //     for(j=4;j>=i;j--)
        //     {
        //         System.out.print(j);
        //     }
        //     System.out.println();


        // }

        // for(i=3;i>=1;i--)
        // {
        
        //     for(j=1;j<=i;j++)
        //     {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }


        // for(i=4;i>=1;i--) 
        // {
        //     for(j=1;j<=i;j++)
        //     {
        //         System.out.print(i);
        //     }
        //     System.out.println();
        // }
        

        // for(i=1;i<=4;i++) 
        // {
        //     for(j=4;j>=i;j--)
        //     {
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }


        //  for(i=4;i>=1;i--)
        // {
        //     for(k=1;k<=4-i;k++)
        //     {
        //         System.out.print(" ");
        //     }
        //     for(j=1;j<=i;j++)
        //     {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }


        //  System.out.print("Pyramid Pattern");

        // for(i=1;i<=3;i++)
        // {
        //     for(k=1;k<=3-i;k++)
        //     {
        //         System.out.print(" ");
        //     }
        //     for(j=1;j<=(2*i-1);j++)
        //     {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // System.out.println("Equilateral triangle");

        // for(i=1;i<=3;i++)
        // {
        //     for(k=1;k<=3-i;k++)
        //     {
        //         System.out.print(" ");
        //     }
        //     for(j=1;j<=i;j++)
        //     {
        //         System.out.print(" * ");
        //     }
        //     System.out.println();
        // }

        //  System.out.println("print diamond");
        // for (i=1; i<=3; i++)
        //  {
        //     for (k=3; k>i; k--) {
        //         System.out.print(" ");
        //     }
        //     for (j=1; j<= (2 * i - 1); j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        // for (i=2; i>=1; i--)
        // {
        //     for ( k=3; k>i; k--) {
        //         System.out.print(" ");
        //     }
        //     for ( j=1; j<=(2 * i - 1); j++) {
        //         System.out.print("*");
        //     }

        //     System.out.println();
        // }

        // int n=1;
        // System.out.println("number pattern");
        // for(i=1;i<=4;i++)
        // {
        
        //     for(j=1;j<=i;j++)
        //     {
        //         System.out.print(n);
        //         n++;
        //     }
        //     System.out.println();


        // }
        
        // char ch='A';

        // for(i=1;i<=3;i++)
        // {
        //     for(j=1;j<=3;j++)
        //     {
        //         System.out.print(ch);
        //     }
        //     ch++;
        //     System.out.println();
        // }

        // char ch1='A';
        // for(i=4;i>=1;i--)
        // {
        //     for(k=1;k<=4-i;k++)
        //     {
        //         System.out.print(" ");
        //     }
        //     for(j=1;j<=i;j++)
        //     {
        //         System.out.print(ch1);
        //     }
        //     ch1++;
        //     System.out.println();
        // }

        // int num;
        // System.out.println("enter no of rows");
        // num=sc.nextInt();
        // char ch2='a';
        // for(i=1;i<=num;i++)
        // {
        
        //     for(j=1;j<=i;j++)
        //     {
        //         System.out.print(ch2);
        //         ch2++;
        //     }
            
        //     System.out.println();


        // }
        //  System.out.println("enter no of rows");
        // int num1=sc.nextInt();
        // char ch3='A';

        // for(i=1;i<=num1;i++)
        // {
        //     for(k=1;k<=num1-i;k++)
        //     {
        //         System.out.print(" ");
        //     }
        //     ch3='A';
        //     for(j=1;j<=i;j++)
        //     {
        //         System.out.print(ch3+" ");
        //         ch3++;
        //     }
            
        //     System.out.println();
        // }
        // System.out.println("TCS interview que");
        // char ch4='A';
        // for(i=1;i<=3;i++) 
        // {
        
        //     for(j=1;j<=i;j++)
        //     {
        //         System.out.print(ch4);
        //         if(ch4>='A'&&ch4<='Z')
        //         {
        //             ch4=(char)(ch4+32);
        //         }
        //         else if (ch4>='a'&&ch4<='z')
        //         {
        //             ch4=(char)(ch4-32);
        //         }
        //         ch4++;
        //     }
            
        //     System.out.println();
        // }

        
        char c;
        for(i=1;i<=4;i++)
        {
            c='A';
            for(j=1;j<=i;j++)
            {
                System.out.print(c);
                c++;
            }
            
            System.out.println();
        }
        for(i=3;i>=1;i--)
        {
            c='A';
            for(j=1;j<=i;j++)
            {
                System.out.print(c);
                c++;
            }
            System.out.println();

        }

        

    }
}




        

    


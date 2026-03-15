//in java string is an non-primitive datatype
//string is a class in java. it is nothing but sequence of characters or array of character
// in java string objects are immutable(non changeable)
// to declare a string/ create a string there are 3 classes in java:
// 1)String 2) StringBuffer 3)StringBuilder

import java.util.Scanner;

class String_ex{
    public static void main(String[] args) {

        String s="Sarah"; //Compiletime initialization
        System.out.println(s);
        String s2= new String("Sarah");
        System.out.println(s2);

        byte[] b={97,98,99,100,101};
        char[]c={
            'A','B','C','D','E'
        };
        int[] u={97,98,99,100,101};

        //Method 1
        String s1= new String(b);
        System.out.println("Method 1: "+ s1);

        //Method 2

        String s3= new String(b,1,3);// offset 1, lenght:3
        System.out.println("Method 2: "+ s3);
        

        //Method 3

        String s4= new String(c);
        System.out.println("Method 3: "+ c);

    //    Method 4

        String s5= new String(b,1,3);// offset 1, lenght:3
        System.out.println("Method 4: "+ s5);
        
        //Method 5

        String s6= new String(u,1,3);// offset 1, lenght:3
        System.out.println("Method 5: "+ s6);
        


        System.out.println("write a java program to take students info from user");
        //roll.no,name,clg name,mbno, address

        Scanner sc=new Scanner(System.in);
       
        System.out.println("Enter student Name");
        String name= sc.nextLine();
        System.out.println("Enter student Roll no");
        int roll=sc.nextInt();
        sc.nextLine();

        System.out.println("Enter student College name");
     
        String clg=sc.nextLine();
        sc.nextLine();

        System.out.println("Enter student mobile no,");
    
        long m=sc.nextLong();

        System.out.println("Enter student address");
        String addr=sc.next();

        System.out.println();

        System.out.println("Student info:");
        System.out.println("Roll no: "+roll);
        System.out.println("Name: "+name);
        System.out.println("College name: "+clg);
        System.out.println("Mobile no: "+m);
        System.out.println("Address: "+addr);
        
        
    }
}
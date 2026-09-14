//Q to create a package name mathpack with 
//class calculator that provides method for add, substract, multiplication and division
//implement main class that takes user input and call respective methods based on switchstatement


//in package, the inheritance works like, each class must have an inidvidual file, 
//we cant inherit parent class properties in single file in package. 
//for ex: if parent class is A, it will have its own file without multiple classes in i
// class B extends A so make a new file for it, similarly for C extends A.
//Total 3 class in inheriance, so 3 diff and individual files will be create for each class
// but UNDER SAME PAKAGE FOLDER.
import java.util.Scanner;
import mathpack.*;
 public class importing_mathpack{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st number:");
       int a=sc.nextInt();
       System.out.println("Enter 2nd number:");
        int b=sc.nextInt();  
        System.out.println("--Calculator Operations--");
        System.out.println("1)Addition");
        System.out.println("2)Substraction");
        System.out.println("3)Multiplication");
        System.out.println("4)Division");
        System.out.println("Enter your choice (1-4)");
        calculator c=new calculator();
        area a1=new area();
        int abc= a1.area(a);
        System.out.println("Area: "+abc);
        
        int choice=sc.nextInt();
        switch(choice){
            case 1:
               
                
                int ans=c.add(a,b);
                System.out.println("Addition of two numbers: "+ans);
                break;
            case 2:
               
                
                int ans1=c.sub(a,b);
                System.out.println("Substraction of two numbers: "+ans1);
                break;
            case 3:
                double ans2=c.mul(a,b);
                System.out.println("Addition of two numbers: "+ans2);
                break;
            case 4:
                double ans3=c.div(a,b);
                System.out.println("Division of two numbers: "+ans3);
                break;
            default:
                System.out.println("Enter a valid Choice");
                break;


        }
    }

 }
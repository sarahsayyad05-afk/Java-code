// WAP to create a class empolyee with properties emp name , emp id,emp salary and emp position
// create one function named as getdata to get all detail of emp from user and display it and 
// accet for 2 emp.
import java.util.Scanner;
class empolyee
{
  String name;
  int id;
  float salary;
  String position;
  
  void getdata()
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter empolyee name: ");
    name = sc.nextLine();
    // sc.nextLine();

    System.out.println("Enter empolyee id: ");
    id = sc.nextInt();
    sc.nextLine();

    System.out.println("Enter empolyee position: ");
    position = sc.nextLine();
    
    System.out.println("Enter empolyee salary: ");
    salary = sc.nextFloat();

   }

  void display()
  {
    System.out.println("Empolyee name is : "+name);
    System.out.println("Empolyee id is : "+id);
    System.out.println("Empolyee salary is : "+salary);
    System.out.println("Empolyee position is : "+position);
  }

  public static void main(String args[])
  {
    empolyee e = new empolyee();
    empolyee e1 = new empolyee();
    System.out.println("enter detail of first empolyee");
    e.getdata();
    System.out.println("enter detail of second empolyee");
    e1.getdata();
    System.out.println(" detail of " +e.name+" empolyee");
    e.display();
    System.out.println(" detail of " +e1.name+" empolyee");
    e1.display();
  }
}
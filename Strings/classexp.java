
import java.util.Scanner;

// WAP to create class student with property name roll num college name phone no.create 
// an instance method to get all details of student named as get details and create one 
// function to print all details of student named as print details.
public class classexp 
{
  int roll;
  String name;
  String college_name;
  long phone_no;
  void getdetails()
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter name: ");
    name = sc.nextLine();
    
    System.out.println("enter roll no :");
    roll = sc.nextInt();

    sc.nextLine();
    System.out.println("enter college name : ");
    college_name=sc.nextLine();

    System.out.println("enter phone_no : ");
    phone_no=sc.nextLong();
  }
  void printdetail()
  {
    System.out.println("roll no: "+roll);
    System.out.println("name : "+name);
    System.out.println("college name : "+college_name);
    System.out.println("phone no : "+phone_no);
  

  }
  public static void main(String[] args) 
  {
    classexp c = new classexp();
    c.getdetails();
    c.printdetail();
    

  }
  
}

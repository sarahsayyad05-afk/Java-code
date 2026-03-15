// WAP to create class staff with data member name,basic salary,da,hra and calculate gross salary
// accept and display data for 1 staff 
// 1.where da=70%basic salary
// 2.hra= 30% basic salary
// 3.gross salary = da+hra+basic salary
import java.util.Scanner;
class staffep
{
  String name;
  float basic_salary;
  float da;
  float hra,gross_salary;
  void accept()
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter name :");
    name = sc.nextLine();

    System.out.println("Enter basic salary : ");
    basic_salary=sc.nextFloat();

  }
  void calculate()
  {
    da=basic_salary*0.7f;//70/100 7%
    hra=basic_salary*0.3f;// 30/100 30%
    gross_salary=da+hra+basic_salary;

  }
  void display()
  {
    System.err.println("staff name is : "+name);
    System.err.println("staff basic salary is : "+basic_salary);
    System.err.println("staff da is : "+da);
    System.err.println("staff hra is : "+hra);
    System.err.println("staff gross salary is : "+gross_salary);

  }

  public static void main(String[] args) 
  {
    staffep s = new staffep();
    s.accept();
    s.calculate();
    s.display();  
  }
  
}
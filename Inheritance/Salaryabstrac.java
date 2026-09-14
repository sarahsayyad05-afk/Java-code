import java.util.Scanner;
//emp class , ename,eid, two abstract method
//1 emp details(display emp detail)
//2. calculate salary
//create a constructor to initialize datamember of emp class
//create a class manager which extends class emp w data members bonus and basic salary
//calculate final salary using abstract methods
//create a class worker which extends employee class w datamembers salary,hourly rate, hours worked
//calculate final salary using abstract method

abstract class employee{
String ename;
int eid;
abstract void empdetails();
abstract void calculate();
employee(Scanner sc){
    sc.nextLine();
     System.out.println("Enter employee name: ");
     ename=sc.nextLine();
     System.out.println("ENter employee Id: ");
     eid=sc.nextInt();
     
}
}
class Manager extends employee{
   int bonus;
   int basic_salary;
    Manager(Scanner sc){
        super(sc);
     System.out.println("Enter employee salary: ");
      basic_salary=sc.nextInt();
     System.out.println("Enter employee bonus");
     bonus=sc.nextInt();
    }
    void empdetails(){
         System.out.println("Employee name: "+ename);
         System.out.println("Employee ID: "+eid);
         System.out.println("Employee Salary: "+basic_salary);
         System.out.println("Employee bounus: "+bonus);


    }
    void calculate(){
       basic_salary+=bonus;
       System.out.println("Employee Final salary: "+basic_salary);
    }
}

class worker extends employee{
    int hourlyrate;
    int hoursworked;
    int salary;
    worker(Scanner sc){
        super(sc);
        System.out.println("Enter hourly rate: ");
      hourlyrate=sc.nextInt();
     System.out.println("Enter hours worked");
     hoursworked=sc.nextInt();
     System.out.println("Enter salary");
     salary=sc.nextInt();
    
    }
        void empdetails(){
         System.out.println("Employee name: "+ename);
         System.out.println("Employee ID: "+eid);
         System.out.println("Employee Salary: "+salary);
         System.out.println("Employee hours worked: "+hoursworked);
         System.out.println("Employee hours worked: "+hourlyrate);
         

        }
    
     void calculate(){
       salary+=hourlyrate*hoursworked;
       System.out.println("Employee Final salary: "+salary);
    }
    
}
class Salaryabstrac{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Manager m=new Manager(sc);
       
        m.calculate();
        m.empdetails();
        worker w=new worker(sc);
        
        w.calculate();
        w.empdetails();
    }
}
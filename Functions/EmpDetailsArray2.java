import java.util.Scanner;

class employee{
    
  //define class emp , hving emp id name and salary, accept and display data for 4 emp
 //count how many employees earn more than 50000 salary
    int emp_id;
    String name;
    float sal;
     Scanner sc=new Scanner(System.in);
    void empdetail(){
         System.out.println("Enter Employee Name");
        name=sc.nextLine();
        System.out.println("Enter Employee ID:");
        emp_id=sc.nextInt();
         System.out.println("Enter Employee Salary");
        sal=sc.nextFloat();
       
    }
    void show(){
        
        System.out.println(name+" "+emp_id+" "+sal);
    }
}
class EmpDetailsArray2
{
    public static void main(String[] args) {
        int count=0;
        System.out.println("Q) define class emp , hving emp id name and salary, accept and display data for 4 emp ");
       employee [] e=new employee[4];
       for (int i = 0; i <e.length; i++) {
        System.out.println("Enter details of emp: "+(i+1));
        e[i]=new employee();
        e[i].empdetail();
           System.out.println();
       }
       for(int i=0;i<e.length;i++)
       {    System.out.println("Details of Employee: "+(i+1));
            if(e[i].sal>50000)
          {
               count++; 
          }
            e[i].show();
       }
       System.out.println();
       System.out.println("Employees who earn more than 50000: "+count);

    
    }
}
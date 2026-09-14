import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;
class EmployeeSystem {
     TreeSet<String> set;

    public EmployeeSystem() {
        set=new TreeSet<>();
    }
     
     void addemp(String empdetails){
        set.add(empdetails);
     }
     int gethighsal(){
         int max=0;
        for (String record : set) {
            String[] parts = record.split(":");
            int salary = Integer.parseInt(parts[1]);
            if (salary > max) {
                max = salary;
            }
        }
        return max;
     }
     int getLowestSalary() {
        int min = Integer.MAX_VALUE;
        for (String record : set) {
            String[] parts = record.split(":");
            int salary = Integer.parseInt(parts[1]);
            if (salary < min) {
                min = salary;
            }
        }
        return min;
    }
    ArrayList<String> listEmployeesAboveSalary(int amount) {
        ArrayList<String> result = new ArrayList<>();
        for (String record : set) {
            String[] parts = record.split(":");
            int salary = Integer.parseInt(parts[1]);
             if(salary> amount){
            result.add(parts[0]);

        }
    }
        return result;
    

    }
}
      

public class EmployeeSalaryMS {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EmployeeSystem system = new EmployeeSystem();

        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();
        sc.nextLine(); 
         System.out.println("Enter the record of "+ n+ " Employees");
        for (int i = 0; i < n; i++) {
           
            String details = sc.nextLine();
            system.addemp(details);
        }

        System.out.println("Highest Salary: " + system.gethighsal());
        System.out.println("Lowest Salary: " + system.getLowestSalary());

        System.out.print("Enter salary to filter: ");
        int filterSalary = sc.nextInt();

        List<String> aboveSalary = system.listEmployeesAboveSalary(filterSalary);
        System.out.println("Employees above given salary:");
        for (String emp : aboveSalary) {
            System.out.println(emp);
        }

}
}

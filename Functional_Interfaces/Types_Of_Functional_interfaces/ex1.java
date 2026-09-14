import java.util.function.*;

class Employee{
    int Sal;
    String ename;

    public Employee(int Sal, String ename) {
        this.Sal = Sal;
        this.ename = ename;
    }
    
}
public class ex1 {
    //create a class employee w datamembers employee
    //use constructor to initialize all data  members:  emp name and salary
    //find employee whos salary is higher than 30000 and print emp name in uppper case
    // generate a dummy employee using supplier
    public static void main(String[] args) {
        Employee emp=new Employee(35000,"Sarah");
        Supplier<Employee> e=()->new Employee(40000,"abc");

        System.out.println(e.get().ename);
        //  Supplier<Employee> e1=()->new Employee(40000,"abc");
         Predicate<Employee> p=n->  n.Sal> 30000;
         Consumer<Employee> s=num->  System.out.println(num.ename.toUpperCase());
         if(p.test(emp)){
             
             s.accept(emp);
         }
         

    }

}

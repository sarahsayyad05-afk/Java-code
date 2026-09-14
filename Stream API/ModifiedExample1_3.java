
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.*;
class Employee {   
	 int id;
	 String name;
	 String city;
	 double salary;

	public Employee(int id, String name, double salary,String city) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.city = city;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String toString() 
	{
		return "Employee [id=" + id + ", name=" + name + ", city=" + city + ", salary=" + salary + "]";
	}

}
 public class ModifiedExample1_3  {

	public static void main(String[] args) {

		List<Employee> employeeList = new ArrayList<>();

		employeeList.add(new Employee(6, "Six",49500.0, "Pune"));
		employeeList.add(new Employee(7, "Seven",27000.0, "Nagar"));
		employeeList.add(new Employee(3, "Three", 18000.0, "Hyderabad"));
		employeeList.add(new Employee(6, "Eight", 34500.0, "Pune"));
		employeeList.add(new Employee(9, "Nine", 11500.0, "Hyderabad"));

	    System.out.println(""+ employeeList.stream().map(x->x.getName() ).toList());

		 System.out.println("Sal > 25k: "+employeeList.stream().filter(x->x.getSalary()>25000).map(x->x.getName()).toList());
         
		 System.out.println(" Count of Sal > 20k:"+employeeList.stream().filter(x->x.getSalary()>20000).collect(Collectors.counting()));
		 
		 System.out.println(" first 3 employee:"+employeeList.stream().limit(3).toList());
		
		 System.out.println("Unique ID:"+employeeList.stream().map(x->x.getId()).collect(Collectors.toSet()));
		
		 Map<Integer,Double>  map=employeeList.stream().distinct().collect(
        
			Collectors.toMap( a->a.getId() , a-> a.getSalary(),(s1,s2)->s1));
       
			System.out.println("map: "+ map);
		
			System.out.println(" avg sal:"+employeeList.stream().collect(Collectors.groupingBy(x->x.getName(),Collectors.averagingDouble(x->x.getSalary()))));
        
			System.out.println("summing emp salary: "+employeeList.stream().collect(Collectors.summingDouble(a->a.getSalary())));

		
			System.out.println("emp counting: "+employeeList.stream().collect(Collectors.groupingBy(a->a.getName(),Collectors.counting())));
		}
}

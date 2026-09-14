import java.util.*;
import java.util.stream.Collectors;

class Person{
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
        public String getName() { return name; }
    public int getAge() { return age; }

    public String toString() {
        return name + " (" + age + ")";
    }
}

public class AdvStreamEx {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
            new Person("ABC", 30),
            new Person("PQR", 20),
            new Person("XYZ", 25),
            new Person("LMN", 18),
                        new Person("DMQ", 30)
        );
        System.out.println("Map: Get List of Name: "+ people.stream().map(a->a.getName()).toList());
        System.out.println("people over age 21: "+people.stream().filter(a->a.getAge()>21).toList());
        System.out.println("Sort by age: "+people.stream().map(a->a.getAge()).sorted().toList());
        System.out.println("Grouping by age: "+ people.stream().collect(Collectors.groupingBy(a->a.getAge(),Collectors.mapping(a->a.getName(),Collectors.toList()))));
        System.out.println("Sum of All Ages: "+ people.stream().collect(Collectors.summingInt(a->a.getAge())));
        System.out.println("first person over 25 : "+ people.stream().filter(a->a.getAge()>25).map(a->a.getName()).findFirst().get());
        System.out.println("first person under 20 : "+ people.stream().filter(a->a.getAge()<20).map(a->a.getName()).findFirst().get());
    
    


 



    }
}
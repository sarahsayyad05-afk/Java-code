import java.util.*;

class Student implements Comparable<Student>{
    int id;
    String name;
    Student(int id, String name){
        this.id=id;
        this.name=name;

    }
    @Override
    public int compareTo(Student s){
        // return this.name.compareTo(s.name); //compares by name
        return this.id-s.id; //compares by ID
    }
    @Override
    public String toString(){
        return id+" "+name;

    }
}
public class Comparable_ex {
    public static void main(String[] args) {
        TreeSet<Student> set=new TreeSet<>();
        set.add(new Student(3,"Sarah"));
        set.add(new Student(1,"Shivani"));
        set.add(new Student(2,"Dnyaneshwari"));
        System.out.println("Tree Set: "+set );
    }
}

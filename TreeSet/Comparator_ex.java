import java.util.Comparator;
import java.util.TreeSet;
class Student implements Comparator<Student>{
    int id;
    String name;
    Student(int id, String name){
        this.id=id;
        this.name=name;

    }
    @Override
    public int compare(Student s1,Student s2){
        if(s1.id==s2.id){
            return 0;
        }
        if(s1.id>s2.id){
            return -1;

        }
        else{
            return 1;
        }
       // return  s1.name.compareTo(s2.name)//compares by name
    }
    @Override
    public String toString(){
        return id+" "+name;

    }
}
public class Comparator_ex {
     public static void main(String[] args) {
        TreeSet<Student> set=new TreeSet<>(new Student(0,""));
        set.add(new Student(3,"Sarah"));
        set.add(new Student(1,"Shivani"));
        set.add(new Student(2,"Dnyaneshwari"));
        System.out.println("Tree Set: "+set );
    }
}

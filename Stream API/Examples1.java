import java.util.*;
import java.util.stream.*;

class emp{
    String ename;
    String ecity;
    String gender;
    public  emp(String e, String c, String g){
        ename=e;
        ecity=c;
        gender=g;
    }
    public String toString(){
        return  ename;
    }
}


public class Examples1 {
    public static void main(String[] args) {
        //Examples using Stream methods:

        //1. take a list of numbers from user and group numbers as even or odd

        // Scanner sc=new Scanner(System.in);
        // ArrayList<Integer> list=new ArrayList<>();
        // System.out.println("How many numbers u want to add in list?");
        // int n=sc.nextInt();
        // System.out.println("Enter "+ n + " numbers:"
        // );
        // for (int i = 0; i < n; i++) {
        //     list.add(sc.nextInt()); 
        // }
        // Map<String, List<Integer> >  evenodd=list.stream().collect(Collectors.groupingBy(x->x%2==0? " even ": " odd"));
      
        // System.out.println("Grouped By even odd values in list: "+ evenodd);

        // //2. group by name 
        // ArrayList<String> name=new ArrayList<>(Arrays.asList("Sarah","Shivani","Dnyaneshwari"));
        // Map< Character,List<String>>  grpbyName=name.stream().collect(Collectors.groupingBy(a->a.charAt(0) )); 
        // System.out.println("list grouped by name: "+ grpbyName);

        //3.create  a class employee w data memebers : ename, ecity and egender.
             //get employee count based on thier city
             //get employee based on thier gender.
        ArrayList<emp> list=new ArrayList<>();
        list.add(new emp("Sarah","Nagar","Female"));
        list.add(new emp("Abc", "Pune", "Male"));
        list.add(new emp("xyz","mumbai","Female"));
        System.out.println(list.stream().collect(Collectors.groupingBy(x->x.ecity)));//,Collectors.mapping(x->x.ename, Collectors.toList()))));
         System.out.println(list.stream().collect(Collectors.groupingBy(x->x.gender)));


        
    }
}

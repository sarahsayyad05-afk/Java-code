import java.util.*;
import java.util.stream.*;


public class exapmles {
       public static void main(String[] args) {
         //find Strings that strats w specific letter in given list

        ArrayList<String> list=new ArrayList<>(Arrays.asList("abc","hgadhj","adfjh","yqwted","acdvujha"));
        Stream<String> a=list.stream();
        System.out.println("List: "+ list);
        System.out.println("List element starting w a: "+ a.filter(a1-> a1.startsWith("a")).toList());

        //find multiple of 5 from given list and convert them into string.
        ArrayList<Integer> l=new ArrayList<>(Arrays.asList(20,25,30,21,14,12,45,10));
        System.out.println("List: "+ l);
        System.out.println("list of multiple of 5 : "+ l.stream().filter(x->x%5==0).map(x->x.toString()).toList());
         

        //convert every element of set to cube of element
        HashSet<Integer> set=new HashSet<>();
        set.add(2);
        set.add(15);
        set.add(3);
        set.add(4);
        System.out.println("Set: "+ set);
        System.out.println("Cube of set elements : "+ set.stream().map(x1->x1*x1*x1).toList());

        

    }
}


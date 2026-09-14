import java.util.*;
import java.util.function.*;
public class greaterthan5 {
    public static void main(String[] args) {
        ArrayList<String> a=new ArrayList<>(Arrays.asList("Sarah","Shivani","Dnyneshwari"));
        Predicate<String> a1=(a2)-> a2.length()> 5;
        for(String x: a){
            if(a1.test(x)){
                System.out.println("lenght greater than 5: "+ x);
            }
        }

    }
}

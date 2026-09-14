import java.util.ArrayList;
import java.util.List;
import java.util.function.*;

class Predicate_Functional_interface {
    public static void main(String[] args)
     {
        int n=21;
        Predicate<Integer> isEven = num1 -> num1 % 2 == 0;
        System.out.println(isEven.test(n));

        Predicate<Integer> isNotEven = isEven.negate();
        if(isNotEven.test(n)) 
            System.out.println(n+ " is not even!");

        Predicate<Integer> result = num1 -> num1 % 5 == 0;
        if(isEven.and(result).test(n)) 
                System.out.println(n + " is even and divisible by 5");

       int x[]={1,2,40,4,5,30,45,54};
       Predicate<Integer> p = num1 -> num1>3;
       for(int y:x)
       {
        if(p.test(y))
        System.out.print(y+" ");
       }
       System.out.println();

       List<String> names = new ArrayList<>();
       names.add("JAVA");
       names.add("C++");
       names.add("C");
       names.add("PHP");
       names.removeIf(name -> name.startsWith("C"));  
       System.out.println(names); 

      
       BiPredicate<Integer,Integer> p1=(a,b)->(a-b)>0;
       System.out.println(p1.test(10,20));
       System.out.println(p1.test(30,20));

       IntPredicate b=  n1->(n1%4)>0;
        System.out.println(b.test(4)); 
        System.out.println(b.test(7)); 

   
    //    LongPredicate
    // DoublePredicate 

}
    
}

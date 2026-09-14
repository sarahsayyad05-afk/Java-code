import java.util.List;
import java.util.function.*;

class Consumer_Functional_interface 
{
    public static void main(String[] args)
{
    Consumer<Integer> i = num -> System.out.println(-num);
    i.accept(5);
    i.accept(-8);

   Consumer<String> str= s -> System.out.println("Length of given string : "+s.length());
      str.accept("Java Progamming");

    Consumer<Integer> n1 = num -> System.out.print("Number: " + num);
        Consumer<Integer> n2 = num -> System.out.print(", Inverted: " + (-num));
        Consumer<Integer> n3 = num -> System.out.print(", Square, " + num * 2);
        Consumer<Integer> result = n1.andThen(n2).andThen(n3);
        result.accept(10);
        System.out.println();
   
    BiConsumer<String ,String> s1=(s,s2)-> System.out.println("Length of  two given string : "+(s.length()+s2.length()));
        s1.accept("Progamming","Java");

    DoubleConsumer d= d1->System.out.println(d1*2);
    d.accept(3.2);
    

    ObjDoubleConsumer<Integer> d2=(d3,d4)->System.out.println(d3+d4);
    d2.accept(2,4.2);

    List<Integer> list = List.of(1, 2, 3, 4, 5);
    list.forEach(a-> System.out.println("Number: " + a)); 
    
}  

    
}

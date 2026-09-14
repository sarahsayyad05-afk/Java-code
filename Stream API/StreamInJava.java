import java.util.*;
import java.util.stream.*;

public class StreamInJava {
    public static void main(String[] args) {
        //Stream is an Sequence of Object
        Stream<String> emptyStream=Stream.empty();
        System.out.println("Empty Stream: "+emptyStream);
         System.out.println("Empty Stream List: "+emptyStream.toList());
         //2 stream of collections
         ArrayList<String> collection=new ArrayList<>(Arrays.asList("a","b","c"));
         Stream<String> streamofCollection=collection.stream();
        System.out.println("stream of collection: "+streamofCollection.toList());
        // 3. using Stream.of() method
        Stream<Integer> streamOfinteger=Stream.of(1,2,3,4,5,6,7,8,9);
        //4. Stream from an array using Arrays.stream()
        String[] arr=new String[]{
            "a","b","c"
        };
        Stream<String> streamofStrings=Arrays.stream(arr);

        //intermidiate operations
        List<Integer> l=List.of(1,2,34,5,6,7,70);
            // filter: filters out list
            System.out.println("Filtered Stream: "+l.stream().filter(x->x%2==0));
            System.out.println("Filtered Stream: "+l.stream().filter(x->x%2==0).toList());
            //map: chnages elements of list
            List<Integer> a= Arrays.asList(1,2,3,4,5);
            System.out.println("Original:"+ a);
            System.out.println("Original:"+ a.stream().map(n->n*n).toList());
            //distinct: removes duplicates
             List<Integer> a1= Arrays.asList(1,2,3,4,5,1,2,4);
              List<Integer> b= a1.stream().distinct().collect(Collectors.toList());
              System.out.println("Original list w duplicates: "+ a1);
              System.out.println("Original list without duplicates: "+ b);
            
              //sorted
              System.out.println("Sorted List: "+ a1.stream().sorted().toList());
              //limit
              System.out.println("List after Limit: "+ a1.stream().limit(3).toList());
              //skip
              System.out.println("Lister after skipping first 3 elements: "+ a1.stream().skip(3).toList());

                List<String> str=List.of("C","PHP","Java","C++","Python");

     //Terminal operation
       //count
         System.out.println("Count : "+str.stream().count());
          //anyMatch
       System.out.println("anyMatch(): "+str.stream().anyMatch((value) -> value.startsWith("Java")));
    //allMatch
        System.out.println("allMatch(): "+str.stream().allMatch((value) -> value.startsWith("Java")));
    //noneMatch
        System.out.println("NoneMatch(): "+str.stream().noneMatch((value) -> value.startsWith("Java")));
    //findAny()
    System.out.println("findAny(): "+str.stream().findAny().get());
    //findFirst()
    System.out.println("findFirst(): "+str.stream().findFirst().get());

    //forEach
    str.stream().forEach(x->System.err.println(x));

    //toArray
    System.out.println("toArray():"+ Arrays.toString(str.stream().toArray()));


    //collect
    System.out.println("collect : "+str.stream().map(x->x.toUpperCase()).peek(x->System.out.println(x)).collect(Collectors.toList()));

   //min
   System.out.println("Minimum : "+str.stream().min((s1,s2)->s1.compareTo(s2)).get());

   //max
   System.out.println("Maxmimum :"+str.stream().max((s1,s2)->s1.compareTo(s2)).get());

   //reduce
   
   
   String result = str.stream().reduce("", (s1, s2) -> s1 + " " + s2);
   System.out.println(result);
   

   List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
   int sum = numbers.stream().reduce(0, (n1, n2) -> n1+n2); 
   System.out.println("Sum: " + sum);

    



    }
}

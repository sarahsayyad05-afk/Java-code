import java.util.ArrayList;
import java.util.Iterator;
public class Arraylistdemo {
    public static void main(String[] args) {
        ArrayList<String> fruits=new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana"); 
        fruits.add("Cherry");
        fruits.add("Date");
        
        System.out.println("Size of list :"+fruits.size());
        System.out.println("IS the List empy:"+fruits.isEmpty());

        System.out.println("First fruit:"+fruits.get(0));
        fruits.set(1, "Blueberry");
        System.out.println(fruits.remove(2));
       
        System.out.println("Fruits in the list");
        for (String fruit: fruits){
            System.out.println(fruit);

        }
        System.out.println("fruits in the list using index");
        for( int i=0;i< fruits.size();i++){
            System.out.println(fruits.get(i));
        }
        System.out.println("fruits in the list using method reference");
        fruits.forEach(System.out::println);
        System.out.println("fruits in the list using lambda expression");
        fruits.forEach(fruit->System.out.println(fruit));

        Iterator<String> it=fruits.iterator();
        while(it.hasNext()){
            System.out.print(it.next()+"");
        }

        
    }
}

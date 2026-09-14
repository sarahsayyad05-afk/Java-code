import java.util.*;
public class TreeSetex {
    public static void main(String[] args) {
        TreeSet<Integer> set=new TreeSet<>();
        set.add(100);
        set.add(20);
        set.add(30);
        set.add(40);
        set.add(5);
        set.add(10);
        set.add(12);
        set.add(15);
        System.out.println("TreeSet: "+set);
        System.out.println("Size of treeset: "+set.size());
        System.out.println("isEmpty: "+set.isEmpty());
        System.out.println("contains(): "+set.contains(20));
        set.remove(30);
        System.out.println("After removing: "+set);

        //Specific TreeSet methods:
        System.out.println("fist() returns first element: "+set.first());
        System.out.println("last() returns last element: "+set.last());
        System.out.println("Higher than 20: "+set.higher(20));
        System.out.println("Lower than 20: "+ set.lower(20));
        System.out.println("Ceiling 25: "+set.ceiling(25));
        System.out.println("Floor 25: "+set.floor(25));
         System.out.println("Headset: "+set.headSet(20));
          System.out.println("tailset: "+set.tailSet(20));
           System.out.println("subset: "+set.subSet(10, 30));
        TreeSet<Integer> decending=new TreeSet<>(Comparator.reverseOrder());
        decending.addAll(set);
        System.out.println(" Decending treeset:"+decending);
       
        TreeSet<StringBuffer> sb=new TreeSet<>();
        sb.add(new StringBuffer("A"));
        sb.add(new StringBuffer("X"));
        sb.add(new StringBuffer("Y"));
        sb.add(new StringBuffer("K"));
        sb.add(new StringBuffer("M"));
        System.out.println("String Tree Set: "+sb);
        

        // //iterating through treeset:
        System.out.println("iterating using for-each");
        for(int x:set){
            System.out.println(x);
        }
        System.out.println("iterating usig iterator");
        Iterator<Integer> i=set.iterator();
        while (i.hasNext()) {
           System.out.println(i.next());
            
        }


    }
}

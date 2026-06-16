import java.util.ArrayList;
import java.util.Collections;
import java.util.Arrays;
import java.util.List;

public class CollectionClass {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("abc");
        list.add("egw");
        list.add("sdfdsg");
        list.add("jkl");
        list.add("dwwe");
        System.out.println(list);
        System.out.println("Sorted List");
        Collections.sort(list);
        System.out.println(list);

        Collections.sort(list,Collections.reverseOrder());
        System.out.println("sort list in desending order"+list);

        Collections.reverse(list);
         System.out.println("Reversed List : "+list);

         //Swaping
         Collections.swap(list,1,3);
         System.out.println(list);
         Collections.shuffle(list);
         System.out.println("After shuffle: "+list);
         Collections.rotate(list,1);
          System.out.println("After rotation: "+list);
          ArrayList<String> l=new ArrayList<>();
          l.add("");
          l.add("abc");
          l.add("");
          l.add("");
          l.add("");
          Collections.fill(l,"1");
          System.out.println(l);
           System.out.println("SOURCE LIST: "+list);
            System.out.println("destination list: "+l);
            Collections.copy(l,list);
            System.out.println(list);
            System.out.println(l);

        Collections.sort(list);
        int index=Collections.binarySearch(list,"abc");
        System.out.println(index);
        System.out.println(Collections.frequency(list,"abc"));
        ArrayList<Integer> l1=new ArrayList<>(Arrays.asList(2,3,4,5,6,19,1,44));
         System.out.println("minimum element: "+ Collections.min(l1));
         System.out.println("maximum element: "+ Collections.max(l1));
         
         //immutable version of list:
         List<Integer> L=Collections.unmodifiableList(l1);
         L.add(8);
          System.out.println(L);

          




          
    }
}

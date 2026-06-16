import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
public class CollectionExamples {
    public static void main(String[] args) {
        //rotate list by n position.(take n from user)
        Scanner sc=new Scanner (System.in);
        int n;
        int f;
        ArrayList<Integer> list=new ArrayList<>(Arrays.asList(10,14,16,17,22,2,8));
        System.out.println("List: "+ list);
        System.out.println("By how many position you want to rotate the list:");
        n=sc.nextInt();
        Collections.rotate(list,n);
        System.out.println("Rotated List: "+list);

        //Find Missing number from the list [1,2,4,5]
        ArrayList<Integer> l=new ArrayList<>(Arrays.asList(1,2,4,5));
         System.out.println("List: "+ l);
         for (int i = 1; i <=l.size(); i++) {
           f= Collections.frequency(l,i);
            if(f==0){
                System.out.println("Missing Number: "+i);
            }
             
         }

         //check given list is palindrome or not
         ArrayList<Integer> l1=new ArrayList<>(Arrays.asList(1,2,2,1));
          System.out.println("List: "+ l1);
           ArrayList<Integer> r=new ArrayList<>(l1);
          
           Collections.reverse(r);
           if(l1.equals(r)){
            System.out.println("Given List is Palindrome");
           }
           else{
            System.out.println("Given List is not Palindrome");
           }
         

    }
}

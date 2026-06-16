import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
public class Arraylistex{
    public static void main(String[] args) {

        // // write a program to count even numbers in array list
        // ArrayList<Integer> a= new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        // int count=0;
        // System.out.println("Enter how many numbers u want to enter:");
        // int n=sc.nextInt();
        // System.out.println("Enter "+ n +" numbers:");
        // for (int i = 0; i <n; i++) {
        //     a.add(i,sc.nextInt()); 
        // } 
        
        // // // Using Iterator:
        // // Iterator<Integer> It=a.iterator();
        // // while (It.hasNext()) {
        // //    int b=It.next();
        // //    if(b%2==0){
        // //     count+=1;
        // //    }
            
        // // }
        // // System.out.println("In the ArrayList there are "+ count + " even numbers");
 

        // // //Using For each:
        // for(int x:a){
        //     if(x%2==0){
        //         count++;
        //     }
        // }

        // System.out.println("Total even numbers: "+count);


    //     //write a program to seperate even and odd numbers from given list
 
    //    ArrayList<Integer> num= new ArrayList<>();
    //    ArrayList<Integer> even= new ArrayList<>();
    //    ArrayList<Integer> odd= new ArrayList<>();
       
    //     System.out.println("Enter how many numbers u want to enter:");
    //     int n1=sc.nextInt();
    //     System.out.println("Enter "+ n1 +" numbers:");
    //     for (int i = 0; i <n1; i++) {
    //         num.add(i,sc.nextInt()); 
    //     } 
    //      for(int i:num){
    //         if(i%2==0){
    //             even.add(i);
    //         }
    //         else{
    //             odd.add(i);
    //         }
    //     }
    //     System.out.println("Given list:");
    //     System.out.println(num);
    //     System.out.println("Even numbers list");
    //     System.out.println(even);
    //     System.out.println("Odd number list");
    //     System.out.println(odd);

        // //adding elements in arraylist using asList() function
        // // another way of delcaring ArrayList:
        
        // ArrayList<Integer> l=new ArrayList<>(Arrays.asList(1,2,3,4));
        // System.out.println(l);
        // l.add(200);
        // System.out.println(l);

         // // Merged two lists using asList
        // ArrayList<Integer> a=new ArrayList<>(Arrays.asList(1,2,10,20,30));
        // ArrayList<Integer> a1=new ArrayList<>(Arrays.asList(2,13,14));
        // a.addAll(a1);
        // System.out.println(a);

        // //remove duplicates from arrylist
        //  ArrayList<Integer> al=new ArrayList<>(Arrays.asList(2,1,11,14,16,77,2,11,1,19));
        //  ArrayList<Integer> n=new ArrayList<>();
        //  for(int x:al){
        //     if(!(n.contains(x))){
        //           n.add(x);  
        //      }
        //  }
        //  System.out.println("Main List:");
        //  System.out.println(al);
        //  System.out.println("List without duplicates");
        //  System.out.println(n);

        //  //print common element from 2 lists
        //  ArrayList<Integer> l1=new ArrayList<>(Arrays.asList(1,2,3));
        //  System.out.println("List 1: "+l1);
        //   ArrayList<Integer> l2=new ArrayList<>(Arrays.asList(2,3,4));
        //   ArrayList<Integer> ans=new ArrayList<>();
        //  System.out.println("List 2: "+l2);
        //  for(int ab:l1){
        //     if(l2.contains(ab)){
        //         ans.add(ab);
        //     }
        //  }
        //  System.out.println("common elements of l1,l2: "+ans);
         ArrayList<Integer> alist=new ArrayList<>(Arrays.asList(10,300,100,20));
         System.out.println("List: "+alist);
         int max=0;
         for(int y:alist){
            if(y>max){
                max=y;
            }
         }
         System.out.println("maximum element of list: "+ max);
         System.out.println(alist.remove(0));//if we pass object instead of index it returns true/false.
         System.out.println(alist);

         //rotate given list by 1 position. i.e it just shifts the position of rest of the array
          ArrayList<Integer> s=new ArrayList<>(Arrays.asList(10,20,30,40));
         System.out.println("List:"+s); 
         // s.remove(3); 
         s.remove(s.size()-1); //a=s.remove(s.size()-1);
         s.add(0,40);   //s.add(0,a);     
         System.out.println("Rotated List: "+s);  
        

         //return 2nd largest number in given list or array
         ArrayList<Integer> L =new ArrayList<>(Arrays.asList(100,20,30,90,80));
         Collections.sort(L);
          System.out.println("List: "+L); 
          int index=L.size()-2;
           System.out.println("2nd largest element in List: "+ L.get(index)); 
         





        

    }
}
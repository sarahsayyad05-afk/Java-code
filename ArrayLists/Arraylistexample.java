import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
public class Arraylistexample {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<String> Name=new ArrayList<>();

        System.out.println("How many students data u want to insert?");
        int n=sc.nextInt();
        sc.nextLine();
        
        for (int i = 0; i < n; i++) {
            System.out.println("Enter student "+(i+1)+" name");
            Name.add(i,sc.nextLine());
        }

        System.out.println("Student Names:");

       for(String s: Name){
        System.out.println(s);
       }

       System.out.println("what u want to remove?");
       String a=sc.nextLine();

       
        System.out.println("Updated list:");
       //    Name.remove("abc");
       //    System.out.println(Name);
       Iterator<String> i=Name.iterator();
       while(i.hasNext()){
        String f=i.next();
           if(f.equals(a)){
            i.remove();

           }
           else{    
            System.out.println(f);
           }
       }
       

    }
}

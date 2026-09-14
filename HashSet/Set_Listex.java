import java.util.ArrayList;
import java.util.Arrays;


public class Set_Listex {
    public static void main(String[] args) {
        ArrayList<Integer> set=new ArrayList<>(Arrays.asList(10,20,30,40,10,20));
         ArrayList<Integer> n=new ArrayList<>();
        for(int a:set){
        
            if(!(n.contains(a))){
                  n.add(a);  
             }
             else{
                System.out.println("First occurance duplicate: "+ a);
                break;
             }
         
        }
        
    }
}

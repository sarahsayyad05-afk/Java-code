import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class comparatorusingLambda {
    public static void main(String[] args) {
        ArrayList<Integer> a=new ArrayList<>(Arrays.asList(12,15,11,19,8));
        System.out.println("List : "+a);
        Comparator<Integer> c=(i,j)->(i<j)?1:((i>j)? -1:0);
        Collections.sort(a,c);
        System.out.println("List in decending: "+a);

    }

}

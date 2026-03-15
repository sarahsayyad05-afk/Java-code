import java.util.Arrays;
import java.util.Scanner;
class programs
{
    public static void main(String[] args)
    { 
    //  System.out.println("sort an array in decending order");
    //     int a[]={200,18,77,2,55,9,0};
    //     Arrays.sort(a);
    //     for (int i =a.length-1; i>=0; i--) {
          
    //         System.out.println("Array a in decending order"+a[i]);
            
    //     }
        
    //     System.out.println("Q: create an array in which vale from index 2 to 5 is 9 and remaining is 0");
    //     int a1[]=  new int[8];
    //     Arrays.fill(a1,2,5,9);
    //     System.out.println("Array a1: "+ Arrays.toString(a1));
        

    //     System.out.println("Q: create a new array from given array from index 1 to 4");
    //     int b[]={1,4,5,7,2,9,1,0,2};
    //     int copyb[]=Arrays.copyOfRange(b,1,4);
    //     System.out.println("Array given b: "+Arrays.toString(b));
    //     System.out.println("new array created from b: "+Arrays.toString(copyb));

    //     System.out.println("Q:find second largest number from array");
        Scanner sc=new Scanner(System.in);
    //     int arr[]=new int[5];
    //     System.out.println("Enter Array elements(5): ");
    //     for (int i = 0; i <arr.length; i++) {
    //         arr[i]=sc.nextInt();
            
    //     }
    //     Arrays.sort(arr);
    //     System.out.println("2nd largest element in array: "+arr[arr.length-2]);

    //     System.out.println("Q:find minimum and maximum element from array");
    //     int arr1[]=new int[5];
    //      System.out.println("Enter Array elements(5): ");
    //     for (int i = 0; i <arr1.length; i++) {
    //         arr1[i]=sc.nextInt();
            
    //     }
    //     Arrays.sort(arr1);
    //     System.out.println("smallest element= "+arr1[0]);
    //     System.out.println("largest element= "+arr1[arr.length-1]);


        System.out.println("q: find given key is present in array or not, if present then return its index");
        int arr2[]=new int[5];
        System.out.println("Enter Array elements(5): ");
        for (int i = 0; i <arr2.length; i++) {
            arr2[i]=sc.nextInt();
            
        }
        Arrays.sort(arr2);
        System.out.println("Enter key to search in Array: ");
        int n=sc.nextInt();
        int result=Arrays.binarySearch(arr2,n);
        if(result>=0)
             System.out.println("Key found at index: "+result);
        else
            System.out.println("Key not found"); 
        




        
        

        
   }
}
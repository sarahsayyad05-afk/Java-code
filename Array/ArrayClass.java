import java.util.Arrays;
import java.util.List;
class ArrayClass
{
    public static void main(String[] args)
     {
        int a[]={10,2,30,4,50};
        System.out.println("toString() for 1D array: "+Arrays.toString(a));

        int b[][]={
            {1,2},
            {3,4}
        };
        // System.out.println("toString() for 2D array: "+Arrays.toString(b));
        // System.out.println("deepToString() for 2D array: "+Arrays.deepToString(b));
        //  System.out.println("copyOf(arrayname,lenght) for 1D array: "+Arrays.toString(Arrays.copyOf(a,2)));

        String []ch={"abc","pqr","xyz","mnq","def"};
        //  System.out.println("copyOfRange(arrayname,from,to)for 1D array: "+Arrays.toString(Arrays.copyOfRange(ch,2,6)));
        //  System.out.println("copyOfRange(arrayname,from,to)for 1D array: "+Arrays.toString(Arrays.copyOfRange(a,3,7)));
        // System.out.println("copyOfRange(arrayname,from,to)for 1D array: "+Arrays.toString(Arrays.copyOfRange(ch,2,8)));

        // int a1[]= new int[8];
        // System.out.println("Array without initiallization: "+Arrays.toString(a1));
        // Arrays.fill(a1,10);
        // System.out.println("Fill(array,value): "+Arrays.toString(a1));
        // Arrays.fill(a1,3,6,1);
        // System.out.println("Fill(array,from,to,value):"+Arrays.toString(a1));

        

        int a2[]={0,2,3,5,5,6};
        int b1[]={1,2,3,2,5,6};
        // System.out.println("equals(array1,array2): (this compares the content inside both arrays) "+Arrays.equals(a2,b1));
        // System.out.println("a2==b1: (this compares the address of both arrays)"+ (a2==b1));
        // int  b2[]=a2;
        // System.out.println("a2==b2: (this compares the address of both arrays now it haves same reference)"+ (a2==b2));
        // // if both array are equal  then it returns 0
        // // if a1>a2 it returns 1
        // // if a1<a2 it returns -1

        // System.out.println("compare(array1,array2): "+Arrays.compare(a2,b1));

        // int c[]={45,89,2,6,99,77,12,5,7};
        // int c1[]={55,7,9,111,8,100};
        // System.out.println("Array c: "+Arrays.toString(c));
        // Arrays.sort(c);
        // System.out.println("Array c after sorting: "+Arrays.toString(c));


        // Arrays.sort(ch);
        // System.out.println("Array ch after sorting: "+ Arrays.toString(ch));

        // Arrays.sort(c1,2,4);
        // System.out.println("Array ch after sorting: "+ Arrays.toString(c1));


        // System.out.println("write a java program to take elements of two array from user and check both the array are same or not ");
        // Scanner sc=new Scanner(System.in);
        // int arr[]=new int[5];
        // int arr1[]=new int[5];
        // System.out.println("Enter Array1 elements (5): ");
        // for (int i = 0; i <arr.length; i++) {
        //     arr[i]=sc.nextInt();
        // }
        // System.out.println("Enter Array2 elements (5): ");
        // for (int i = 0; i <arr1.length; i++) {
        //     arr1[i]=sc.nextInt();
        // }
        // int ans=Arrays.compare(arr,arr1);
        // System.out.println("comparing both array="+ans);
        // if(ans==0)
        //      System.out.println("Both the arrays are equal/same");
        // else if(ans>0)
        //     System.out.println("Array1 is greater than Array2");
        // else
        //     System.out.println("Array2 is greater than Array1");

        int b3[][]={
           {1,2},
            {3,4}
        };
        System.out.println("Array b equal b3"+Arrays.equals(b,b3));
        System.out.println("Array b equal b3"+Arrays.deepEquals(b,b3));
        

        Arrays.sort(a);
        System.out.println("Binarysearch(array,key):"+Arrays.binarySearch(a,4));
        System.out.println("Binarysearch(array,from,to,key):"+Arrays.binarySearch(a,2,4,2));
        System.out.println("missmatch(array1,array2): "+Arrays.mismatch(a2,b1));
        System.out.println("missmatch(array1,from,to,array2,from,to): "+Arrays.mismatch(a2,1,5,b1,1,5));


        System.out.println("List(array,value): "+Arrays.asList(ch));
        List<String> i=Arrays.asList(ch);
        System.out.println("List of array: "+i);


        
























     } 
}
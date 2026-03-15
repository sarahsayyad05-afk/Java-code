import java.util.Scanner;
public class examples
{
    public static void main(String args[])
    //ARRAY IS AN OBJECT DEPENDING ON ITS DATA
    {   Scanner  sc=new Scanner(System.in);
        // System.out.println("accept 5 employee salary from user and calculate total salary and average of salary of 5 employee");
        // int []sal=new int[5];
        // int sum=0;
        // System.out.println("Enter salary of 5 employees");
        // for (int i = 0; i <sal.length; i++) {
        //     sal[i]=sc.nextInt();
        //     sum=sum+sal[i];
        // }
        // int avg=sum/5;
        // System.out.println("Total salary of 5 employees= "+sum);
        // System.out.println("Average of total salary= "+avg);
        

        // System.out.println("find maximum and minimum number from array");
        // int n;
       
        // System.out.println("enter array size=");

        // n=sc.nextInt();
        // int a[]=new int[n];
        //  System.out.println("Enter Array elements");
        // for (int i = 0; i <a.length; i++) {
        //     a[i]=sc.nextInt();
        
        // }
        // int min=a[0],max=a[0];
        // for(int i=0; i<a.length ; i++)
        // {
            
        //    if(a[i]>max)
        //    {
        //     max=a[i];
        //    }
        //    if(a[i]<min)
        //    {
        //     min=a[i];
        //    }
            
        // }
        // System.out.println("Minimum number of array= "+min);
        // System.out.println("Maximum number of array= "+max);


        // System.out.println("Resverse a given array");
        // int [] a1=new int[5];
        // System.out.println("Enter Array elements");
        // for (int i = 0; i <a1.length; i++) {
        //     a1[i]=sc.nextInt();
        
        // }
        // for( int i=a1.length-1; i>=0; i--)
        // {
        //     System.out.println("Reversed list="+ a1[i]);
        
        
        // }
        // System.out.println("Copy one array into another array");
        // int [] Array1=new int[5];
        // int [] Array2=new int[5];
        // System.out.println("Enter Array1 elements (five)");
        // for (int i = 0; i <Array1.length; i++) {
        //     Array1[i]=sc.nextInt();
        
        // }
        //  System.out.println("Elements of Array1= ");
        // for(int c: Array1)
        // {
        //     System.out.print(c+" ");
        // }
        // for (int i = 0; i <Array1.length; i++) {
        //     Array2[i]=Array1[i];
        
        // }
        // System.out.println();
        // System.out.println("Elements of Array1 copied in Array 2= ");
        // for(int d: Array2)
        // {
        //     System.out.print(d+" ");
        // }

        // System.out.println("merge two array and store in another one");
        // int A1[]={1,2,3};
        // int A2[]={4,5,6};
        // int A3[]= new int[A1.length+A2.length];
        // for (int i = 0; i <A1.length; i++) {
        //     A3[i]=A1[i];
        // }
        // for (int i =0; i<A2.length; i++) {
        //         A3[A1.length+i]=A2[i];
        //     }
        // System.out.println("Elements of Array1 and Array 2 Merged= ");
        // for(int e: A3)
        // {
        //     System.out.print(e+" ");
        // }
        
        // System.out.println("Q:search given number in an array, if number is found return index of element else retur -1");
        // int A[]=new int [5];
        // int f=-1;
        // System.out.println("Enter Array element(5)=");
        // for (int i = 0; i < 5; i++) {
        //     A[i]=sc.nextInt();
        // } 
        // System.out.println("Enter Key to search=");
        // int key=sc.nextInt();
        // for (int i = 0; i < 5; i++) {
        //     if(A[i]==key)
        //     {
        //        f=i;

        //        break;
        //     }
            
        // }
        // if(f==-1)
        // {
        //     System.out.println("key not found");
        // }
        // else{
        //     System.out.println("Key found at index="+f);
        // }

        // System.out.println("Q:Duplicate elements in array ");
        // int B[]=new int[5];
        // System.out.println("Enter Array Elements=");
        // for (int i = 0; i < B.length; i++) {
        //     B[i]=sc.nextInt();
        // }
        // for (int i = 0; i < B.length; i++) {
        //     for (int j = i+1; j <B.length; j++)
        //     {
        //         if(B[i]==B[j])
        //         {
        //            System.out.println("Duplicate element="+B[i]);
        //         }

        //     }        
            
        // }
        // System.out.println("2 SUM PROBLEM 'IMP'");
        // System.out.println("Q: Given an array of integers 'nums' and an integer 'target' returns indices of two numbers such that they add upto target");
        // System.out.println("Note= u may not use same element twice, u may assume exactly one solution exist");
        // int nums[]= new int[5];
        //  System.out.println("Enter Array Elements (enter elements only once which can meet the solution)=");
        // for (int i = 0; i < nums.length; i++) {
        //   nums[i]=sc.nextInt();
        // }
        // System.out.println("Enter Target= ");
        // int target=sc.nextInt();

        // for (int i = 0; i < nums.length; i++) {
        //     for (int j = i+1; j <nums.length; j++) {
        //         if(nums[i]+nums[j]==target)
        //         {
        //              System.out.println("Index of elemnts which sums up to target"+i);
        //              System.out.println(j);
        //              break;
                     
        //         }

        //     }
        // }
        System.out.println("Q: sort an array in accending order");
        int D[]=new int [5];
        System.out.println("Enter Array element(5)=");
        for (int i = 0; i < 5; i++) {
            D[i]=sc.nextInt();
        } 
        
        for (int i = 0; i <D.length; i++) {
            for (int j = i+1; j <D.length; j++) {
                if(D[i]>D[j])
                {
                    int temp=D[i];
                    D[i]=D[j];
                    D[j]=temp;
                }

                
            }
            
        }
       System.out.println("Sorted array=");
       for(int ac: D)
       {
        System.out.print(ac+" ");
       }

        




            
        

        



        


        
        
        
        

    }
}

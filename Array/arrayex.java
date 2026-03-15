import java.util.Scanner;
public class arrayex
{
    public static void main(String args[])
    //ARRAY IS AN OBJECT DEPENDING ON ITS DATA
    {   Scanner  sc=new Scanner(System.in);
        // int [] r={1,2,3,4,5,6};
        // float[]a= new float[5];
        // a[0]=12;
        // a[1]=4;
        // a[2]=5;
        // a[3]=10;
        // a[4]=20;
        // System.out.println(r[3]);
        // System.out.println(a);
        // System.out.println("first "+a[0]);
        // System.out.println("second "+a[1]);
        // System.out.println("third "+a[2]);
        // System.out.println("fourth "+a[3]);
        // System.out.println("fifth "+a[4]);

        // System.out.println("Traversing of an array(USING FOR LOOP)");
        // for (int i = 0; i <a.length; i++) {
        //     System.out.println(a[i]);
            
        // }

        // System.out.println("Traversing of an array(USING FOR-EACH LOOP)");
        // for(float a1 : a)
        //  // SYNTAX: for( datatype variable_name: array name)
        // {
        //     System.out.println(a1);

        // }

        // // EXAMPLES:
        // System.out.println("1:create array of 5 students marks,");
        // System.out.println("access them and update marks of 2nd student to 35. Print updated marks of 5 values");

        // int [] marks={70,40,50,80,65};
        // for(int m1: marks)
        // {
        //     System.out.print(m1+" ");
        // }

        // marks[1]=35;
        // for(int m: marks)
        // {
        //     System.out.println( m);
        // }
        // System.out.println("2:write a program to take rollno of 5 students from user and display it");
        // int roll[]=new int[5];
        // System.out.println("Enter Array Elements=");
        // for (int i = 0; i < roll.length; i++) {
        //     roll[i]=sc.nextInt();
            
        // }
        // System.out.println("Roll no of 5 students=");
        // for (int b: roll) {

        //     System.out.println(b);
        // }

        // // System.out.println("DYNAMIC ARRAY");
        // //  System.out.println("3:write a program to take rollno of students from user and display it");
        // // System.out.println("Enter the size/ number of rollno.");
        // // int n=sc.nextInt();
        // // int roll1[]=new int[n];
        // // System.out.println("Enter Array Elements=");
        // // for (int i = 0; i < roll1.length; i++) {
        // //     roll1[i]=sc.nextInt();
            
        // // }
        // // System.out.println("Roll no of"+n+"students=");
        // // for (int b1: roll1) {

        // //     System.out.println(b1);
        // // }

        // System.out.println("4:add elements of an array and print the sum of all elements");
        // System.out.println("Enter the size/ number of rollno.");
        // int sum=0;
        // int n1=sc.nextInt();
        // int arr[]=new int[n1];
        // System.out.println("enter array elements:");
        // for (int i = 0; i < arr.length; i++) {
        //         arr[i]=sc.nextInt();
        //          sum=sum+arr[i];
        
        // }
        // System.out.println("addition of array elements "+sum);

        // System.out.println("5:add two array elements and store it in 3rd array");
        // System.out.println("Enter the size for both array");
        // int n2=sc.nextInt();
        // int arr1[]=new int[n2];
        // int arr2[]=new int[n2];
        // int arr3[]=new int[n2];
        // System.out.println("enter array1 elements:");
        // for (int i = 0; i < arr1.length; i++) {
        //         arr1[i]=sc.nextInt();
        //  }
        //  System.out.println("enter array2 elements:");
        //  for (int i = 0; i < arr2.length; i++) {
        //         arr2[i]=sc.nextInt();
        //  }
        //  for (int i = 0; i < arr3.length; i++) {
        //      arr3[i]=arr1[i]+arr2[i];
        //  }
        //  System.out.println("addition of array1 and array2=");
        //  for(int c: arr3)
        //  {
        //     System.out.println(c+" ");

        //  }
        System.out.println("6: COUNT EVEN AND ODD NUMBERS IN AN ARRAY");
        System.out.println("Enter array size=");
        int s=sc.nextInt();
        int odd=0,even=0;
        int [] x= new int[s];
        System.out.println("Enter an array=");
        for (int i = 0; i <x.length; i++) {
            x[i]=sc.nextInt();

        }
        for (int i = 0; i <x.length; i++) {
            if(x[i]%2==0)
            {
                even++;
            }
            else{
                odd++;
            }
        }
        System.out.println("total even number= "+even);
        System.out.println("total odd number= "+odd);

        System.out.println("accept 5 employee salary from user and calculate total salary and average of salary of 5 employee");
        



    }
}

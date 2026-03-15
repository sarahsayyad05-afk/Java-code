import java.util.Scanner;
public class Multi_D_array
{
    public static void main(String args[])
    
    {   Scanner  sc=new Scanner(System.in);
        // int a[][]={{1,2,3},{5,6,7,8,9},{4}};
        // System.out.println("Address of Array a= "+a);
        // System.out.println("Address of Row1 in a= "+a[0]);
        // System.out.println("Address of Row2 in a= "+a[1]);
        // System.out.println("Lenght of array a= "+a.length);
        // // Rows are stored in any memory where it finds space
        // // elements in rows are stored in contigeous manner
        // System.out.println("Lenght of row1 in array a= "+a[0].length);
        // System.out.println("Lenght of row2 in array a= "+a[1].length);
        // System.out.println("Lenght of row3 in array a= "+a[2].length);


        // System.out.println("Accessing Array a[0][0]="+a[0][0]);
        // System.out.println("Accessing Array a[1][0]="+a[1][0]);
        // System.out.println("Accessing Array a[2][0]="+a[2][0]);
        // System.out.println("Accessing Array a[1][1]="+a[1][1]);
        // System.out.println("Accessing Array a[1][2]="+a[1][2]);
        

        // System.out.println("Iterating using 1) for loop");
        // for (int i = 0; i <a.length; i++) {
        //     for (int j = 0; j < a[i].length; j++) {
        //         System.out.print(a[i][j]+" ");
                
        //     }
        //     System.out.println();

            
        // }
        // System.out.println("2)Using for-each loop");
        // for(int x[]: a)
        // {
        //     for(int x1: x)
        //     {
        //         System.out.print(x1+" ");

        //     }
        //     System.out.println();


        // }

        // System.out.println("1:Accept array elements from user");
        // int b[][]=new int[3][3];
        // System.out.println("Enter array elements=(3x3)");
        // for (int i = 0; i <b.length; i++) {
        //     for (int j = 0; j <b[i].length; j++) {
        //         b[i][j]=sc.nextInt();
                
        //     }
            
        // }
        //  System.out.println("Array:");
        // for(int p[]: b)
        // {
        //     for(int p1: p)
        //     {
        //         System.out.print(p1+" ");

        //     }
        //     System.out.println();
        // }
        
        // System.out.println("2-D Jagged Array");
        // int arr[][]= new int[2][];
        // arr[0]=new int [3];
        // arr[1]= new int [5];
        // for (int i = 0; i <arr.length; i++) {
        //     System.out.println("Enter an array element for row"+(i+1));
        //     for (int j = 0; j <arr[i].length; j++) {
        //         arr[i][j]=sc.nextInt();
                
        //     }
            
        // }
        // System.out.println("Array:");
        // for(int q[]: arr)
        // {
        //     for(int q1: q)
        //     {
        //         System.out.print(q1+" ");

        //     }
        //     System.out.println();
        // }
      
        // System.out.println("q:create 2-d jagged array such a thattrgfaraaaaaaa23ww 1st row has 1 element, 2nd row has 2 element and so on(5 rows in total )");
        // int A[][]= new int[5][];
        // int n=1;
        // for (int i = 0; i <A.length; i++) {
            
      
        // A[i]=new int [n];
        // n++;
       
        // }

        // for (int i = 0; i <A.length; i++) {
        //     System.out.println("Enter Array element for row"+(i+1));
        //     for (int j = 0; j <A[i].length; j++) {
        //         A[i][j]=sc.nextInt();
                
        //     }
            
        // }
        // System.out.println("2-D Jagged Array=");
        // for(int r[]: A)
        // {
        //     for(int r1: r)
        //     {
        //         System.out.print(r1+" ");

        //     }
        //     System.out.println();
        // }

//       System.out.println("Q: Row-wise addition of array");

//       int a1[][] = new int[3][3];
//       System.out.println("Enter array elements (3x3):");

//        for (int i = 0; i < a1.length; i++) {
//             for (int j = 0; j < a1[i].length; j++) {
//               a1[i][j] = sc.nextInt();
//              }
//         }


//         int sum[] = new int[3];

//          for (int i = 0; i < a1.length; i++) {
//               for (int j = 0; j < a1[i].length; j++) {
//                   sum[i] += a1[i][j];
//                }
//          }

// System.out.println("Row-wise sum:");
// for (int i = 0; i < sum.length; i++) {
//     System.out.println("Row " + (i + 1) + " sum = " + sum[i]);
// }



// System.out.println("Convert into transpose of given matrix");

// int a2[][] = new int[3][3];
// System.out.println("Enter array elements (3x3):");

// for (int i = 0; i < a2.length; i++) {
//     for (int j = 0; j < a2[i].length; j++) {
//         a2[i][j] = sc.nextInt();
//     }
// }

// System.out.println("Array:");
// for (int i = 0; i < a2.length; i++) {
//     for (int j = 0; j < a2[i].length; j++) {
//         System.out.print(a2[i][j] + " ");
//     }
//     System.out.println();
// }


// int transpose[][] = new int[3][3];

// for (int i = 0; i < a2.length; i++) {
//     for (int j = 0; j < a2[i].length; j++) {
//         transpose[j][i] = a2[i][j];
//     }
// }

//       System.out.println("Transpose of Array:");
//    for (int i = 0; i < transpose.length; i++) {
//         for (int j = 0; j < transpose[i].length; j++) {
//         System.out.print(transpose[i][j] + " ");
//          }
//          System.out.println();
//     }
    
    // System.out.println("Array multiplication");
    // int arr1[][]={{1,2,3},{4,5,6}};
    // int arr2[][]={
    //     {7,8},{9,10},{11,12}
    // };
    // int rowsA=arr1.length;
    // int colsA=arr1[0].length;
    // int colsB=arr2[0].length;
    // int result[][]=new int[rowsA][colsB];

    // for (int i = 0; i <rowsA; i++) {
    //     for (int j = 0; j < colsB; j++) {
    //         for (int k = 0; k < colsA; k++) {
    //             result[i][j]=arr1[i][k]*arr2[k][j];
    //         }
            
    //     }
    // }
    // System.out.println("Result matrix");
    // for (int i = 0; i <rowsA; i++) {
    //     for (int j = 0; j <colsB; j++) {
    //         System.out.print(result[i][j]+" ");
            
    //     }System.out.println();
        
    // }


     System.out.println("Sum of two 2-d array");
     int a3[][] = new int[2][2];
     int b[][] = new int[2][2];
     int sum[][] = new int[2][2];

        System.out.println("Enter elements of first array (2x2):");
        for (int i = 0; i <a3.length; i++) {
            for (int j = 0; j <a3[i].length; j++) {
                a3[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter elements of second array (2x2):");
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                b[i][j] = sc.nextInt();
            }
        }

        
        for (int i = 0; i <sum.length; i++) {
            for (int j = 0; j <sum[i].length; j++) {
                sum[i][j] = a3[i][j] + b[i][j];
            }
        }

        System.out.println("Sum of two matrices:");
        for (int i = 0; i <sum.length; i++) {
            for (int j = 0; j <sum[i].length; j++) {
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }




            
        

       




    }
}


import java.io.*;
import java.util.Scanner;


public class filex {
    public static void main(String[] args) {
        try {
               FileOutputStream f=new FileOutputStream("file1.txt");
               FileOutputStream f1=new FileOutputStream("file2.txt");

               Scanner sc=new Scanner(System.in);
               System.out.println("Enter File 1 Data:");
               String str=sc.nextLine();
               f.write(str.getBytes());
               System.out.println("Enter File 2 Data:");
               String str1=sc.nextLine();
               f1.write(str1.getBytes());

               FileOutputStream f2=new FileOutputStream("file3.txt",true);

               f2.write(str.getBytes());
               f2.write(str1.getBytes());
               FileInputStream fi= new FileInputStream("file3.txt");
               int ch;
               while((ch=fi.read())!=-1){
                System.out.print((char)ch);
               }
               


            
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

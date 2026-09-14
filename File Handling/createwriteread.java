import java.io.*;
import java.util.Scanner;
public class createwriteread {
    public static void main(String[] args) {
        try {
            File f=new File("info.txt");
            if(!(f.exists())){
                f.createNewFile();
             }
            else{
                System.out.println("File Already Exists");
            }

                ///used to addd data at last in the file
                
                FileWriter fw= new FileWriter(f,true);
                fw.write("hdgljashdsjajsdhu ");
                
                
                Scanner sc1=new Scanner(System.in);
                System.out.println("Enter data ");
                String n=sc1.nextLine();
                fw.write(n);
                          fw.close();

                System.out.println("File Data: ");
                // Scanner sc=new Scanner(f);
                // while(sc.hasNextLine()){
                //     String read= sc.nextLine();
                //     System.out.println(read);
                // }
                FileReader fr = new FileReader(f);
            System.out.println();
            System.out.println("Using FileReader:");
             int ch;

            while((ch = fr.read()) != -1) {
                System.out.print((char)ch);
            }
                
                
            fr.close();



           

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

import java.io.*;
import java.util.Scanner;
public class CreateFileEx {
    public static void main(String[] args) {
        try {
            File f=new File("info.txt");
            if(!(f.exists())){
                f.createNewFile();
             }
            else{
                System.out.println("File Already Exists");
            }

        
                FileWriter fw= new FileWriter(f);
                fw.write("Name: Sarah \n Age: 19 \n Address: Ahilyanagar \n Phoneno: 9322681277 ");
                
                
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

// Object
//    |
//    +-- Reader (Abstract Class)
//           |
//           +-- BufferedReader
//           |
//           +-- FileReader
//           |
//           +-- InputStreamReader
//                   |
//                   +-- FileReader
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class ReadFromFile {
    public static void main(String[] args) {
        try {
            File file = new File("example.txt");

            // using filereader 
            FileReader fr = new FileReader(file);
            System.out.println();
            System.out.println("Using FileReader:");
             int ch;

            while((ch = fr.read()) != -1) {
                System.out.print((char)ch);
            }

            // using Scanner
            System.out.println("\nUsing scanner: ");
            Scanner reader = new Scanner(file);

            while (reader.hasNextLine()) {
                String data = reader.nextLine();
                System.out.println(data);
            }

            reader.close();
            fr.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch (Exception e) {
            e.printStackTrace();
    }
}
}
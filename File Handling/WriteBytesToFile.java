// 1)Bytes are the basic unit of data in Java. 
// 2)They are used to represent binary data, such as images, audio, and video files. 
// 3) In Java, you can use the FileOutputStream class to write bytes to a file. 
// 4) The write() method of the FileOutputStream class is used to write bytes to the file.
// 5) You can also use the getBytes() method of the String class to convert a string into a byte array before writing it to the file.
// 
// Object
//    |
// OutputStream (Abstract Class)
//    |
//    +-- FileOutputStream
//    +-- BufferedOutputStream
//    +-- ByteArrayOutputStream
//    +-- DataOutputStream

import java.io.FileOutputStream;
import java.io.IOException;

public class WriteBytesToFile {
    public static void main(String[] args) {

        try {
            FileOutputStream fos =new FileOutputStream("data.txt");

            String str = "Hello Java";
         
            fos.write(str.getBytes());

            fos.close();

            System.out.println("Data Written");
        }
        catch(IOException e) {
            System.out.println(e);
        }
    }
}
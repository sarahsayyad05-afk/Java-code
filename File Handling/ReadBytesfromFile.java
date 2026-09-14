// InputStream is used to read data (bytes) from a source such as a file, keyboard, network, etc.
// The FileInputStream class is used to read bytes from a file. 
// The read() method of the FileInputStream class is used to read bytes from the file.
// The read() method returns the next byte of data, or -1 if the end of the file is reached.
// 
// Object
//    |
// InputStream (Abstract Class)
//    |
//    +-- FileInputStream
//    +-- BufferedInputStream
//    +-- ByteArrayInputStream
//    +-- DataInputStream

import java.io.FileInputStream;
import java.io.IOException;

public class ReadBytesfromFile {
    public static void main(String[] args) {

        try {
            FileInputStream fis =new FileInputStream("data.txt");

            int ch;

            while((ch = fis.read()) != -1) {
                System.out.print((char)ch);
            }

            fis.close();
        }
        catch(IOException e) {
            System.out.println(e);
        }
    }
}
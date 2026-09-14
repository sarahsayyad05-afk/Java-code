//Using character stream to write data to a file
// FileWriter is a class that extends OutputStreamWriter and is used to write character data to a file. 
// It provides methods to write characters, arrays of characters, and strings to a file.
//  It also provides methods to flush the stream and close the stream.

// Object
//    |
//    +-- Writer (Abstract Class)
//           |
//           +-- BufferedWriter
//           +-- CharArrayWriter
//           +-- OutputStreamWriter
//           |        |
//           |        +-- FileWriter
//           |
//           +-- PrintWriter
//           +-- StringWriter
//           +-- PipedWriter

// Methods
// Method	Purpose
// write(int c)	Writes a single character
// write(char[] cbuf)	Writes an array of characters
// write(String str)	Writes a string
// flush()	Flushes the stream
// close()	Closes the stream and releases any system resources associated with it

import java.io.FileWriter;
import java.io.IOException;

public class WritetoFile {
    public static void main(String[] args) {
        try {
            FileWriter w = new FileWriter("example.txt");
            w.write("Hello, Java File Handling!\n");
            w.write(65);//ASCII Vlaue of A so it will write A instead of the number
            w.close();

            System.out.println("Successfully written to file.");
        } catch (IOException e) {
            e.printStackTrace();
            //prints whole information about the exception
        }
    }
}
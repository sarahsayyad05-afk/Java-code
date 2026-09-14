// BufferedReader is a class that extends Reader and is used to read text from a character-input stream, 
// buffering characters to provide efficient reading of characters, arrays, and lines.

// Methods
// Method	Purpose
// read()	Reads a single character
// read(char[] cbuf)	Reads characters into an array
// readLine()	Reads a line of text
// close()	Closes the stream and releases any system resources associated with it  

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderDemo {
    public static void main(String[] args) {
        try {
            BufferedReader br =new BufferedReader(new FileReader("student.txt"));

            String line;

            while((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close();
        }
        catch(IOException e) {
            System.out.println(e);
        }
    }
}
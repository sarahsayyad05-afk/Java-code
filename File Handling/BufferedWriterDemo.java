// BufferedWriter is a class that extends Writer and is used to write text to a character-output stream, 
// buffering characters to provide efficient writing of single characters, arrays, and strings.

// Methods
// Method	Purpose
// write(int c)	Writes a single character
// write(char[] cbuf)	Writes an array of characters
// write(String str)	Writes a string
// newLine()	Writes a line separator
// close()	Closes the stream and releases any system resources associated with it


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo {
    public static void main(String[] args) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("student.txt"));

            bw.write("101 Rahul");
            bw.newLine();
            bw.write("102 Priya");
            bw.newLine();
            bw.write("103 Amit");

            bw.close();

            System.out.println("Data written successfully.");
        }
        catch(IOException e) {
            System.out.println(e);
        }
    }
}
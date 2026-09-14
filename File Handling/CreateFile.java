// File handling :
//1) The File class belongs to the java.io package and is not a stream class. It is used to represent files and directories.
// File Class Hierarchy
// java.lang.Object
//         |
//         +---- java.io.File
// 
// File directly extends Object.

// 2) The File class provides methods to create, delete, and check the properties of files and directories. 
// It also provides methods to list the contents of a directory and to get the size of a file.
// 3) The File class does not provide methods to read or write the contents of a file.

import java.io.File;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) {
        try {
            File f = new File("example.txt");
            if (f.createNewFile()) {
                System.out.println("File created: " + f.getName());
                // System.out.println("canRead(): "+ f.canRead() );
                // System.out.println("canWrite(): "+ f.canWrite());
                // System.out.println("getAbsolutePath"+ f.getAbsolutePath());
            } else {
                System.out.println("File already exists.");
                //basic file handling methods:
                 System.out.println("canRead(): "+ f.canRead() );
                System.out.println("canWrite(): "+ f.canWrite());
                System.out.println("getAbsolutePath"+ f.getAbsolutePath());
                System.out.println("exists(): "+ f.exists());
                System.out.println("length(): "+f.length());


            }


        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
// serialization is the process of converting an object into a byte stream,
// which can be saved to a file or transmitted over a network.
//  In Java, we can achieve serialization using the `Serializable` interface
//  and `ObjectOutputStream` class.
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
class Student implements Serializable {

    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class SerializationExample {

    public static void main(String[] args) throws Exception {

        Student s = new Student(101, "Rahul");

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("student.dat"));
        //.dat is a binary file

        oos.writeObject(s);


        oos.close();

        System.out.println("Object Serialized");


        ObjectInputStream ois=new ObjectInputStream(new FileInputStream("student.dat"));
        Student s1= (Student)ois.readObject();
        System.out.println("name: "+ s1.name);
        System.out.println("ID: "+ s1.id);

        
    }
}
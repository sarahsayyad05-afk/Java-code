
import java.io.*;
import java.sql.*;

public class storeImage {
    public static void main(String[] args) {
        try{
        Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/image", 
        "root","sarah@05");
        

        String q= "INSERT INTO imageStore (im) VALUES(?)";
        PreparedStatement ps=con.prepareStatement(q);
        
        FileInputStream fis= new FileInputStream("C:\\Users\\SAINATH\\OneDrive\\Pictures\\wallpaper1.png\\");
        ps.setBlob(1, fis);
        ps.executeUpdate();


        }
        catch(Exception e){
            System.out.println(e);

        }
    }
}

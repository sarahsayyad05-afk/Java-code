import java.io.*;
import java.sql.*;

public class RetrieveImagefromDB {

    public static void main(String[] args) {

        try {

            Connection con =
                DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/image",
                "root",
                "sarah@05");

            PreparedStatement ps =  con.prepareStatement("SELECT im FROM imageStore");

          
            ResultSet rs =ps.executeQuery();

            if(rs.next()) {

                Blob blob =rs.getBlob("im");

                byte[] data =  blob.getBytes(  1,  (int)blob.length());

                FileOutputStream fos = new FileOutputStream("output.jpg");

                fos.write(data);

                fos.close();

                System.out.println("Image Retrieved");
            }

            con.close();

        } catch(Exception e) {
            System.out.println(e);
        }
    }
}
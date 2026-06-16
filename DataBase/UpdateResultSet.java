// Updatable ResultSet :Allows updating database directly through ResultSet.

import java.sql.*;
public class UpdateResultSet {

    public static void main(String[] args) {

        try {

            Connection con = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/emp",
            "root",
            "sarah@05"
            );

            Statement stmt = con.createStatement( ResultSet.TYPE_SCROLL_INSENSITIVE ,ResultSet.CONCUR_UPDATABLE);

            ResultSet rs = stmt.executeQuery( "SELECT * FROM Employee");

            // Move First Row
            rs.first();

            // Update Name
            rs.updateString("name","Rohan");

            // Save Update
            rs.updateRow();

            System.out.println( "Record Updated" );
            con.close();

        } catch(Exception e) {

            System.out.println(e);
        }
    }
}
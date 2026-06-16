// Types of ResultSet
// A) TYPE_FORWARD_ONLY :Cursor moves only forward.(Default type)
//                         Example
//                         1 → 2 → 3
// Cannot go backward.
// 
// B) TYPE_SCROLL_INSENSITIVE :Cursor can move:Forward
//                                             Backward
//                                             Specific row
// Does NOT reflect database changes.
// 
// C) TYPE_SCROLL_SENSITIVE : Same as above but reflects database changes.
// 
// Concurrency Types
// A) CONCUR_READ_ONLY :Only reading allowed.
//                      Cannot update.
// 
// B) CONCUR_UPDATABLE :Allows updating ResultSet records.
// 
// Important Cursor Methods
// |Method	          | Purpose           |
// |------------------|-------------------|
// |next()	          | Move next row     |
// |previous()	      | Move previous row |
// |first()	          | Move first row    |
// |last()	          | Move last row     |
// |absolute(n)	      | Move specific row |
// |beforeFirst()	  |  Before first row |
// |afterLast()	      |  After last row   |

import java.sql.*;
public class ResultSetScrollDemo {

    public static void main(String[] args) {

        try {

            Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/emp","root","sarah@05");

            Statement stmt =con.createStatement( ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);

            ResultSet rs = stmt.executeQuery( "SELECT * FROM Employee" );

            // Move Last
            rs.last();
            System.out.println( rs.getString("name") );

            // Move First
            rs.first();
            System.out.println( rs.getString("name") );

            // Move Absolute Row
            rs.absolute(2);
            System.out.println( rs.getString("name") );

            con.close();

        } catch(Exception e) {

            System.out.println(e);
        }
    }
}
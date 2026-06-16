// ResultSetMetaData : It is an interface that provides information about the columns of a ResultSet object. 
//                     It allows you to retrieve metadata such as column names, data types, and the number of columns in the ResultSet.

// Methods of ResultSetMetaData:
// | Method              | Purpose         |
// | --------------------| --------------- |
// | getColumnCount()    | Total columns   |
// | getColumnName()     | Get column name |
// | getColumnTypeName() | Get datatype    |


import java.sql.*;
public class ResultSetMetaDataDemo {
    public static void main(String[] args) {
        try {

            Connection con =DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/emp",
                "root",
                "sarah@05"
            );

            Statement stmt =con.createStatement();

            ResultSet rs =stmt.executeQuery( "SELECT * FROM Employee");

            // Get MetaData
            ResultSetMetaData rsmd = rs.getMetaData();

            // Total Columns
            int cols =rsmd.getColumnCount();
            System.out.println( "Total Columns = " + cols );

            // Column Names
            for(int i=1; i<=cols; i++)
                 {
                System.out.println( rsmd.getColumnName(i)   + " - " + rsmd.getColumnTypeName(i));
            }
            con.close();

        } catch(Exception e) {

            System.out.println(e);
        }
    }
}
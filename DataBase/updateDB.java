
    // Update a Record in Database Table
// Syntax : 1)Update all rows: update table_name set column1=value1, column2=value2
//          2)Update specific columns: update table_name set column1=value1, column2=value2, ... where condition;

import java.sql.*;
public class updateDB {
    public static void main(String[] args) {
      try {
           // Create Connection
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3307/testdb",
                "root",
                ""
            );

            // Create Statement
            Statement stmt = con.createStatement();

            // SQL Update Query
            String q ="UPDATE student SET age=25 WHERE id=1";

            // Execute Query
            int rows = stmt.executeUpdate(q);
            System.out.println(rows + " Record Updated Successfully!" );
            con.close();

        } catch(Exception e) {
            System.out.println(e);
        }
    }
}


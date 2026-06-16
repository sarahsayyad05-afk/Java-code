// 1)Retrieve Data from Database using SELECT Query 
// 2)It will return a ResultSet object which contains the data returned by the query.
// 3) We can use ResultSet to read the data.

// SELECT Query Syntax:
                //1) select * from table_name;
                //2)select column1, column2 from table_name;
                //3)SELECT column1, column2, ... FROM table_name WHERE condition;

// Resultset Methods:
// | Method              | Purpose        |
// | --------------------| --------------- |
// | next()              | Move to next row|
// | getInt()            | Get int value   |
// | getString()         | Get String value|
// | getDouble()         | Get double value|

// Note: Column Index starts from 1, not 0.
// Syntax: ResultSet.getXXX(columnIndex) or ResultSet.getXXX(columnName)

import java.sql.*;


public class SelectQueryExample {
      public static void main(String[] args) {

        try {

            // Create Connection
            Connection con =DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/testdb",
                "root",
                ""
            );

            // Create Statement
            Statement stmt =con.createStatement();

            // SELECT Query
            String q ="SELECT * FROM student";

            // Execute Query
            ResultSet rs =stmt.executeQuery(q);

            // Process Result
            while(rs.next()) {

                System.out.println(
                    rs.getInt(1) + " "
                    + rs.getString(2) + " "
                    + rs.getInt(3)
                );
            }
            
            con.close();

        } catch(Exception e) {
            System.out.println(e);
        }
    }
} 


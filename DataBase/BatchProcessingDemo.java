// Batch Processing is used to execute multiple SQL queries together at once.
// Instead of executing queries one by one:Query 1 ,Query 2,Query 3
// JDBC sends all queries together as a batch.
// This can improve performance by reducing the number of round trips to the database.
// 
// 
// Important Methods:
// |Method	        | Purpose           |
// |----------------|-------------------|
// |addBatch()	    | Add query to batch|
// |executeBatch()	|Execute all queries|
// |clearBatch()	|Remove batch queries|

import java.sql.*;

public class BatchProcessingDemo {

    public static void main(String[] args) {

        try {

            Connection con =DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/testdb",
                "root",
                "sarah@05");

            Statement stmt =con.createStatement();

            // Add Queries
            stmt.addBatch("INSERT INTO student VALUES(1,'Rahul',20,'Pune')");

            stmt.addBatch("INSERT INTO student VALUES(2,'Amit',22,'Mumbai')");

            stmt.addBatch("INSERT INTO student VALUES(3,'Neha',21,'Delhi')");

            // Execute Batch
            stmt.executeBatch();

            System.out.println("Batch Executed Successfully");

            con.close();

        } catch(Exception e) {

            System.out.println(e);
        }
    }
}
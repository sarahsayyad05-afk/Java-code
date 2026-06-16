// Steps to connect to a MySQL database using JDBC:
// 1)Connect to MySQL Server  using DriverManager.getConnection() method with appropriate URL, username, and password.
// 2)Create a Statement object using the Connection object to execute SQL queries.
// 3)Execute SQL queries to create a database and a table using the Statement object.
// 4)Handle any exceptions that may occur during the database operations and print appropriate messages.
//

import java.sql.*;
public class CreateDBTable {
    public static void main(String[] args) {

        try {

            // Connect to MySQL Server
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/",
                "root",
                "sarah@05"
            );

            // Create Statement
            Statement stmt = con.createStatement();

            // Create Database
            String dbQuery = "CREATE DATABASE IF NOT EXISTS testdb";
            stmt.executeUpdate(dbQuery);

            System.out.println("Database created successfully!");

            // Use Database
            stmt.execute("USE testdb");

            // Create Table
            String tableQuery =
                "CREATE TABLE IF NOT EXISTS student (" +
                "id INT PRIMARY KEY, " +
                "name VARCHAR(50), " +
                "age INT, " +
                "city VARCHAR(50))";

            stmt.executeUpdate(tableQuery);

            System.out.println("Table created successfully!");

            // Close Connection
            con.close();

        } catch(Exception e) {
            System.out.println(e);
        }
    }
}
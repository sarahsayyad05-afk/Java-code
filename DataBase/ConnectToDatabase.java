// Connecting to a MySQL database using JDBC:
// 1)Make sure to have the MySQL Connector/J library in your classpath to run this code successfully.
// 2)You can download it from: https://dev.mysql.com/downloads/connector/j/
//3) depending on database and credentials, you may need to modify the connection URL, username, and password accordingly.
//4) This code establishes a connection to a MySQL database named "customer" running on localhost with the username "root" and an empty password. 
//5) If the connection is successful, it prints "Connected Successfully!" and then closes the connection.
// 6) If there is an error during the connection process, it catches the exception and prints the error message.

//url format: jdbc:mysql://hostname:port/databasename
import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectToDatabase {
    public static void main(String[] args) {

        try {
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306",
                "root",
                "sarah@05"
            );

            System.out.println("Connected Successfully!");

            con.close();

        } catch(Exception e) {
            System.out.println(e);
        }
    }
}
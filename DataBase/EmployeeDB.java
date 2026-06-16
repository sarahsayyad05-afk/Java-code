import java.sql.*;
import java.util.Scanner;

public class EmployeeDB {
    public static void main(String[] args) {
        try{
           Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/",
            "root",
            "sarah@05");
            Statement s=con.createStatement();
            String db="CREATE DATABASE IF NOT EXISTS emp";
            s.executeUpdate(db);
            s.execute("USE emp");

            Scanner sc=new Scanner(System.in);
            String q = "CREATE TABLE  IF NOT EXISTS Employee(id int primary key,name varchar(30),age int, phoneno int,salary int)";
            s.execute(q);
            int choice;
            do { 
                System.out.println("----OPERATIONS ON EMPLOYEE TABLE:----");
                System.out.println("1: Insert in Employee");
                System.out.println("2: Update Employee Values");
                System.out.println("3: Delete Employee Values or Table");
                System.out.println("4: Select from Employee");
                System.out.println("5: Exit");
                System.out.println("Enter Your Choice: ");
                choice=sc.nextInt();
                sc.nextLine();

                if(choice==1){
                    System.out.println("Enter the num of employee details you want to insert ");
                    int num = sc.nextInt();
                    for (int i = 0; i < num; i++)  
                    {   System.out.println("Enter details of employee " + (i+1) + ":");
                         System.out.println("Enter Employee id:");
                         int id = sc.nextInt();
                         sc.nextLine();
                         System.out.println("Enter Employee name:");
                         String name = sc.nextLine();
                          System.out.println("Enter Employee age:");
                         int age = sc.nextInt();
                          System.out.println("Enter Employee Phone no:");
                         int phone= sc.nextInt();
                          System.out.println("Enter Employee Salary:");
                         int sal = sc.nextInt();

                         String q1 = "INSERT INTO Employee Values(?,?,?,?,?) ";
                         PreparedStatement ps = con.prepareStatement(q1);
                          ps.setInt(1,id);
                          ps.setString(2,name);
                          ps.setInt(3,age);
                          ps.setInt(4,phone);
                          ps.setInt(5,sal);
                          ps.executeUpdate();
                        
                    }
                    System.out.println("Employee details inserted successfully!");  
                }
                if(choice==2){
                    System.out.println("Enter Employee id to update details:");
                    int id = sc.nextInt();
                    sc.nextLine();
                  System.out.println("What do you want to update?");
                    System.out.println("1: Name");
                    System.out.println("2: Age");
                    System.out.println("3: Phone Number");
                    System.out.println("4: Salary");
                     int c = sc.nextInt();
                     sc.nextLine();
                     if(c==1){
                         System.out.println("Enter new name:");
                         String name = sc.nextLine();
                         String q2 = "UPDATE Employee SET name=? WHERE id=?";
                         PreparedStatement p = con.prepareStatement(q2);
                         p.setInt(2, id);
                         p.setString(1, name);
                        if( p.executeUpdate()>0)
                         System.out.println("Name updated successfully");
                        else
                         System.out.println("No record found with the given id");    
                     }
                    else  if(c==2){
                         System.out.println("Enter new age:");
                         int age = sc.nextInt();
                         String q2 = "UPDATE Employee SET age=? WHERE id=?";
                         PreparedStatement p = con.prepareStatement(q2);
                         p.setInt(2, id);
                         p.setInt(1, age);
                        if( p.executeUpdate()>0)
                         System.out.println("Age updated successfully");
                        else
                         System.out.println("No record found with the given id");    
                     }
                     else if(c==3){
                         System.out.println("Enter new phone number:");
                         int phone = sc.nextInt();
                         String q2 = "UPDATE Employee SET phoneno=? WHERE id=?";
                         PreparedStatement p = con.prepareStatement(q2);
                         p.setInt(2, id);
                         p.setInt(1, phone);
                        if(( p.executeUpdate())>0)
                         System.out.println("Phone number updated successfully");
                        else
                         System.out.println("No record found with the given id");    
                     }
                     else if(c==4){
                         System.out.println("Enter new salary:");
                         int sal = sc.nextInt();
                         String q2 = "UPDATE Employee SET salary=? WHERE id=?";
                         PreparedStatement p = con.prepareStatement(q2);
                         p.setInt(2, id);
                         p.setInt(1, sal);
                        if( p.executeUpdate()>0)
                         System.out.println("Salary updated successfully");
                        else
                         System.out.println("No record found with the given id");    
                     }
                     else{
                         System.out.println("Invalid choice for update!");
                     }
                    }
                    if(choice==3){
                        System.out.println("Enter Employee id to delete details:");
                        int id = sc.nextInt();
                        String q3 = "DELETE FROM Employee WHERE id=?";
                        PreparedStatement pst = con.prepareStatement(q3);
                        pst.setInt(1, id);
                        if(pst.executeUpdate()>0)
                        {
                         System.out.println("Employee record deleted successfully");
                        }
                        else
                        {
                         System.out.println("No record found with the given id");
                        }
                    }
                    if(choice==4){
                        String q4 = "SELECT * FROM Employee";
                        ResultSet rs = s.executeQuery(q4);
                        System.out.println("Employee Details:");
                        while(rs.next()) {
                            System.out.println(
                                rs.getInt(1) + " "
                                + rs.getString(2) + " "
                                + rs.getInt(3) + " "
                                + rs.getInt(4) + " "
                                + rs.getInt(5)
                            );
                        }
                    }
                    else if(choice>5){
                        System.out.println("Please Enter a Valid Choice!");
                    }
                


            } while (choice!=5);
            
              con.close();


        }
        catch(Exception e)
        {
            System.out.println(e);
        }   
    }
}



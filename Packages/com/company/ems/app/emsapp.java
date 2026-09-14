package com.company.ems.app;
import com.company.ems.service.employeeservices;
import java.util.Scanner;
public class emsapp{
    public static void main(String[] args) {
        com.company.ems.service.employeeservices es=new employeeservices();
        Scanner sc=new Scanner (System.in);
        int choice;
        do { 
            
       
        System.out.println("===Employee Management System===");
        System.out.println("1)Add Employee");
        System.out.println("2)View all Employee");
        System.out.println("3)Search Employee");
        System.out.println("4)Update Employee Salary");
        System.out.println("5)Exit");
        System.out.println("Enter your choice: (1-5): ");
        choice=sc.nextInt();
        sc.nextLine();

        if(choice==1){
            System.out.println("Enter Employee name: ");
            String name=sc.nextLine();
             System.out.println("Enter Department name: ");
            String dname=sc.nextLine();

             System.out.println("Enter Employee Salary: ");
            int sal=sc.nextInt();
            es.addemp(name,dname,sal);
        }
        else if(choice==2){
            es.display();

        }
        else if(choice==3){
            System.out.println("Enter an ID to search:");
            int id=sc.nextInt();
            es.searchemp(id);
        }
        else if(choice ==4){
             System.out.println("Enter an ID to search:");
            int id=sc.nextInt();
           System.out.println("Enter updated salary:");
           int sal=sc.nextInt();
           es.update(id,sal);
        }

         } while (choice!=5);
    }

}
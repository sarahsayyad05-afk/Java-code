import java.util.Scanner;

public class Student{
    //  System.out.println("create a class student with student data members sid, name,marks, and 
   //one common data memeber clg name to all student accept and display the data of students");
  static String Clg_name="Ahmednagar College";
  Scanner sc=new Scanner(System.in);
  int S_id;
  String name;
  int marks;
  void details(){
        System.out.println("Enter name:");
        name=sc.nextLine();
        System.out.println("Enter S_id:");
        S_id=sc.nextInt();
        System.out.println("Enter Marks:");
        marks=sc.nextInt();
  }
  void display(){
    System.out.println("Student details:");
    System.out.println("Name: "+name+" "+"S_id: "+S_id+" "+"Marks: "+marks+" "+"College name: "+Clg_name);
  }
  public static void main(String[] args) {
      Student s1=new Student();
      s1.details();
      s1.display();
       Student s2=new Student();
      s2.details();
      s2.display();
      

  }
}

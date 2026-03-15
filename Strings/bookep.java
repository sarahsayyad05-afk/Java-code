// WAP to create class book having data member book name , author name and price.accept 
// data for 2 books and display data of book in upper case having maximum price
import java.util.Scanner;
class bookep
{
  String name;
  String author_name;
  int price;

  void accept()
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a book name");
    name = sc.nextLine();
    // sc.nextLine();

    System.out.println("Enter a book author name");
    author_name = sc.nextLine();

    System.out.println("Enter a book price");
    price = sc.nextInt();
  }
  void display()
  {
    System.out.println("Book name is : "+name.toUpperCase());
    System.out.println("Book author name is : "+author_name.toUpperCase());
    System.out.println("Book price is : "+price);
  }

  public static void main(String args[])
  {
    bookep b1 = new bookep();
    bookep b2 = new bookep();
    System.out.println("Enter Book 1 detail");
    b1.accept();
    System.out.println("Enter Book 2 detail");
    b2.accept();
    System.out.println("Book  detail :");
    if(b1.price>b2.price)
    {
    b1.display();
    }
    else
    {
      b2.display();
    }
  }
}
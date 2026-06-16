//create a class BAse w data members x,and member function f1 which takes the value of x from user.
//create class derived which extends the properties of base class w datamembers y and member 
//function f2
// which accepts the value of x from user. calculate the product of datamembers of both classes
import java.util.Scanner;
class Base{
        int x;
        Scanner sc=new Scanner(System.in);
    void f1(){
        System.out.println("Enter value of x: ");
        x=sc.nextInt();
    }
}

class Derived extends Base{
     int y;
     void f2(){
         System.out.println("Enter value of y: ");
        y=sc.nextInt();
     }
     void product(){
    System.out.println("Product of x and y= "+ x*y);
     }
}


class calculations{
public static void main(String[] args) {
    Derived d=new Derived();
    d.f1();
    d.f2();
    d.product();
}
}
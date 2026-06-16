class A{
    A(){
        System.out.println("Default/ Base Class A constructor");
    }
    A(int a){
        System.out.println("Parameterized constructor class A: "+ a);
    }
    int x=10;
}
class B extends A{
    B(){
        System.out.println("Derived Class B from A");
    }
    int y=20;
    B(int a, int b)
    {   super(b);
        System.out.println("Parameterized constructor Class B: "+a);
    }
    void display(){
        System.out.println("X: "+x+" Y: "+y);
    }
}

class inheritance{
       public static void main(String[] args) {
           B b=new B();
           b.display();
           B b1=new B(10,20);
       }
}

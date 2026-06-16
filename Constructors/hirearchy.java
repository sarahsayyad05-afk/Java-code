class A{
    A(){
        System.out.println("Default");
    }
    A(int x){
        System.out.println("Parameterized constructor"+x);
    }
}

class B extends A{
    B(){
        System.out.println("Default Constructor");
    }
    B(int x1,int x2){
        super(x1);
        System.out.println("Parameterized constructor"+ x2);
    }
}
class C extends A{
    C(){
        System.out.println("Default constructor");
    }
    C(int x4,int x5){
         super(x4);
        System.out.println("Parameterized constructor"+ x5);

    }
   
}
class hirearchy{
 public static void main(String[] args) {
     B b=new B();
     C c=new C();
     B b1=new B(30,70);
     C c1=new C(50,80);
     
 }
}
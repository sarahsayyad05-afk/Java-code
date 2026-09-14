class A{
   protected void display(){
       System.out.println("Class A method");
    }
}
class B extends A{
    void show(){
      System.out.println("Class B method");
    }
}
class C extends A{

}
class visibiltymode{
    public static void main(String[] args) {
        A a=new A();
        a.display();
        B b=new B();
        b.display();
        b.show();
        C c=new C();
        c.display();
    }
}
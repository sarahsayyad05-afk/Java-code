class base{
  void f1(){
    System.out.println("Base class Method");
  }
}
class subclass extends base{
 void f1(){
    super.f1();
    System.out.println("subclass method");
 }
}
class method_overriding{
    public static void main(String[] args) {
        subclass b=new subclass();
        b.f1();
    }
}
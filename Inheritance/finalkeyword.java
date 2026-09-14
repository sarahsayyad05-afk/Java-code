//final class A: wont allow to inherit its properties// 
class A{
 final void f1(){
    System.out.println("Method from class A");
 }
}
class B extends A{
    // void f1(){
    //     System.out.println("Method from class B");
    // }

    //FUNCTION OVERWRRIDING
    // because it overwrites the parent class function
}
class finalkeyword{
    public static void main(String[] args) {
      final  int a= 10;
        System.out.println("a: "+a);
        //a=20; cannot re-assign value to a final variable
        System.out.println("a: "+a);
        B b= new B();
        b.f1();

    }
    
}
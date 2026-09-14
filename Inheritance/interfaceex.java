//interface:
//haves only abstract methods and final variables
//used to achive 100% abstraction
//
//used to compoulsary have responsibilty to implement each and every  method of interface in it.

//java does not support multiple inheritance. thats why make it interface
//def: class c extends A implements B{
//}
interface f1{
    void m1();
}
interface f2{
    void m2();
}

class A implements f1{
    public void m1(){
        System.out.println("Class A ");
    }
}
class B implements f2{
     public void m2(){
        System.out.println("Class B");
    }
}
class interfaceex{
    public static void main(String[] args) {
        A a=new A();
        a.m1();
        B b=new B();
        b.m2();
    }
    
}

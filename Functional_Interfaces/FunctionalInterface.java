

@java.lang.FunctionalInterface

interface abc{
    //it haves only one single abstract method
    public void f1();
}
// class test implements abc{
//     public void f1(){
//          System.out.println("Hello");
//     }
//     }

interface a{
    //one parameter
    public void s2(String s);

}
interface ab{
    //more than 1 parameter
    public void f2(int a, int b);
}
interface x{
    //return type func
    public String s();
}
interface x1{
    //return type w parameter
    public int sum(int a, int b);
}
public class FunctionalInterface {
    public static void main(String[] args) {
        // test t=new test();
        // t.f1();
        //using direct lambda function (no need to make a class and implemnet interface)
        //lambda expression with no parametrers and no return type
        abc i1=()->{System.out.println("Hello");};
        i1.f1();

        //lambda exp w parameter but no return type
        a a1= a-> System.out.println("a: "+ a);
        a1.s2("abc");

        ab x=(a,b)-> System.out.println("Sum: "+(a+b));
        x.f2(10,20);
         //return type but no parameter
        x x1=()-> { return "hello abc";};
        System.out.println(x1.s());
        //return type with parameter
        x1 s=(a,b)->{return a+b;};
        System.out.println("sum: "+ s.sum(15,20));

    }
}

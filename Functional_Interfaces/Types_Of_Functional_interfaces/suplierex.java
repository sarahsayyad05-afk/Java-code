import java.util.function.*;

public class suplierex {
 //generate random nos and check the number is even or odd  using functional interface. 
 public static void main(String[] args) {
    //   Supplier<Integer> num = () ->(int)(Math.random()*10);
    //    Predicate<Integer> isEven = num1 -> num1 % 2 == 0;
    //    int a;
    // //    //for 1 number
    // //    if(isEven.test(a())){
    // //     System.out.println(a +" Is even");
    // //    }
    // //    else{
    // //     System.out.println(a+ " is not even");
    // //    }
    //    //for multiple numbers
    //    for(int i=0;i<5;i++){
    //     a=num.get();
    //        if(isEven.test(a)){
    //     System.out.println(a +" Is even");
    //    }
    //    else{
    //     System.out.println(a+ " is not even");
    //    }
    //    }

       //write a program to generate otp using functional interface
       //1st way
    //    String otp="";
    //    Supplier<Integer> n= () ->(int)(Math.random()*10);
    //    for (int i = 0; i < 6; i++) {
    //     int ab=n.get();                //Integer ab=n.get(); 
    //        String s=String.valueOf(ab);//otp+=ab.toString();
    //        otp+=s;
    //    }
    //    System.err.println("OPT: "+ otp);
    //    //2nd way:
       Supplier<String> n1=()->{
        String w="";
        for (int i = 0; i < 6; i++) {
            w=w+(int)(Math.random()*10);
        } return w;

       };
       System.out.println(n1.get());




  }
}

import java.util.Date;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import java.util.function.DoubleSupplier;
import java.util.function.Predicate;
import java.util.function.Supplier;


class Suplier_Functional_interface {
    public static void main(String[] args)
    {
    Supplier<Integer> supplier = () ->(int)(Math.random()*10);
        System.out.println(supplier.get());
        System.out.println(supplier.get());
        System.out.println(supplier.get());
    
    Supplier<Date> d=()->new Date();
    System.out.println(d.get());  

     BooleanSupplier b=()-> true;
       System.out.println(b.getAsBoolean());
    
    DoubleSupplier d1= ()-> Math.random();
    for(int i=0 ;i<5;i++)
         System.out.println(d1.getAsDouble()*10); 
         
         

//Example
        Predicate<Integer> isEven = num1 -> num1 % 2 == 0;
        Supplier<Integer> random = () -> {
                 int number =(int)(Math.random()*10);
                 System.out.print("Random number " + number);
                 return number;
             };
         
        Consumer<Boolean> result = answer -> System.out.println(" is even? " + answer);
         
        result.accept(isEven.test(random.get()));
        result.accept(isEven.test(random.get()));
         result.accept(isEven.test(random.get()));


}
 }//new Random().nextInt(100)
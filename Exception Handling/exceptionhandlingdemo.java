public class exceptionhandlingdemo{
    void f1(){
        String s=null;

        int a=10,b=0;
        
         try {System.out.println("lenght of string s:  "+ s.length());
            System.out.println("a/b:"+ a/b);//try haves risky codes
            //TRY BLOCK CAN HAVE MANY CATCH BLOCK
            //AT ONE TIME ONLY ONE CATCH BLOCK EXECUTES.
        } 
        catch (ArithmeticException e1) {
             System.out.println(e1);
             //handles exception
        }
       
        catch(NullPointerException ab){
            System.out.println("String is null");
        }
       
        finally{
            System.out.println("finally block");
            //used to close database connection
        }
        //check exeption, checks before compling the program.
        //uncheck exception, cheks after compling the program.
        // exeption class is inherited when its check execption,
        //  and runtimeexception is inherited when uncehck exception
    }
    
    public static void main(String[] args) {
        exceptionhandlingdemo e=new exceptionhandlingdemo();
          e.f1();
          
         //this code will be best suitale in the function instead of in main class
        // try {
        //      e.f1();
        //      System.out.println("end");
        // } 
        // catch (Exception e1) {
        //      System.out.println(e1);
        // }


    }
}
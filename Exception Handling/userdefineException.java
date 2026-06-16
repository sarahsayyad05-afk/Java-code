import java.util.Scanner;
class AgedoesnotfitException extends Exception {
    String msg;

    public AgedoesnotfitException(String msg) {
        super(msg);
        this.msg=msg;
    }
    @Override
    public String toString(){
         return msg;
    }
    
}
public class userdefineException{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENter an age");
        int age=sc.nextInt();
        try {
            if(age<18)
            {
                throw new AgedoesnotfitException("Age must be greater than 18");

            }
        } catch (AgedoesnotfitException ex) {
            System.out.println(ex);
            System.out.println(ex.getMessage());
        }
    }
}

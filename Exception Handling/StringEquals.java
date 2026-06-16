import java.util.Scanner;
//take two strings from user, and if both strings not equal,
//  then throw  Missmatch exception(ignore case)
class MissmatchException extends Exception{
    String msg;
    public MissmatchException(String msg) {
        super(msg);
        this.msg=msg;
    }
    @Override
    public String toString(){
         return msg;
    }
}
public class StringEquals {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter String1:");
         String s1=sc.nextLine();
         System.out.println("Enter String2:");
         String s2=sc.nextLine();
         try {
             if(!(s1.equalsIgnoreCase(s2))){
                throw new MissmatchException("Strings Are not equal");
             }
         } catch (MissmatchException mse) {
            System.out.println(mse);
            System.out.println(mse.getMessage());
         }
    }
}

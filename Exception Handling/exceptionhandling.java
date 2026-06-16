import java.util.Scanner;
public class exceptionhandling {
    public static void main (String[] args){
        
        int a,b;
        Scanner sc=new Scanner(System.in);
        try{
        System.out.println("Enter a number 1:");
        a=sc.nextInt();
        System.out.println("Enter a number 2:");
        b=sc.nextInt();
        int result=a/b;
        System.out.println("divided a/b: "+ result);
        System.out.println("end");
       

        }
        catch(Exception e){

            System.out.println("cant divide a by 0");
            System.out.println("sout(e): "+e);
            System.out.println("e.getmessage(): "+e.getMessage());

            

        }
        System.out.println("end try catch");
        try {
            String s=null;
        System.out.println(s.length()); 
        } catch (Exception e) {
             System.out.println("String s is null hence cant find its length");
                System.out.println("sout(e): "+e);
               System.out.println("e.getmessage(): "+e.getMessage());
        }

    }
}

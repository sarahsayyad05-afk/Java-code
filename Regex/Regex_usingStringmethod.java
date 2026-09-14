import java.util.Scanner;
public class Regex_usingStringmethod {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // //Adhar no validation
        // System.out.println("Enter Aadhar No.:");
        // String str=sc.nextLine();
        // boolean ans=str.matches("[0-9]{4}-[0-9]{4}-[0-9]{4}");
        // if(ans==true){
        //     System.out.println("Valid aadhar no.");
        // }
        // else{
        //     System.out.println("Invalid Aadhar no.");
        // }

        //Name validation(must contain letters and spaces)
        System.out.println("Enter your name:");
        String name=sc.nextLine();
        boolean ans1=name.matches("[a-z A-Z]+"); 
        // "\\s?" is optional because i gave space btwn a-z and A-Z
        if(ans1){
            System.out.println("Valid name format");
        }
        else{
            System.out.println("Invalid name format: must contain letters or spaces");
        }

        
    }
}

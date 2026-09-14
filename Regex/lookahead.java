import java.util.Scanner;
public class lookahead {
///to validate license no. which contain atleast 1 uupercase letter,atleast 1 lowercase letter and
/// exactly 2 digits. len of the number should be 6
public static void main(String[] args) 
 { //  //Positive Lookahead
//     String Lno="(?=.*[A-Z])(?=.*[a-z])((?=.*[0-9]){2}).{6}";
//     //look ahead syntax: (?=....)
//     String ans="Sara10";
//     System.out.println(ans.matches(Lno));
//     Matcher m=Pattern.compile(Lno).matcher(ans);

//     if(m.find()){
//         System.out.println(m.group());
//     }

//     //Negative look ahead
//     //syntax:(?!...)

//     String s="abc";
//     System.out.println(s.matches("^(?!.*\\d).*$"));

    // //Write a program to create a pattern to validate a string must not contain uppercase letter.
    // String a="saRah1234";
    // System.out.println(a.matches("(?!.*[A-Z]).*")); 
    
    Scanner sc=new Scanner(System.in);
    //write a prgm to take a paragraph from user and check if it haves "Error " string.
    System.out.println("Enter a Paragraph");
    String s1=sc.nextLine();
    boolean ans1=s1.matches("(?!.*Error.*)");
    if(ans1==true){
        System.out.println("Paragraph does not contains 'Error' Keyword");
    }
    else{
        
        System.out.println("Paragraph contains 'Error' Keyword");
    }



}
}

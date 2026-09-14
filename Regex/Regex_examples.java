//'.' operator is used like ex: a.b
   //. allows any cahracter btwn ab like acb 

//Quantifiers:

//'+': a charcter repeats once, or more( min: 1, max: infinite)
//'*': a character repeats either 0 times or infinite times ( min: 0, max: infinite)
//'?': a character repeats either onces or 0 times( min: 0, max: 1)
//{}: specific limit for a character is assigend between curly braces

//Character sets:
//[a-z]: anything btwn square braces is a set. i.e either of the mentioned elements in sqrbraces 
// repeats in given condition. This is an set of small alphabets. either of the alaphabet can repeat 
// to form pattern.
//[A-Z]
//[0-9]

//Meta Characters:
//use extra \ before using these character or else error will occur eg: \\w,\\d
//'\w': represents set of [a-z A-Z 0-9] alpha numeric chars
//'\W': represents that any other characters except Alphanumeric characters are allowed
//'\d': represents set of digits[0-9]
//'\D': represents that digits must not be included
//'\s': allows space 
//'\S':doesnot allow space

//Regex Examples
    //create a pattern which contains only digits
    
        //"[0-9]+"
    //create a patter for 10 digit mobile no
        //[0-9]{10}
        //a)create a pattern for 10 digit mobile no which starts w 7,8 or 9
         //[789][0-9]{9}
        //b)create a pattern for 10 digit mobile no first digit contain 0 and lenght should be 11 or 10
          //0?[789]{1}[1-9]{9}
        //starts w 0 or +91
      //  (0|\+91)? [789]{1}[1-9]{9}  
      //d)HW: create a pattern to check wheterr a name starts w a and ends w Z(^ starts w,and, $ ends w)
             //^a[a-z A-Z]*$Z
      //regexr.com

       //for date:
          // "^\d{2}-\d{2}-\d{4}$"-> wrong method
          //"^(([0-2]{1}[0-9])|(3{1}[0-1]))-((0{1}[0-9])|(1{1}[0-2]{1}))-\d{4}$"->correct method

import java.util.Scanner;
import java.util.regex.*;
public class Regex_examples {
   public static void main(String[] args) {
       Scanner sc=new Scanner (System.in);
    //    //Q:A simple Example of Matching the patter:
    //    String pattern="java";
    //     System.out.println("Enter what u want to find in the Pattern:");
    //    String text=sc.nextLine();

    //    Pattern p=Pattern.compile(pattern);
    //    Matcher m=p.matcher(text);
       
    //    if(m.find()){
    //     System.out.println("Patter found at:"+m.start()+" : Group :"+m.group(0)+": End: "+m.end());
    //    }
    //    else{
    //     System.out.println("Not Found");
    //    }
    //   //Q: Matching Pattern Date from Year 2000 to 2026 
    //    String pattern1="(([0-2]{1}[1-9]{1})|(3{1}[0-1]{1}))-((0{1}[0-9])|(1{1}[0-2]{1}))-20(([0-1]{1}[0-9])|(2{1}[0-6]{1}))";
    //     System.out.println("Enter a date");
    //    String text1=sc.nextLine();

    //    Pattern p1=Pattern.compile(pattern1);
    //    Matcher m1=p1.matcher(text1);
       
    //    if(m1.find()){
    //     System.out.println("Patter found at:"+m1.start()+" : Group :"+m1.group(0)+": End: "+m1.end());
    //    }
    //    else{
    //     System.out.println("Not Found");
    //    }

    //    //HW: write a program to validate username:
    //    // 1: it must contain 1 uppercase letter, 
    //    // 2:followed by lowercase letters,
    //    // 3: followed by special symbols and followed by numbers
    //    // 4: username lenght must contain minimum 8 characters

    //    String username="[A-Z]{1}[a-z]+[@_#%*&.][0-9]+";
             
    //    System.out.println("Enter Username:");
    //    String user=sc.nextLine();

    //    Pattern u=Pattern.compile(username);
    //    Matcher match=u.matcher(user);
       
    //    if(match.find() && user.length()>=8){
    //     System.out.println("Valid Username");
    //    }
    //    else{
    //     System.out.println("Invalid username");
    //    }

    //    //For email id
    //    //1 ex: abc123@gmail.com
    //    String email="[a-z A-Z 0-9]+[@]{1}[a-z A-Z]+[.]{1}[a-z]{2,4}";

    //    System.out.println("Enter Email:");
    //    String e=sc.nextLine();
    //    Pattern em=Pattern.compile(email);
    //    Matcher ans=em.matcher(e);
       
    //    if(ans.find()){
    //     System.out.println("Valid Email");
    //    }
    //    else{
    //     System.out.println("Invalid Email");
    //    }
       //2 ex: abc123@gmail.com.in (valid for firzt exmple too)
       String email1="[a-z A-Z 0-9]+[@]{1}[a-z A-Z]+[.]{1}[a-z]{2,4}([.][a-z]{2,4})?";
       System.out.println("Enter Email:");
       String e1=sc.nextLine();
       Pattern em1=Pattern.compile(email1);
       Matcher ans1=em1.matcher(e1);
       
       if(ans1.find()){
        System.out.println("Valid Email");
       }
       else{
        System.out.println("Invalid Email");
       }

       



   }
        
    }

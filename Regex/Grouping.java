
import java.util.regex.*;


public class Grouping {
    public static void main(String[] args) {
        
        //Grouping example: it  captures/stores groups in memory and matches them like that

        Matcher m=Pattern.compile("(ab)+").matcher("abab");
        if(m.find()){
            System.out.println(m.group());
            System.out.println(m.group(1));
        }

        //Non Capturing Group: it  only matches the pattern it doesnt store it as groups in memory
         Matcher m1=Pattern.compile("(?:\\d{3})-(\\d{4})").matcher("123-4567");
        if(m1.find()){
            System.out.println(m1.group());//only one group exist
            System.out.println(m1.group(1));//4567
        }

        //1.write a program to validate pancard no:
        //  rules: 5 letter, 4last digits,1 letter is format of it and total length is 10
        //2.write a program to validate url
        // ex https://www.google.com
           //s in https is optnal, https: this whole stuff is optnal www. is compulsory
    }
}

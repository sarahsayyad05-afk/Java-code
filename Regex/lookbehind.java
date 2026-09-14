import java.util.regex.*;

public class lookbehind {
    //+ve look behind syntax: (?<=....)
    //-ve look behind syntax: (?<!....)
    public static void main(String[] args) {
        System.out.println("yx".matches("(?<=y)x{2}"));
        String s="yx";
        Matcher m=Pattern.compile(s).matcher("(?<=y)x{2}");
        if(m.find()){
            System.out.println(m.group());
        }


    }

    
}

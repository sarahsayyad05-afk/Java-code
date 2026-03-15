import java.util.Scanner;

class StringBufferExample
{
    public static void main(String[] args) {
        // StringBuffer s= new StringBuffer();
        // System.out.println("Initial capacity of string1: "+s.capacity());
        // System.out.println("Lenght of the string : "+s.length());
        // StringBuffer s1= new StringBuffer(100);
        // System.out.println("Initial capacity of string1: "+s1.capacity());
        // System.out.println("Lenght of the string : "+s1.length());
        // StringBuffer s2= new StringBuffer("java");
        // System.out.println("Initial capacity of string1: "+s2.capacity());
        // System.out.println("Lenght of the string : "+s2.length());
        // //CAPACITY:total number of character it can hold

        // s2.append("Program");
        // System.out.println("Capacity: "+s1.capacity());
        // //APPEND:adds the last of string 
        
        // s2.append("123456789 124");
        // System.out.println("Initial capacity of string1: "+s2.capacity());
        // System.out.println("Lenght of the string : "+s2.length());

        // s2.insert(2,"@");
        // System.out.println(s2);
        // System.out.println("charAt(index): "+s2.charAt(5));
        
        //  s2.setCharAt(4,'*');
        //   System.out.println("setCharAt(index,char): "+s2);
        //   //it returns void so it doesnt work in printstatement

          
        //   System.out.println("s2.deleteCharAt(5): "+s2.deleteCharAt(5));

        //   System.out.println("delete(start index, end index): "+s2.delete(3, 7));
        //   //Equals method in STringBuffer checks the reference of strings 
        //   //unlinke in array and string where it checks the content
        //   StringBuffer s3=new StringBuffer("Java");
        //   StringBuffer s4=new StringBuffer("Java");
        //   System.out.println("s3.equals(s4): "+s3.equals(s4));

        //   System.out.println("repeating string s3: repeat(string,no.of times): "+s3.repeat(s3,3));
        //   //here the original string print once and then again for the number of times we repeat it
        //   System.out.println("indexOf(char): "+s3.indexOf("a"));
        //   System.out.println("lastIndexOf(char): "+s4.lastIndexOf("a"));

        //   System.out.println("replace(start,end,new string): "+s4.replace(0, 3, "Hola"));
        //   s4.reverse();
        //   System.out.println("reveresed string s4: "+s4);
        //   s3.setLength(5);
        //   System.out.println(s3);
        //   System.out.println(s3.append("abc"));

        //   String abc=s3.toString();
        //   System.out.println("String s3: "+abc);

          System.out.println("to check given string is palindrome using string buffer class");
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter a string: ");
          String str=sc.nextLine();
          StringBuffer str1=new StringBuffer(str);
          str1.reverse();
          boolean ans=str.equals(str1.toString());
          if(ans)
               System.out.println("String is palindrome");
        else
             System.out.println("String is not palindrome");
        












        
        
    }
}
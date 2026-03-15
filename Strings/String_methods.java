import java.util.Arrays;

class String_methods
{
    public static void main(String[] args) {
        String str="Java Programming";
         String str1=new String("Java Programming");
        // Character access
          //1:returns number of character in the string
        System.out.println("String 1 lenght: "+str.length());
        
        System.out.println();
        //2: returns boolean value depending upon string is empty or not
        System.out.println("String 1 is empty: "+str.isEmpty());
        System.out.println("String 1 is blank: "+str.isBlank());
        
        System.out.println();

        //3: Returns character at index
        System.out.println("Ch at 3rd position: "+ str.charAt(3));
        
        System.out.println();

        //toCharArray()
        char [] c=str1.toCharArray();
        char [] c1="Sarah".toCharArray();
        System.out.println(c1);
        System.out.println(c);
        System.out.println(c.length);

        // Checking equality of Strings
        System.out.println("Checking Equality: "+"Java".equals("Java"));
        System.out.println("Checking Equality: "+"Java".equals("java"));
        System.out.println("Checking Equality: "+"Java".equalsIgnoreCase("java"));
        
        System.out.println();

        //if ASCII difference is zero then the two strings are similar
        System.out.println("compareTo(): "+"Java".compareTo("Java"));
        System.out.println("compareToIgnoreCase(): "+"Java".compareToIgnoreCase("java"));

        //Changing case of strings
        System.out.println("Changing to lower case: "+"ABCDEF".toLowerCase());
        System.out.println("Changing to upper case: "+"abcdef".toUpperCase());
        
        System.out.println();

        //suffix prefix: returns boolean value
        System.out.println("Checking startswith(): "+"abcdef".startsWith("a"));
        System.out.println("Checking endswith(): "+"abcdef".endsWith("a"));
        
        System.out.println();

        //concatinating
        System.out.println("concatenated string: "+"Java".concat("Programming"));
        System.out.println(str.concat(str1));
        System.out.println(str);
        System.out.println(str1); 
        
        System.out.println();

        //returns the substring from the index caharacter to end of string
        System.out.println("substring: "+str.substring(3));
        
        System.out.println();

        //returns the substring from index i to j-1
        System.out.println("Substring: "+str.substring(2, 8));
        
        System.out.println();

        //checks if given substring present
         boolean ans1=str.contains("ing");
        System.out.println(ans1);
        
        System.out.println();


        //returns index of string of the first occurance of specified string
        System.out.println("indexOf(str): "+str.indexOf("Java"));
        System.out.println("indexOf(str): "+str.indexOf("Programming"));
        System.out.println("indexOf(abacd): "+"abacd".indexOf("a"));
        
        System.out.println();

        //last index of
         System.out.println("lastIndexOf(abacd): "+"abacd".lastIndexOf("a"));
        System.out.println("lastIndexOf(abacda): "+"abacda".lastIndexOf("a"));
        
        System.out.println();

        // returns index starting from specified given index
        System.out.println("index of a: "+str.indexOf("a",3));
        
        System.out.println();

        //replacing character
        System.out.println("Original string: "+str1);
        System.out.println("Replaced with @L: "+str1.replace('a','@'));
        
        System.out.println();

        //replace one whole string/substring specied
        System.out.println("Replaced all : "+str1.replaceAll("Java","python"));
        
        System.out.println();

        //replace first occurance of specified string
        System.out.println("Replaced first : "+"Java Programming Java".replaceFirst("Java ","python"));
        
        System.out.println();
        // join()
        String s1="Java";
        String s2="Programming";
        System.out.println("join(): "+String.join(",",s1,s2));
         System.out.println();

        //split
        System.out.println();
        String []array="java programming".split("a");
         System.out.println(Arrays.toString(array));
         
        System.out.println();

        

        System.out.println("*".repeat(10));
        
        System.out.println();

        //Trim the word
        System.out.println("Trim the word: "+ " String Trimming ".trim());
        System.out.println("Trim the word: "+"    ".trim()+(". . ."));
        
        System.out.println();
        

        //valueof() used to convrt preimitive data type into string
         int a=10;
         String s3=String.valueOf(a);
         System.out.println(s3.length());
         System.out.println(s3+10);
         
        System.out.println();


 



   




    }
}
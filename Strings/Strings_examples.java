import java.util.Arrays;
import java.util.Scanner;

class Strings_examples
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    //     System.out.println("take two string from user and check if both are equal or not ");
    //     System.out.println("Enter String1: ");
    //     String str=sc.nextLine();
    //     System.out.println("Enter String2: ");
    //     String str1=sc.nextLine();
    //    boolean ans=str.equalsIgnoreCase(str1);
    //    if(ans==true)
    //        System.out.println("Strings are equal");
    //     else
    //     System.out.println("Strings are not equal");

        // System.out.println("Q: take string from user. calculate lenght of given string.  if lenght of string is>10 then print given string in uppercase. else in lower case");
        // System.out.println("Enter a String: ");
        // String s=sc.nextLine();
        // int len=s.length();
        // if(len>=10)
        //     System.out.println("String in Upper case: "+s.toUpperCase());
        // else
        //    System.out.println("String in lower case: "+s.toLowerCase());

      //  System.out.println("Hw: take a string from user, and check whether it starts with 'PRN'. If yes then add ing at end of string, else ing at starting of the string");
        // System.out.println("Enter a String: ");
        // String s1=sc.nextLine();
        // boolean ans=s1.startsWith("PRN");
        // String add="ing";
        // if(ans==true)
        // {
        //      System.out.println(s1.concat(add));

        // }
        // else
        // {
        //      System.out.println(add.concat(s1));
        // }

        // System.out.println("Q; count number of words in a given string");
        // System.out.println("Enter a String: ");
        // String st=sc.nextLine();
        // String []array=st.split(" ");
        // System.out.println("Number of words in string: "+array.length);

        // System.out.println("Q: check given string is palindrome or not");
        // System.out.println("Enter a String: ");
        // String st1=sc.nextLine();
        // String rev="";
        // for (int i = st1.length()-1; i>=0; i--) {
        //     rev=rev+st1.charAt(i);

        // }
        // boolean ans2=st1.equals(rev);
        // if(ans2==true)
        
        // //     System.out.println("String is Palindrome");
        
        // // else 
        // //     System.out.println("String is not Palindrome");

        // System.out.println("Q: count number of vowels and consonants in a given string");
        // System.out.println("Enter a String: ");
        // String st2=sc.nextLine();
        // int vow=0,con=0;
        // st2=st2.toLowerCase();
        // for (int i = 0; i < st2.length(); i++) {

        //     // char ch = st2.charAt(i); //method 1
        //     // if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
        //     if("aeiouAEIOU".contains(""+st2.charAt(i)))//using string methods
        //          vow++;
        //     else 
        //         con++;            
        // }
        // System.out.println("Number of vowels: " + vow);
        // System.out.println("Number of consonants: " + con);


        // System.out.println("Q:remove space from given string");
        // System.out.println("Enter a String: ");
        // String a=sc.nextLine();
        // String a1=a.replace(" ","");
        // System.out.println("removed space from string: "+a1);
 

        // System.out.println("Q: remove duplicates from given string");
        // System.out.println("Enter a String: ");
        // String x=sc.nextLine();
        // String r="";
        // for (int i = 0; i <x.length()-1; i++) {
        //     if(!(r.contains(""+x.charAt(i))))
        //     {
        //         r=r+x.charAt(i);

        //     }       
        // }
        // System.out.println("String after removing duplicates: "+r);

        // for(char c: x.toCharArray())
        // {
        //     if(!(r.contains(c+"")))
        //     {
        //         r=r+x;
        //     }
        // }

        System.out.println("Q: check given string is anagram or not");
       
         System.out.println("Enter a String1: ");
          String ab=sc.nextLine();
           System.out.println("Enter a String2: ");
          String cd=sc.nextLine();
          int len1=ab.length();
          int len2=cd.length();
          if(len1==len2)
          {
            char [] arr=ab.toCharArray();
            char [] arr1=cd.toCharArray();
            Arrays.sort(arr);
            Arrays.sort(arr1);
            boolean ans=Arrays.equals(arr,arr1);
            if(ans==true)
            {
                System.out.println("Both Strings are anagram");
            }
            else
                 System.err.println("Both strings are not anagram");

          }
          else
              System.err.println("length of both strings is unmatched");
        
        
        

        

        


    







        
    }
}


      
    

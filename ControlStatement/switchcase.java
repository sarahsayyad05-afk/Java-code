import java.util.Scanner;
public class switchcase
{
 public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        // System.out.println("Convert digit into words");
        // System.out.println("Enter a dgit");
        // int num=sc.nextInt();
        // switch (num)
        // {
        //     case 1: 
        //     System.out.println("One"); break;
        //     case 2: 
        //     System.out.println("Two"); break;
        //     case 3: 
        //     System.out.println("Three"); break;
        //     case 4: 
        //     System.out.println("Four"); break;
        //     case 5: 
        //     System.out.println("Five"); break;
        //     case 6: 
        //     System.out.println("Six"); break;
        //     case 7: 
        //     System.out.println("Seven"); break;
        //     case 8:
        //          System.out.println("Eight"); break;
        //     case 9:
        //          System.out.println("Nine"); break;
        //     default:
        //          System.out.println("Enter valid number"); break;
        //}

        // System.out.println("Check entred case is a vowel or consonant");
        // System.out.println("Enter a character");
        // char c=sc.next().charAt(0);
        // // switch (c)
        // {
        //     case 'a': 
        //     System.out.println("it is a vowel"); break;
        //     case 'e': 
        //     System.out.println("it is a vowel"); break;
        //     case 'i': 
        //     System.out.println("it is a vowel"); break;
        //     case 'o': 
        //     System.out.println("it is a vowel"); break;
        //     case 'u': 
        //     System.out.println("it is a vowel"); break;
        //     case 'A': 
        //     System.out.println("it is a vowel"); break;
        //     case 'E': 
        //     System.out.println("it is a vowel"); break;
        //     case 'I': 
        //     System.out.println("it is a vowel"); break;
        //     case 'O': 
        //     System.out.println("it is a vowel"); break;
        //     case 'U': 
        //     System.out.println("it is a vowel"); break;
        //     default:
        //         System.out.println("It is a Consonant");
        // }
        //  switch (c){

         
        //    case 'a': 
           
        //     case 'e': 
           
        //     case 'i': 
           
        //     case 'o': 
           
        //     case 'u': 
           
        //     case 'A': 
           
        //     case 'E': 
           
        //     case 'I': 
           
        //     case 'O': 
           
        //     case 'U': 
        //     System.out.println("it is a vowel"); break;
        //     default:
        //         System.out.println("It is a Consonant");
        // }
        System.out.println("Months of the Year");
        System.out.println("Enter a month number (1-12)");
        int month=sc.nextInt();
       
        switch (month)
        {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("Please enter a number between (1 to 12)");
                break;
        }



        


        

    }
    
}

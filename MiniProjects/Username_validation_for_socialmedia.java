
import java.util.Scanner;
class Username_validation_for_socialmedia
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Username:");
        String User=sc.nextLine();
        boolean ans=false;
        if(User.length()<5 || User.length()>15)
        {
            System.out.println("Username must be 5 between 15 character");
            return;
        }
        else
        {
               char c=User.charAt(0);
               if(Character.isLetter(c))
               {    
                  
                        if((User.contains("")))
                        {
                            if(!(User.endsWith("_")||User.endsWith(".")))
                        {  
                                  for (int i = 0; i < User.length(); i++) {
                                       if(Character.isLowerCase(User.charAt(i)) ||Character.isDigit(User.charAt(i)) || User.charAt(i)=='_'|| User.charAt(i)=='.')
                        
                                      {
                                           ans=true;
                                          // System.out.println("Valid Username: "+User);        
                                      }
                                    else{
                                           System.out.println("Username must contain lowercase characters(a-z),digits(0-9),'_' and '.'");
                                         }
                            
                                      }
                                    
                            }
                           else{
                                  System.out.println("Username must not end with '_' or '.'");
                            }  

                           
                        }
                        else{
                            System.out.println("Username must not contain any space");
                        }
                       

                       
                    
               }
               else{
                System.out.println("username must start with alphabet");
               }

        }
        if(ans==true)
        {
             System.out.println("Valid Username: "+User);    
        }   
       else
       {
        System.out.println("Invalid Username: "+User);
       }
        
        


    }
}
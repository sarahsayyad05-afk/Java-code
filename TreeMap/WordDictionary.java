//Tree Map example
import java.util.*;
public class WordDictionary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        TreeMap<String,String> Dictionary=new TreeMap<>();
        int choice=0;
        do { 
            System.out.println("--Word Dictionary--");
            System.out.println("1.Add words with meaning");
            System.out.println("2.Display Dictionary in sorted order");
            System.out.println("3.Search a meaning using word");
            System.out.println("4.Remove a word");
            System.out.println("5.Display all words Starting w a specific letter");
            System.out.println("6.Exit");
            System.out.println(" Enter your Choice:");
            choice=sc.nextInt(); 
            sc.nextLine();
            if (choice==1){
                System.out.println("Enter Number Of Words:");
                int n=sc.nextInt();
                sc.nextLine();
                 for (int i = 0; i < n; i++) {
                 System.out.println("Enter Word:");
                 String key=sc.nextLine();
                 System.out.println("Enter its meaning");
                  String value=sc.nextLine();
                  Dictionary.put(key, value);
                }
                System.out.println("Words Added Succesfully!");
                System.out.println();
            }

            if(choice==2){
                System.out.println("----Dictionary Words& Meanings----");
                for(Map.Entry<String,String> map: Dictionary.entrySet()){
                    System.out.println(map.getKey()+" : "+ map.getValue());
                }
                System.out.println("-----------------------------------");
                System.out.println();
                
            }

            if(choice==3){
                System.out.println("Enter a word to search:");
                String search=sc.nextLine();

                if(Dictionary.containsKey(search)){
                    System.out.println("Meaning: "+Dictionary.get(search));
                }
                else{
                    System.out.println("Word not found");
                }
                System.out.println();
            }
            if(choice==4){
                System.out.println("Enter a word u want to remove:");
                String w=sc.nextLine();
                 if(Dictionary.containsKey(w)){
                    Dictionary.remove(w);
                    System.out.println("Word Removed Succesfully!");
                 }
                 else{
                    System.out.println("Word Not Found.");
                 }
                 System.out.println();

            }
            if(choice==5){
                System.out.println("Enter a letter to search:");
                String s=sc.nextLine();
                for(Map.Entry<String,String> m:Dictionary.entrySet()){
                      if(m.getKey().startsWith(s)){
                        System.out.println(m.getKey()+" : "+m.getValue());
                      }
                }
                System.out.println();
            }
            if(choice>6){
                System.out.println("Enter a valid Choice");
            }
        } while (choice!=6);
        
        
    }
}

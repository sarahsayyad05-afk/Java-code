import java.util.*;

public class ContactList {
    //Tree Map example

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        TreeMap<String,ArrayList> conactList=new TreeMap<>();
       
        int choice=0;
        do { 
            System.out.println("--Conact List--");
            System.out.println("1.Add Contact");
            System.out.println("2.Display Contact in sorted order");
            System.out.println("3.Search a Contact by name");
            System.out.println("4.Remove a Contact");
            System.out.println("5.Remove a specific number");
            System.out.println("6.Display all Contact Starting w a specific letter");
            System.out.println("7.Update Number");
            System.out.println("8.Updated Name");
            System.out.println("9.Exit");
            System.out.println(" Enter your Choice:");
            choice=sc.nextInt(); 
            sc.nextLine();
            if (choice==1){
                ArrayList<Long> mobileno=new ArrayList<>();
                 System.out.println("Enter a contact Name:");
                 String name=sc.nextLine();
                  System.out.println("Enter Number Of Conatcts:");
                   int n=sc.nextInt();
                   sc.nextLine();
                 for (int i = 0; i < n; i++) {
                    System.out.println("add "+(i+1)+" number");
                  long no=sc.nextLong();
                 mobileno.add(no);
                }
                conactList.put(name,mobileno);
                System.out.println("Contact Added Succesfully!");
                System.out.println();
               
            }

            if(choice==2){
                
                for(Map.Entry<String,ArrayList> map: conactList.entrySet()){
                    System.out.println(map.getKey()+" : "+ map.getValue());
                }
                
                System.out.println();
                
            }

            if(choice==3){
                System.out.println("Enter a contact name to search:");
                String search=sc.nextLine();

                if(conactList.containsKey(search)){
                    System.out.println("Numbers: "+conactList.get(search));
                }
                else{
                    System.out.println("Contact not found");
                }
                System.out.println();
            }
            if(choice==4){
                System.out.println("Enter a contact u want to remove:");
                String w=sc.nextLine();
                 if(conactList.containsKey(w)){
                
                    conactList.remove(w);

                    System.out.println("Contact Removed Succesfully!");
                 }
                 else{
                    System.out.println("Word Not Found.");
                 }
                 System.out.println();

            }
            if(choice==5){
                System.out.println("Enter a contact name:");
                 String x=sc.nextLine();
                 if(conactList.containsKey(x)){
                    System.out.println("Enter a mobile number");
                    long no=sc.nextLong();
                    if((conactList.get(x).contains(no)) &&( conactList.get(x).size()>1)){
                           conactList.get(x).remove(no);
                    }
                    else{
                        conactList.remove(x);
                    }

                 }
                 else{
                    System.out.println("No contact found");
                 }
            }
             if(choice==6){
                System.out.println("Enter a letter to search a contact:");
                String s=sc.nextLine();
                for(Map.Entry<String,ArrayList> m:conactList.entrySet()){
                      if(m.getKey().startsWith(s)){
                        System.out.println(m.getKey()+" : "+m.getValue());
                      }
                }
                System.out.println();
            }
            if(choice==7){
                System.out.println("Enter contact name:");
                String str=sc.nextLine();
                System.out.println("Enter Updated contact name:");
                String new=sc.nextLine();
                if(conactList.containsKey(str)){
                    
                }
            }
            if(choice>9){
                System.out.println("Enter a valid Choice");
            }
        } while (choice!=9);
        
        
    }
}



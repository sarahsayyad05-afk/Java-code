import java.util.*;

public class CollegeElectionVotingsystm {
    public static void main(String[] args) {
        int choice;
        Scanner sc=new Scanner(System.in);

        HashMap<String,Integer> cr=new HashMap<>();
        HashSet<Integer> id=new HashSet<>();
        do { 
            System.out.println("----College Election System----");
            System.out.println("1.Add Candidate");
            System.out.println("2.Cast Vote");
            System.out.println("3.Display Result");
            System.out.println("4.Find Winner");
            System.out.println("5.Exit");
            System.out.println("Enter Choice:");
            choice=sc.nextInt();
            sc.nextLine();
            if (choice==1){
                System.out.println("Enter Candidate name:");
                 cr.put(sc.nextLine(),0);
                  System.out.println("Candidate Added Succesfully!");


            }
            if(choice==2){
                System.out.println("Enter Student ID:");
                int i=sc.nextInt();
                if(!(id.contains(i))){
                    id.add(i);
                    sc.nextLine();
                    System.out.println("Enter Student Name:");
                    String name=sc.nextLine();
                    if(cr.containsKey(name)){
                        cr.replace(name, cr.get(name)+1);
                         System.out.println("Vote Casted Succesfully");
                    }
                    else{
                         System.out.println("Invalid Name");
                    }
                }
                else{
                     System.out.println("Duplicate Voting not allowed not allowed");
                }
                
                
                
            }
            if(choice==3){
                 System.out.println("Election Results:");
                for(Map.Entry<String, Integer> map: cr.entrySet()){
                    System.out.println(map.getKey()+" -> "+map.getValue());
                }
            }

            if(choice==4){
                int max=0;
                String n="";
                 for(Map.Entry<String, Integer> map: cr.entrySet()){
                    if(max<map.getValue()){
                       max=map.getValue();
                       n=map.getKey();
                    }
                 }

                 System.out.println("winner of the election is: "+ n + " with "+ max+ " votes");
                
                
            }
        
        } while (choice!=5);

        
    }
}

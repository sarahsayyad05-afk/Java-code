import java.util.*;

public class ResturantTableReservation {
    public static void main(String[] args) {
      
   
        int choice;
        Scanner sc=new Scanner(System.in);

        HashMap<Integer,Integer> res=new HashMap<>();
        HashSet<Integer> id=new HashSet<>();
        ArrayList<Integer> tno=new ArrayList<>();
        do { 
            System.out.println("----College Election System----");
            System.out.println("1.Add Table");
            System.out.println("2.Reserve Table");
            System.out.println("3.Display Table");
            System.out.println("4.Display Reservation");
            System.out.println("5.Search Reservation");
            System.out.println("6.Exit");
            System.out.println("Enter Choice:");
            choice=sc.nextInt();
            sc.nextLine();
            if (choice==1){
                System.out.println("Enter table no:");
                int i=sc.nextInt();
                 tno.add(i);
                  System.out.println("Table Added Succesfully!");
                System.out.println();

            }
            if(choice==2){
                System.out.println("Available Table:");
                 for(int a: tno){
                    if(!(res.containsValue(a))){
                            System.out.println(a);
                    }
                    
                }
                System.out.println("Enter Customer ID: ");
                int i=sc.nextInt();
                if(!(id.contains(i))){
                    id.add(i);
                    sc.nextLine();
                    System.out.println("Enter Table no:");
                    int n=sc.nextInt();
                    if((tno.contains(n)) && (!(res.containsValue(n)))){

                        res.put(i, n);
                         System.out.println("Reservation Made Succesfully");
                    }
                    else{
                         System.out.println("Invalid Table number");
                    }
                }
                else{
                     System.out.println("Multiple Resevation not allowed");
                }
                
                System.out.println();
                
            }
            if(choice==3){
                System.out.println("Available Tables:");
                for(int a: tno){
                    if(!(res.containsValue(a))){
                            System.out.println(a);
                    }
                    
                }System.out.println();
            }

            if(choice==4){
                System.out.println("--Reservation Details--");
                 for(Map.Entry<Integer, Integer> map: res.entrySet()){
                   System.out.println("Cutomer ID: "+map.getKey()+" -> Table No: "+map.getValue());
                 }
                 System.out.println();

                 
                
                
            }
            if(choice==5){
                System.out.println("Enter the customer ID you want to search:");
                int r=sc.nextInt();
                if(res.containsKey(r)){
                    System.out.println("Reservation Found: "+res.get(r));
                }
                else{
                    System.out.println("No reservation Found");
                }
                System.out.println();
            }
        
        } while (choice!=6);

        
    }
}

    
 //create a class cstomer with data members c-id,c_mno,c_name.
    // accept and display details of 5 customer. search a customer by name and 
    //display details if found
import java.util.Scanner;

class Customer {
     int c_id;
    String name;
    long phonenumber;
     Scanner sc=new Scanner(System.in);
       void cus_detail(){
         System.out.println("Enter Customer Name");
        name=sc.nextLine();
        System.out.println("Enter Customer ID:");
        c_id=sc.nextInt();
         System.out.println("Enter Customer Phone number");
        phonenumber=sc.nextLong();
       }
       void show(){
        
        System.out.println("Name:"+name+"   "+"C_Id: "+c_id+"   "+"Phone number: "+phonenumber);
    }
}

    
class CustomerDetail{
    public static void main(String[] args) {
          Customer [] cus=new Customer[5];
          boolean ans=false;
       for (int i = 0; i <cus.length; i++) {
        System.out.println("Enter details of emp: "+(i+1));
        cus[i]=new Customer();
        cus[i].cus_detail();
           System.out.println();
       }
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the name of customer to search");
       String n=sc.nextLine();
       for (int i = 0; i < cus.length; i++) {
         ans=n.equalsIgnoreCase(cus[i].name);
        if(ans==true){
           ans=true;
             cus[i].show();
        }
       
           
       }
        if(ans==false)
            System.out.println("Customer not found");


    }
}
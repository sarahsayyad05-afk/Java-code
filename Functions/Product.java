import java.util.Scanner;

class ProductDetails{
    Scanner sc=new Scanner(System.in);
    int p_id;
    String Pname;
    int Pquantity;
    int price;
    int total;
    
   
    void Pdetail(){
      
        System.out.println("Enter Product Name");
        Pname=sc.next();
        System.out.println("Enter Product ID:");
        p_id=sc.nextInt();
         System.out.println("Enter Product Quantity");
        Pquantity=sc.nextInt();
        System.out.println("Enter Product Price");
        price=sc.nextInt();
    }

    void calculateTotal() {
        total = Pquantity * price;
    }


}

class Product{
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
          System.out.println("Enter number of products you want to buy:");
      int  n=sc.nextInt();
      int Grandtotal=0;
       
         
      ProductDetails [] p=new ProductDetails[n];
       for (int i = 0; i <p.length; i++) {
        System.out.println("Enter Product "+(i+1)+" Detail");
        p[i]=new ProductDetails();
        p[i].Pdetail();
        p[i].calculateTotal();

       
           System.out.println();
    
       }
    
        System.out.println("Your Bill: ");
        for (int i = 0; i < p.length; i++) {
            System.out.println( p[i].Pname + ": " +p[i].Pquantity +  " = " + p[i].total);
            Grandtotal += p[i].total;
        }

        System.out.println("\nGrand Total = " + Grandtotal);

      
    
    }
}
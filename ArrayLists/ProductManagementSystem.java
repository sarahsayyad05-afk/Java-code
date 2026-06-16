import java.util.ArrayList;
import java.util.Scanner;
public class ProductManagementSystem
{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    ArrayList<String> pname = new ArrayList<>();
    ArrayList<Integer> pid = new ArrayList<>();
    ArrayList<Integer> pprize = new ArrayList<>();
    ArrayList<Integer> pqty = new ArrayList<>();
    while(true)
    {
      System.out.println("1.Add product\n2.Display all product\n3.search product\n4.Delete product\n5.Update prize\n6.update quntity\n7.search by product price in given range\n8.Delete all\n9.Exit");
      System.out.println("Enter your choice");
      int ch = sc.nextInt();
      if(ch==1)
      {
        sc.nextLine();
        System.out.println("Enter a product name :");
        pname.add(sc.nextLine());
        while (true){
        System.out.println("Enter a product id :");
        int i = sc.nextInt();
        if(!pid.contains(i))
        {
          pid.add(i);
          break;
        }
        else
        {
          System.out.println("enter id is allready exits");
        }}
        System.out.println("Enter product prize :");
        pprize.add(sc.nextInt());
        System.out.println("Enter product quntity :");
        pqty.add(sc.nextInt());
        System.out.println("Product added successfully");
      }
      if(ch==2)
      {
        if(pid.isEmpty()&&pname.isEmpty()&&pprize.isEmpty()&&pqty.isEmpty())
        {
          System.out.println("No product availables");
        }
        else
        {
        for(int i = 0; i < pid.size(); i++) 
        {
            System.out.println("---------------");
            System.out.println("Product id :"+pid.get(i));
            System.out.println("Product name :"+pname.get(i));
            System.out.println("Product price :"+pprize.get(i));
            System.out.println("Product quantity :"+pqty.get(i));
            System.out.println("total amount:"+pprize.get(i)*pqty.get(i));
            System.out.println("---------------");
        }}
      }
      if(ch==3)
      {
        boolean b = false;
        System.out.println("Enter id to search product");
        int id = sc.nextInt();
        for(int i = 0; i < pid.size(); i++) 
        {
          if(pid.get(i)==id)
          {
            b=true;
            System.out.println("Product id :"+pid.get(i));
            System.out.println("Product name :"+pname.get(i));
            System.out.println("Product price :"+pprize.get(i));
            System.out.println("Product quantity :"+pqty.get(i));
            break;
          }
        }
        if(!b)
          {
            System.out.println("given id is not present in list");
          }
        }
      
      if(ch==4)
      {
        boolean b= false;
        System.out.println("Enter product id to remove");
        int id = sc.nextInt();
        for(int i = 0; i < pid.size(); i++) 
        {
          if(pid.get(i)==id)
          {
            b=true;
            pid.remove(i);
            pname.remove(i);
            pprize.remove(i);
            pqty.remove(i);
            System.out.println("Product deleted successfully");
            break;
          }
        }
          if(!b)
          {
            System.out.println("given id is not present in list");
          }
        
      }
      if(ch==5)
      {
        System.out.println("Enter product id for update");
        int id = sc.nextInt();
        for(int i = 0; i < pid.size(); i++) 
        {
          if(pid.get(i)==id)
          {
            System.out.println("Enter new price");
            pprize.set(i,sc.nextInt());
            System.out.println("price updated");
          }
        }
      }
      if(ch==6)
      {
        System.out.println("Enter product id for update");
        int id = sc.nextInt();
        for(int i = 0; i < pid.size(); i++) 
        {
          if(pid.get(i)==id)
          {
            System.out.println("Enter new quantity");
            pqty.set(i,sc.nextInt());
            System.out.println("quantity updated");
          }
        }
      }
      if(ch==7)
      {
        boolean b=false;
        System.out.println("Enter a minimun am maximum value");
        int min=sc.nextInt();
        int max=sc.nextInt();
        for (int i = 0; i < pid.size(); i++) 
        {
            if(pprize.get(i)>min && pprize.get(i)<max)
            {
            System.out.println("---------------");
            System.out.println("Product id :"+pid.get(i));
            System.out.println("Product name :"+pname.get(i));
            System.out.println("Product price :"+pprize.get(i));
            System.out.println("Product quantity :"+pqty.get(i));
            System.out.println("total amount:"+pprize.get(i)*pqty.get(i));
            System.out.println("---------------");
            b=true;
            }
        }
      if(!b)
      {
        System.out.println("No product are available in given range");
      }
        
      }
      if(ch==8)
      {
        pid.clear();
        pname.clear();
        pqty.clear();
        pprize.clear();
      }
      if(ch==9)
      {
        System.out.println("Exit");
        break;
      }
    }
  }
}

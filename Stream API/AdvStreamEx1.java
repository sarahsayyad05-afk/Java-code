import java.util.*;
import java.util.stream.Collectors;

class Product{
    private int pID;
    private String pname;
    private String category;
    private double price;
    private int quantitysold;
    public Product(int i,String n, String c, double p, int q){
        pID=i;
        pname=n;
        category=c;
        price=p;
        quantitysold=q;

    }
    public int getID(){
        return pID;
    }
    public String getName(){
        return pname;
    }
    public String getCategory(){
        return category;
    }
    public double getPrice(){
        return price;
    }
    public int getQuantity(){
        return quantitysold;
    }
    public String toString() {
        return pname;
    }
}
public class AdvStreamEx1 {
 public static void main(String[] args) {
     List<Product> products =
                Arrays.asList(  new Product(101,"Laptop","Electronics", 75000, 5),
                 new Product(102,"Mobile","Electronics",30000,10),
        new Product(103,"Shoes","Fashion",5000,7),
  new Product( 104, "Watch","Fashion",8000,4),
  new Product( 105,  "Refrigerator", "Home Appliance", 45000,3));
 System.out.println("1.Display all products: "+ products.stream().map(a->a.getName()).toList());
 System.out.println("2.Display product price>50000"+ products.stream().filter(a->a.getPrice()>50000).map(a->a.getName()).toList());
System.out.println("3.Sort by price in acending : " +products.stream().map(a->a.getPrice()).sorted().toList());
System.out.println("Sort by price in decending : " +products.stream().map(a->a.getPrice()).sorted((s2,s1)->s1.compareTo(s1)).toList());
System.out.println("4.Total revenue: "+ products.stream().collect(Collectors.summingDouble(a->a.getPrice())));
// System.out.println("5.Most Expensive Product: "+ products.stream().map(a->a.getPrice()).collect(Collectors.groupingBy(a->a.getName())).max((s1,s2)->s1.compareTo(s2)).get());
// System.out.println("6.Most Cheap Product: "+ products.stream().map(a->a.getPrice()).min((s1,s2)->s1.compareTo(s2)).get());
System.out.println("7.Remove duplicates: "+products.stream().map(a->a.getName()).distinct().toList());
System.out.println("8.Grouping by category: "+products.stream().collect(Collectors.groupingBy(a->a.getCategory())));
System.out.println("9.count product by category: "+products.stream().collect(Collectors.groupingBy(a->a.getCategory(),Collectors.counting())));
System.out.println("10.count product by category: "+products.stream().filter(a->a.getQuantity()<5).toList());
System.out.println("11.any product having price<100: "+products.stream().anyMatch(a->a.getPrice()<100));
System.out.println("12.all Electronic product having price>100: "+products.stream().filter(a->a.getCategory()=="Electronics").allMatch(a->a.getPrice()>100));

 }   
}

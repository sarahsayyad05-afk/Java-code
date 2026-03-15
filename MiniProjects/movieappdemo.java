import java.util.Scanner;

class Movie{
String mname;

String category;
Scanner sc = new Scanner(System.in);
int discount=0;


void accept(){
System.out.println("Enter Movie name:");
mname=sc.nextLine();
System.out.println("Enter Category:(Child, Senior, Adult)");
category=sc.nextLine();
}
}
class regular_movie extends Movie{
double amount;
float tprice=200;
void calculate(){
    if(category.equalsIgnoreCase("child"))
{
   
   amount=tprice*0.5;
}
else if(category.equalsIgnoreCase("senior")){
   amount=tprice*0.3;
}
else if(category.equalsIgnoreCase("adult")){
    amount=tprice*0.2;
}
else{
    System.out.println("Enter a valid category");
}
}

void display(){
    System.out.println("--Regular Movie Details--");
    System.out.println("Movie name: "+mname);
    System.out.println("Movie Category: "+category);
    System.out.println("Ticket price: "+tprice);
   
    System.out.println("Final Amount: "+(tprice-amount));
}
}
class Three_3D extends Movie{
  int excharge=50;
  float tprice=300;
  double amount;
  void calculate(){
    if(category.equalsIgnoreCase("child"))
{
   
   amount=excharge+(tprice*0.5);
}
else if(category.equalsIgnoreCase("senior")){
   
       amount=excharge+(tprice*0.5);
    
}
else if(category.equalsIgnoreCase("adult")){
    
        amount=excharge+(tprice*0.5);
}
else{
    System.out.println("Enter a valid category");
}
}

void display(){
    System.out.println("-- 3D Movie Details--");
    System.out.println("Movie name: "+mname);
    System.out.println("Movie Category: "+category);
    System.out.println("Ticket price: "+tprice);
  
    System.out.println("Extra Charge: "+excharge);
    System.out.println("Final Amount: "+(tprice-amount));
}

}
class movieappdemo{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
     int choice;

        System.out.println("Enter the movie type:");
        System.out.println("1) Regular movie ");
        System.out.println("2) 3D movie");
        System.out.println();
        choice = sc.nextInt();
        sc.nextLine(); 
        if (choice == 1) {
           regular_movie r=new regular_movie();
            r.accept();
            r.calculate();
            r.display();
        
        } else if (choice == 2) {
            Three_3D t=new Three_3D();
            t.accept();
          t.calculate();
            t.display();
        } else {
            System.out.println("Enter a valid choice");
        }
    }
}
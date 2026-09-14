import java.util.Scanner;
interface searchable{
    void search(String s);

}
class Document implements searchable{
    String content;
    Document(String c){
        content=c;
        
    }
  public  void search(String s){
       if(content.contains(s)){
        System.out.println("the key "+s +" is present in the document");
       }
       else{
         System.out.println("the key "+s +" is not present in the document");
       }
    }
}
class Webpage implements searchable{
    String url;

    public Webpage(String c) {
        url = c;
    }
     public  void search(String s){
         if(url.contains(s)){
        System.out.println("the key "+s +" is present in the document");
       }
       else{
         System.out.println("the key "+s +" is not present in the document");
       }
     }
    
}

class searching_interface{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String/ Url");
        String c=sc.nextLine();
        System.out.println("What do you want to search? :");
        String s=sc.nextLine();
        System.out.println("Where would you like to search it in?");
        System.out.println("1) Search in Document");
        System.out.println("2) Search in Webpage");
        System.out.println("Enter your choice( 1 or 2)");
        int choice=sc.nextInt();
        if(choice==1){
            Document d=new Document(c);
            d.search(s);
        }
        else if(choice==2){
            Webpage w=new Webpage(c);
            w.search(s);
        }
        else{
            System.out.println("Enter a valid choice...");
        }

        
    }
}
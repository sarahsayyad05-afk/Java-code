 ///create a class addition w datamembers x and y. initialize value of x and y with constructor. 
 ///calculate the addition and display it using display function
 class Addition{
    int x;
    int y;
    Addition(){
        x=100;
        y=200;
    }
   void display(){
         System.out.println("Addition of x and y: "+(x+y));
    }
    public static void main(String[] args) {
        Addition add=new Addition();
        add.display();
    }
 }

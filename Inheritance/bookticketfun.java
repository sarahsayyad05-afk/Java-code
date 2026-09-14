import java.util.Scanner;
class bookticketfun{
    ///create a function book ticket(it only take the movie name),
///2 book ticket( movie name, no of seats),
///3 book ticket(movie name, no of seats, timing). take all values from user
void bookticket(String m){
    System.out.println("Movie Name: "+m);
}
void bookticket(String m, int s){
    System.out.println("Movie Name: "+m);
    System.out.println("No of seat: "+s);
}
void bookticket(String m, int s,float t){
    System.out.println("Movie Name: "+m);
    System.out.println("No of seat : "+s);
    System.out.println("Timing : "+t);
}


public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Movie Name:");
    String mname=sc.nextLine();
    System.out.println("Enter No of seats:");
    int no_of_seats=sc.nextInt();
    System.out.println("Enter Timing: ");
    float time=sc.nextFloat();
    bookticketfun bt=new bookticketfun();
    bt.bookticket(mname);
    bt.bookticket(mname, no_of_seats);
    bt.bookticket(mname, no_of_seats, time);
}
}
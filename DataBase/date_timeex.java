import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class date_timeex {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter date: dd/mm/yyyy");
        String date=sc.nextLine();
        DateTimeFormatter df=DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate d=LocalDate.parse(date,df);
        System.out.println("Date: "+ d);
        System.out.println("IS leap? : "+ d.isLeapYear());
    }
}

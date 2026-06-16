import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class JavaTimeDemo {

    public static void main(String[] args) {

        // Current Date
        LocalDate today = LocalDate.now();
        System.out.println("Current Date: " + today);

        // Current Time
        LocalTime nowTime = LocalTime.now();
        System.out.println("Current Time: " + nowTime);

        // Current Date and Time
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Current DateTime: " + now);

        // Specific Date
        LocalDate dob = LocalDate.of(2005, 8, 26);
        System.out.println("DOB: " + dob);

        // Get Day, Month, Year
        System.out.println("Day: " + dob.getDayOfMonth());
        System.out.println("Month: " + dob.getMonth());
        System.out.println("Year: " + dob.getYear());

        // Add Days, Months, Years
        System.out.println("After 10 Days: " + dob.plusDays(10));
        System.out.println("After 2 Months: " + dob.plusMonths(2));
        System.out.println("After 1 Year: " + dob.plusYears(1));

        // Subtract
        System.out.println("Before 5 Days: " + dob.minusDays(5));

        // Compare Dates
        LocalDate anotherDate = LocalDate.of(2025, 1, 1);

        System.out.println("Is DOB before anotherDate? "+ dob.isBefore(anotherDate));

        System.out.println("Is DOB after anotherDate? "+ dob.isAfter(anotherDate));

        // Date Difference
        Period p = Period.between(dob, today);

        System.out.println( "Age: " + p.getYears() + " Years "+ p.getMonths() + " Months " + p.getDays() + " Days");

        // Time Difference
        LocalTime t1 = LocalTime.of(10, 0);
        LocalTime t2 = LocalTime.of(12, 30);

        long hours = ChronoUnit.HOURS.between(t1, t2);

        System.out.println("Hours Difference: " + hours);

        // Formatting Date
        DateTimeFormatter f =DateTimeFormatter.ofPattern("dd/MM/yyyy");

        String formatted = today.format(f);

        System.out.println( "Formatted Date: " + formatted );

        // Parsing Date
        LocalDate parsedDate = LocalDate.parse( "26/08/2005", f );

        System.out.println("Parsed Date: " + parsedDate );

        // Leap Year Check
        System.out.println( "Leap Year? " + today.isLeapYear() );

        // Day Of Week
        System.out.println( "Day Of Week: " + today.getDayOfWeek());
    }
}
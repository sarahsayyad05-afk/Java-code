import java.util.Scanner;
import java.util.regex.Pattern;

public class ProgrammingChatbot {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;

        while (true) {
            System.out.print("User: ");
            input = scanner.nextLine();

            String response = getResponse(input);
            System.out.println("Bot: " + response);

            if (Pattern.compile("(?i)bye").matcher(input).find()) {
                break;
            }
        }

        scanner.close();
    }

    public static String getResponse(String input) {

       
        if (Pattern.compile("(?i)bye").matcher(input).find()) {
            return "Goodbye.";
        }

       
        if (Pattern.compile("(?i)hello|hi|hey").matcher(input).find()) {
            return "Hello! How can I help you?";
        }

       
        if (Pattern.compile("(?i)java").matcher(input).find()) {
            return "Java is an object-oriented programming language.";
        }

        
        if (Pattern.compile("(?i)python").matcher(input).find()) {
            return "Python is a high-level, easy-to-learn programming language.";
        }

        
        if (Pattern.compile("(?i)oops|object").matcher(input).find()) {
            return "OOP stands for Object-Oriented Programming. It uses objects and classes.";
        }

       
        if (Pattern.compile("(?i)regex|pattern").matcher(input).find()) {
            return "Regex (Regular Expression) is a sequence of characters used for pattern matching.";
        }

        
        if (Pattern.compile("(?i)loop|for|while").matcher(input).find()) {
            return "Loops are used to repeat a block of code.";
        }

        
        return "I'm sorry, I didn't understand that. Please ask about Java, Python, OOP, Regex, or Loops.";
    }
}
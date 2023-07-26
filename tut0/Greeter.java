
import java.util.Scanner;

/**
This is a greeter class
**/
public class Greeter {
    public static void main(String args[]) {
        greeter();
    }
/**
Greets the person
**/
    public static void greeter() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        System.out.println("Hello " + scanner.nextLine());
/**
Gets the name
@return the name
**/
    private static string getName() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        return scanner.nextLine();
    }
}

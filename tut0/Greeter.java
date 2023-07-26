
import java.util.Scanner;

/**
This is a greeter class
**/
public class Greeter {
    static String name
    public static void main(String args[]) {
        greeter();
    }
/**
Greets the person
**/
    public static void greeter() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");

        name = scanner.nextLine()
        System.out.println("Hello " + name);
    }
/**
Gets the name
@return the name
**/

    private static string getName() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        return scanner.nextLine();
    }

    private static void goodbye() {
        Systeem.out.print("Goodbye " + name);
    }
}

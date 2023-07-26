
import java.util.Scanner;


public class Greeter {
    static String name
    public static void main(String args[]) {
        greeter();
    }

    public static void greeter() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        name = scanner.nextLine()
        System.out.println("Hello " + name);

    private static string getName() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        return scanner.nextLine();
    }

    private static void goodbye() {
        Systeem.out.print("Goodbye " + name);
    }
}

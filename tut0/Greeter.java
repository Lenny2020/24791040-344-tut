
import java.util.Scanner;


public class Greeter {
    public static void main(String args[]) {
        greeter();
    }

    public static void greeter() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        System.out.println("Hello " + scanner.nextLine());

    private static string getName() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        return scanner.nextLine();
    }
}

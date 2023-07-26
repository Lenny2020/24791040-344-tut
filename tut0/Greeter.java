java.util.Scanner;
public class Greeter {
    public static void main(String args[]) {
        greeter(args[0]);
    }

    private static void greeter(String name) {
        System.out.println("Hello " + name);
    }

    private static string getName() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        return scanner.nextLine();
    }
}

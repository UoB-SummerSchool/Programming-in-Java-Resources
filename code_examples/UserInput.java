import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter an integer: ");
        int length = scanner.nextInt(); // input integer and press return

        // length now has value of input
        System.out.println("The value of length is: " + length);
    }
}

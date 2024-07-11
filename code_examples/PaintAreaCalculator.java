import java.util.Scanner;

public class PaintAreaCalculator {

    // Calculate area of walls and ceiling.
    public static int area(int length, int width, int height) {
        int sides = 2 * length * height;
        int ends = 2 * width * height;
        int ceiling = length * width;
        return sides + ends + ceiling;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read room size
        System.out.println("Enter room length:");
        int length = scanner.nextInt();
        System.out.println("Enter room width:");
        int width = scanner.nextInt();
        System.out.println("Enter room height:");
        int height = scanner.nextInt();
        // Calculate the total area
        int total = area(length, width, height);
        // Print the area
        System.out.println("The paint area is: " + total);
        // Close the scanner
        scanner.close();
    }
}

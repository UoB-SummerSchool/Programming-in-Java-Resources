import java.util.Scanner;

public class SquareRoot {
    // Square root (like sqrt) via Newton Algorithm
    public static double root(double x) {
        double r = x / 2.0; // first guess
        double epsilon = 1E-14;
        while (Math.abs(r - x / r) > epsilon) {
            r = (r + x / r) / 2.0; // Newton step
        }
        return r;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number:");
        double x = scanner.nextDouble();
        System.out.printf("The square root is: %f\n", root(x));
    }
}
import java.util.Scanner;
public class AverageCalculator {

    // Calculate average of numbers
    public static double avg(int n, double[] numbers) {
        double sum = 0;
        for (int i = 0; i < n; i++) {
            sum += numbers[i];
        }
        return sum / n;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many numbers to average:");
        int n = scanner.nextInt();
        double[] numbers = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("Enter number no %d:\n", i + 1);
            numbers[i] = scanner.nextDouble();
        }
        System.out.printf("Average is: %f\n", avg(n, numbers));
        scanner.close();
    }
}

import java.util.Scanner;

public class TriangleNumber {
    public static int sum(int n) {
        if (n == 1) return 1;
        else return n + sum(n - 1);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = scanner.nextInt();
        System.out.printf("The %dth triangle number is: %d\n", n, sum(n));
    }
}

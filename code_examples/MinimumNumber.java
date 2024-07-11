import java.util.Scanner;

public class MinimumNumber {

    public static int minimum(int x, int y) {
        int min;
        if (x < y) {
            min = x;
        } else {
            min = y;
        }
        return min;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter x:");
        int x = scanner.nextInt();
        System.out.println("Enter y:");
        int y = scanner.nextInt();
        System.out.println("The smaller number is: " + minimum(x, y));
        scanner.close();
    }
}
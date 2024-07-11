import java.util.Scanner;

public class Hailstone {
    // Return the n'th hailstone number given a seed
    public static int hailstone(int seed, int n) {
        int next;
        if (seed % 2 == 1) next = 3 * seed + 1;
        else next = seed / 2;
        if (n == 1) return next;
        else return hailstone(next, n - 1);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter seed:");
        int seed = scanner.nextInt();
        System.out.println("Enter how many steps to go:");
        int n = scanner.nextInt();
        System.out.printf("The %dth hailstone number for seed %d is: %d\n", n, seed, hailstone(seed, n));
    }
}

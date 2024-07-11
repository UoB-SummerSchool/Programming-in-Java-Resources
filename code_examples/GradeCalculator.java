import java.util.Scanner;

public class GradeCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your mark:");
        int mark = scanner.nextInt();

        System.out.println("Your grade is: " + grade(mark));
    }

    public static int grade(int mark) {
        int grade;
        if (mark >= 70) {
            grade = 1;
        } else if (mark >= 50) {
            grade = 2;
        } else if (mark >= 40) {
            grade = 3;
        } else {
            grade = 4;
        }
        return grade;
    }
}

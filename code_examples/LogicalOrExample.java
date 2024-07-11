public class LogicalOrExample {
    public static void main(String[] args) {
        int age = 16;
        boolean hasParentalConsent = true;

        // Using || to check if at least one condition is true
        if (age >= 18 || hasParentalConsent) {
            System.out.println("You can watch the movie.");
        } else {
            System.out.println("You cannot watch the movie.");
        }
    }
}

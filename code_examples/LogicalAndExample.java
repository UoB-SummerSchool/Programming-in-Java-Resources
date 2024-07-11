public class LogicalAndExample {
    public static void main(String[] args) {
        int age = 20;
        boolean hasID = true;

        // Using && to check if both conditions are true
        if (age >= 18 && hasID) {
            System.out.println("You are allowed to enter the club.");
        } else {
            System.out.println("You are not allowed to enter the club.");
        }
    }
}

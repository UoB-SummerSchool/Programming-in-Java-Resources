public class LogicalNotExample {
    public static void main(String[] args) {
        boolean isRaining = false;

        // Using ! to invert the boolean value
        if (!isRaining) {
            System.out.println("It is not raining. You can go outside without an umbrella.");
        } else {
            System.out.println("It is raining. You need an umbrella.");
        }
    }
}

public class PaintAreaEasier {

    // Calculate area of walls and ceiling.
    public static int area(int length, int width, int height) {
        int sides = 2 * length * height;
        int ends = 2 * width * height;
        int ceiling = length * width;
        return sides + ends + ceiling;
    }

    // Main method to print out the area of paint for my room.
    public static void main(String[] args) {
        int total = area(5, 3, 2);
        System.out.printf("The paint area is: %d\n", total);
    }
}

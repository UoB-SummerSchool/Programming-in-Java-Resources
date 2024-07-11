public class PaintArea {

    // Calculate area of walls and ceiling.
    public static int area(int length, int width, int height) {
        return 2 * (width + length) * height + length * width;
    }

    // Main method to print out the area of paint for my room.
    public static void main(String[] args) {
        System.out.printf("The paint area is: %d\n", area(5, 3, 2));
    }
}




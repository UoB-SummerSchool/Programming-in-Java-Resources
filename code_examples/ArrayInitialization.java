public class ArrayInitialization {
    public static void main(String[] args) {
        int[] seq = new int[3]; // declare an array of 3 int variables
        seq[0] = 10; // initialize first variable
        seq[1] = 5;  // initialize second variable
        seq[2] = 4;  // initialize third (i.e. last) variable

        int[] myIntArray = {1, 2, 3};
        int[] myIntArray_ = new int[]{1, 2, 3};


        // Optional: Print the array to verify initialization
        for (int i = 0; i < seq.length; i++) {
            System.out.println("seq[" + i + "] = " + myIntArray[i]);
        }
    }
}

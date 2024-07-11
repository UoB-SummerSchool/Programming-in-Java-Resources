public class MatrixPrinter {

    public static void print(int h, int w, int[][] matrix) {
        for (int r = 0; r < h; r++) {
            for (int c = 0; c < w; c++) {
                if (c > 0) System.out.print(" ");
                System.out.print(matrix[r][c]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int h = 3;
        int w = 3;
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        print(h, w, matrix);
    }
}

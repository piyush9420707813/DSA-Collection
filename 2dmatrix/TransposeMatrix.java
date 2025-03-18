public class TransposeMatrix {
    public static int[][] transposeMat(int matrix[][]) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int transpose[][] = new int[cols][rows];  // Create a new matrix with swapped dimensions

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = matrix[i][j];  // Swap elements
            }
        }

        return transpose; // Return the transposed matrix
    }

    public static void printMatrix(int matrix[][]) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int matrix[][] = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };
        

        int transposedMatrix[][] = transposeMat(matrix);
        printMatrix(transposedMatrix);
    }}
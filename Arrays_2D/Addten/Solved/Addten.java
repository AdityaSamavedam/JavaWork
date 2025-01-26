package Arrays_2D.Addten.Solved;

public class Addten {
    public static void main(String[] args) {
        int[][] mat = {
            {3, 5, 7},
            {2, 8, 6},
            {1, 4, 9}
        };

        // Add 10 to each element in the second row (row index 1)
        int rowIndex = 1; // Index of the row to modify
        for (int i = 0; i < mat[rowIndex].length; i++) {
            mat[rowIndex][i] += 10;
        }

        // Print the updated matrix
        System.out.println("Updated matrix:");
        for (int[] row : mat) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}


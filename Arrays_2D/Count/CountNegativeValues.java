package Arrays_2D.Count;

public class CountNegativeValues {
    public static void main(String[] args) {
        int[][] matrix = {
            {3, -5, 7},
            {-2, 8, -6},
            {1, -4, 9}
        };

        int negativeCount = 0;

        // Iterate through the matrix
        for (int[] row : matrix) {
            for (int value : row) {
                if (value < 0) {
                    negativeCount++; // Increment the count for negative values
                }
            }
        }

        System.out.println("The number of negative values in the matrix is: " + negativeCount);
    }
}


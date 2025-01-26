package Arrays_2D.Accumulate.Solved;

    public class Accumulate2DArray {
        public static void main(String[] args) {
            int[][] array = {
                {3, 5, 7},
                {2, 8, 6},
                {1, 4, 9}
            };
    
            int sum = 0;
    
            // Iterate through each row and column of the 2D array
            for (int[] row : array) {
                for (int value : row) {
                    sum += value; // Accumulate the sum
                }
            }
    
            System.out.println("The total sum of the 2D array is: " + sum);
        }
    }
    


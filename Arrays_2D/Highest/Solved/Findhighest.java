package Arrays_2D.Highest.Solved;


public class Findhighest {

        public static void main(String[] args) {
            int[][] array = {
                {3, 5, 7},
                {2, 8, 6},
                {1, 4, 9}
            };
    
            int max = Integer.MIN_VALUE;
          
    
            // Iterate through each row and column of the 2D array
            for (int[] row : array) {
                for (int value : row) {
                    if (value > max) {
                        max = value;
                    }
                }
            }
    
            System.out.println("The highest value in the 2D array is: " + max);
        }
    }

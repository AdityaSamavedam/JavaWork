package Arrays_2D;

import java.util.Arrays;

public class ToString {
    public static void printMatrix(String matrix[][]) {

        for (String[] row : matrix) {
      
            System.out.println(Arrays.toString(row));
        }
    }

    public static void main(String[] args) {

        String[][] matrix = { { "Hi, I am Karen" },
                { "I'm new to Java" },
                { "I love swimming" },
                { "sometimes I play keyboard" } };
        printMatrix(matrix);
    }
}

// In the first iteration, String[]row will read “Hi, I am Karen” as an Array,
// convert it to a String and then print it. That’s how all iterations will take
// place
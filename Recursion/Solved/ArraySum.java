package Recursion.Solved;

public class ArraySum {

    public static int sumArray(int[] arr, int n) {
        // Base case: if array is empty (n <= 0), return 0
        if (n <= 0) {
            return 0;
        }
        // Recursive case: last element + sum of the rest of the array
        return arr[n - 1] + sumArray(arr, n - 1);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(sumArray(arr, arr.length)); // Output: 15
    }
}


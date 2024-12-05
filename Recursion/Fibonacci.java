package Recursion;

public class Fibonacci {

    public static int fibonacci(int n) {
        if (n <= 1) { // Base cases: 0 and 1
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2); // Recursive case
    }

    public static void main(String[] args) {
        int result = fibonacci(4); // Finds the 6th Fibonacci number
        System.out.println("Fibonacci of 6 is: " + result);
    }
}

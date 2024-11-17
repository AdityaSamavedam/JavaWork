package Recursion;

public class Factorial {
    
    public static int factorial(int n) {
        // Base case: if n is 0, return 1
        if (n == 0) {
            return 1;
        }
        // Recursive case: n * factorial(n - 1)
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        int result = factorial(5); // 5! = 5 * 4 * 3 * 2 * 1 = 120
        System.out.println("Factorial of 5 is: " + result);
    }
}

/*
1.The factorial method calls itself with n - 1 until n reaches 0, which is the base case.
2.When n is 0, the method returns 1, stopping further recursion.
3.Each call is resolved backward, ultimately calculating the product of all numbers from n down to 1. */

package Recursion.Solved;

public class PowerFunction {

    public static double power(double base, int exp) {
        // Base case: any number raised to the power of 0 is 1
        if (exp == 0) {
            return 1;
        }
        // If exponent is negative, use reciprocal for positive exponent
        if (exp < 0) {
            return 1 / power(base, -exp);
        }
        // Recursive case
        return base * power(base, exp - 1);
    }

    public static void main(String[] args) {
        System.out.println(power(2, 3)); // Output: 8
        System.out.println(power(5, 0)); // Output: 1
        System.out.println(power(2, -3)); // Output: 0.125
    }
}


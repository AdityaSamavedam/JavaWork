# What is a base case in recursion, and why is it important?
A base case is the condition in a recursive function that stops the recursion. It’s essential because, without a base case, the recursion would continue indefinitely, leading to a StackOverflowError.
# Explain the difference between a recursive case and a base case.
A base case is the condition under which the recursive function stops calling itself, while a recursive case is the part of the function where it calls itself with modified arguments to gradually approach the base case.
# Given the following recursive function, what will mystery(4) return?
public static int mystery(int n) {
    if (n <= 1) {
        return n;
    }
    return n + mystery(n - 1);
}
# What will factorial(5) return in the following code?

public static int factorial(int n) {
    if (n == 0) {
        return 1;
    }
    return n * factorial(n - 1);
}

# What’s wrong with the following recursive function?

public static int sumToN(int n) {
    return n + sumToN(n - 1);
}

# Write a recursive function power that computes base raised to the power of exp (i.e., base pow exp)

# Write a recursive function that returns the sum of all elements in an array.

# Trace the following recursive function call and list the values that are printed:

public static void countDown(int n) {
    if (n <= 0) {
        System.out.println("Blast off!");
    } else {
        System.out.println(n);
        countDown(n - 1);
    }
}

## Examine the following function and explain why it leads to infinite recursion:
public static int countdown(int n) {
    if (n > 0) {
        System.out.println(n);
        return countdown(n);
    } else {
        return 0;
    }
}

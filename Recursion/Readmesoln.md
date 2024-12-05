## Given the following recursive function, what will mystery(4) return?
public static int mystery(int n) {
    if (n <= 1) {
        return n;
    }
    return n + mystery(n - 1);
}

## Answer
mystery(2) returns 2+1=3.
mystery(3) returns 3+3=6.
mystery(4) returns 4+6=10.

## Factorial 
can do

## Corrected Version of sumToN
To fix this, add a base case that stops the recursion when 𝑛 reaches 0 (or a value less than or equal to 0). Here’s how to modify it:
public static int sumToN(int n) {
    if (n <= 0) {  // Base case
        return 0;
    }
    return n + sumToN(n - 1);
}

### Explanation
Base Case: The base case if (n <= 0) return 0; stops the recursion when n is 0 or negative, preventing it from continuing indefinitely.

Recursive Step: The line return n + sumToN(n - 1); adds n to the sum of all integers from 
n−1 down to 1, effectively calculating the sum of all integers from 1 to n.

Example
With the corrected function, calling sumToN(5) would compute 5+4+3+2+1=15.

### Trace the following recursive function call and list the values that are printed:Countdowm
Output:
3
2
1
Blast off!

### Examine the following function and explain why it leads to infinite recursion:Countdown

Answer: This function has an infinite recursion problem because it calls countdown(n) without reducing 
n. To avoid this, it should call countdown(n - 1) to decrease n each time.

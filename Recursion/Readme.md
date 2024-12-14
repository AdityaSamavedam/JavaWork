## What is a base case in recursion, and why is it important?
A base case is the condition in a recursive function that stops the recursion. It’s essential because, without a base case, the recursion would continue indefinitely, leading to a StackOverflowError.
## Explain the difference between a recursive case and a base case.
A base case is the condition under which the recursive function stops calling itself, while a recursive case is the part of the function where it calls itself with modified arguments to gradually approach the base case.
## Given the following recursive function, what will mystery(4) return?
public static int mystery(int n) {
    if (n <= 1) {
        return n;
    }
    return n + mystery(n - 1);
}
## What will factorial(5) return in the following code?

public static int factorial(int n) {
    if (n == 0) {
        return 1;
    }
    return n * factorial(n - 1);
}

## What’s wrong with the following recursive function?

public static int sumToN(int n) {
    return n + sumToN(n - 1);
}

## Write a recursive function power that computes base raised to the power of exp (i.e., base pow exp)

## Write a recursive function that returns the sum of all elements in an array.

## Trace the following recursive function call and list the values that are printed:

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

## Given the array arr = {10, 2, 5, 8}, trace the steps of merge sort to show how the array is divided and merged.

## Write a Recursive Call Trace for Merge Sort

## Fill in the Missing Part of the Code

public static void mergeSort(int[] arr, int left, int right) {
    if (left < right) {
        int mid = left + (right - left) / 2;

        // Missing recursive calls
        _______________________
        _______________________

        merge(arr, left, mid, right);
    }
}

## Consider the following merge sort code. There is an error in the merge function. Identify the error and fix it.

public static void merge(int[] arr, int left, int mid, int right) {
    int n1 = mid - left + 1;
    int n2 = right - mid;

    int[] leftArray = new int[n1];
    int[] rightArray = new int[n2];

    for (int i = 0; i < n1; i++) leftArray[i] = arr[left + i];
    for (int j = 0; j < n2; j++) rightArray[j] = arr[mid + j];  // Potential Error

    int i = 0, j = 0, k = left;

    while (i < n1 && j < n2) {
        if (leftArray[i] <= rightArray[j]) {
            arr[k++] = leftArray[i++];
        } else {
            arr[k++] = rightArray[j++];
        }
    }

    while (i < n1) arr[k++] = leftArray[i++];
    while (j < n2) arr[k++] = rightArray[j++];
}

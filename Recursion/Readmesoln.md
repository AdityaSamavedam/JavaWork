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

## 
### Step 1:Step-by-step trace of Merge Sort on the array arr = {10, 2, 5, 8}:
Original Array: {10, 2, 5, 8}

### Step 2: Divide
Divide the array into two halves recursively until each subarray contains only one element.

### FirstSplit
Left:  {10, 2}
Right: {5, 8}


### Split the Left Subarray ({10, 2}):
Left:  {10}
Right: {2}

### Split Right Half ({5, 8}):

Left:  {5}
Right: {8}


### At this stage, the array has been divided into individual elements:

{10}, {2}, {5}, {8}

### Step 3: Merge Phase
Now we begin merging the subarrays in sorted order.

#### Merge {10} and {2}: 
Compare 10 and 2, and merge them in sorted order:
Merged: {2, 10}

#### Merge {5} and {8}
Merged: {5, 8}

#### Merge {2, 10} and {5, 8}: Compare elements and merge:

Compare 2 and 5: Take 2.
Compare 10 and 5: Take 5.
Compare 10 and 8: Take 8.
Take remaining 10.

Merged: {2, 5, 8, 10}

## Here’s the missing part of the code with the recursive calls for the left and right subarrays:


public static void mergeSort(int[] arr, int left, int right) {
    if (left < right) {
        int mid = left + (right - left) / 2;

        // Missing recursive calls
        mergeSort(arr, left, mid);       // Sort the left half
        mergeSort(arr, mid + 1, right); // Sort the right half

        merge(arr, left, mid, right); // Merge the sorted halves
    }
}

#### Explanation
Recursive Calls:

mergeSort(arr, left, mid): Recursively sorts the left half of the array.
mergeSort(arr, mid + 1, right): Recursively sorts the right half of the array.
Merge:

merge(arr, left, mid, right): Combines the two sorted halves back into a single sorted subarray.

## Consider the following merge sort code. There is an error in the merge function. Identify the error and fix it.

Issue is here in this merge function -
for (int j = 0; j < n2; j++) {
rightArray[j] = arr[mid + j];
}

The calculation for the index of rightArray is incorrect. arr[mid + j] should instead start from arr[mid + 1] because mid belongs to the left subarray. Therefore, the correct line should be:

for (int j = 0; j < n2; j++) 
{
    rightArray[j] = arr[mid + 1 + j];

}

This fix ensures that the rightArray correctly starts from the element immediately after mid.

## Algorithm implemented by the method can best be described as :
Binary Search

## If the programmer applies the binary search algorithm directly on the unsorted array, the behavior is undefined, and it may:

Return an incorrect index for 50. or 
Return -1 if the algorithm fails to find it.

## arr[j]> key
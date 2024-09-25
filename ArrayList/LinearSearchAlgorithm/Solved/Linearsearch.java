package ArrayList.LinearSearchAlgorithm.Solved;

import java.util.ArrayList;

public class Linearsearch {
        public static void main(String[] args) {
        // Create an ArrayList and add some integers
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        // Value to search for
        int target = 30;

        // Perform linear search
        int index = linearSearch(numbers, target);

        // Print the result
        if (index != -1) {
            System.out.println("Element " + target + " found at index: " + index);
        } else {
            System.out.println("Element " + target + " not found in the list.");
        }
    }

    // Method to perform linear search
    public static int linearSearch(ArrayList<Integer> list, int target) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == target) {
                return i; // Return the index if found
            }
        }
        return -1; // Return -1 if not found
    }
}



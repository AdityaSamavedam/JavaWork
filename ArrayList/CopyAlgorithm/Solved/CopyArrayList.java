package ArrayList.CopyAlgorithm.Solved;

import java.util.ArrayList;

public class CopyArrayList {
    public static void main(String[] args) {
        // Create an ArrayList and add some elements
        ArrayList<String> originalList = new ArrayList<>();
        originalList.add("Apple");
        originalList.add("Banana");
        originalList.add("Cherry");

        // Copy the ArrayList
        ArrayList<String> copiedList = new ArrayList<>(originalList);

        // Display the copied list
        System.out.println("Copied List: " + copiedList);
    }
}

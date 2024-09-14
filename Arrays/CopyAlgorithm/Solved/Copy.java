package CopyAlgorithm.Solved;
public class Copy {
    public static void main(String[] args) {
        
        int[] original = {1, 2, 3, 4, 5};
        int[] duplicate = new int[original.length];

        // Manually copy elements using a loop
        for (int i = 0; i < original.length; i++) {
            duplicate[i] = original[i];
        }

        // Print the destinationArray
        for (int value : duplicate) {
            System.out.println(value);
        }
    }
}

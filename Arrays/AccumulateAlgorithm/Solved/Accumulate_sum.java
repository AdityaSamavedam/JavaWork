package AccumulateAlgorithm.Solved;
public class Accumulate_sum {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int sum = 0;

        // Accumulate the sum of array elements using enhanced for loop
        for (int number : numbers) {
            sum += number;
        }

        System.out.println("Sum of array elements: " + sum);
    }
}

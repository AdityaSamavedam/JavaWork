package FindHighest.Solved;
public class FindHighest {
    public static void main(String[] args) {
        int[] numbers = { 13, 52, 70, 12, 8, 1 };
        int max = numbers[0]; // Assume first element is the maximum

        // Accumulate the maximum value using enhanced for loop
        /*
         * for (int number : numbers) {
         * if (number > max) {
         * max = number;
         * }
         * }
         */
        // Accumulate the maximum value using for loop
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max)
                max = numbers[i];
        }

        System.out.println("Maximum element in the array: " + max);
    }
}

public class EvennoCount {
    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4, 5, 6 };
        int count = 0;

        // Accumulate the count of even numbers using enhanced for loop
        for (int number : numbers) {
            if (number % 2 == 0) {
                count++;
            }
        }

        System.out.println("Count of even numbers: " + count);
    }
}

import java.util.Arrays;

public class Compare {
    public static void main(String[] args) {
        String[] cars = { "Volvo", "BMW", "Tesla" };
        String[] cars2 = { "Volvo", "BMW", "Tesla" };
        String[] cars3 = { "Volvo", "BMW" };
        // Returns 0 if the arrays are equal.
        System.out.println(Arrays.compare(cars, cars2));

        // Returns a positive integer if array2 is greater than array3
        // lexicographically.
        System.out.println(Arrays.compare(cars2, cars3));

        // Returns a negative integer if array2 is lesser than array 3 than array3
        // lexicographically.
        System.out.println(Arrays.compare(cars3, cars2));

    }
}

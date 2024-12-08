package Recursion;

public class SumArray {

    public static int Sum(int[] numbers, int i) {

        if (i == 0) {
            return 0;
        }

        return numbers[i - 1] + Sum(numbers, i - 1);

    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Sum(numbers, numbers.length));
    }

}

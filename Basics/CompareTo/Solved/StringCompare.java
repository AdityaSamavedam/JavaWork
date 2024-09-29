package Basics.CompareTo.Solved;

public class StringCompare {
    public static void main(String[] args) {
        String str1 = "apple";
        String str2 = "banana";
        String str3 = "Apple";
        String str4 = "apple";

        // Comparing str1 and str2
        System.out.println("Comparing 'apple' and 'banana': " + str1.compareTo(str2)); // Output: negative value

        // Comparing str1 and str3
        System.out.println("Comparing 'apple' and 'Apple': " + str1.compareTo(str3)); // Output: positive value

        // Comparing str1 and str4
        System.out.println("Comparing 'apple' and 'apple': " + str1.compareTo(str4)); // Output: 0
    }
}






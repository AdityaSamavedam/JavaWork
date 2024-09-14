package Concatenation.Solved;
public class Stringconcatenation {
    public static void main(String[] args) {
        String[] words = {"Hello", "world", "from", "Java"};
        StringBuilder concatenatedString = new StringBuilder();

        // Accumulate the concatenation of array elements using enhanced for loop
        for (String word : words) {
            concatenatedString.append(word).append(" ");
        }

        // Convert StringBuilder to String and trim the trailing space
        String result = concatenatedString.toString().trim();

        System.out.println("Concatenated string: " + result);
    }
}

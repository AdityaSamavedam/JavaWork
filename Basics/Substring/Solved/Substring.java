package Basics.Substring.Solved;

public class Substring {
    public static void main(String[] args) {
        String text = "Hello, World!";
        
        // Extracting substring starting from index 7 to the end
        String sub = text.substring(7);
        System.out.println("Substring from index 7: " + sub); // Output: "World!"

        String str = text.substring(0, 5);
        System.out.println("Substring from index 0 to 5: " + str);
    }
}

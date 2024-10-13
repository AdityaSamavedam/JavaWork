package Basics.Indexof.Solved;

public class Indexof_char {
    public static void main(String[] args) {
        String text = "Hello, World!";
        
        // Finding the index of 'W'
        int index = text.indexOf('W');
        System.out.println("Index of 'W': " + index); // Output: 7

        // Finding the index of "World"
        int wordindex = text.indexOf("World");
        System.out.println("Index of 'World': " + index); // Output: 7

        String text2 = "Hello, World! Hello, Universe!";
        
        // Finding the index of 'Hello' starting from index 10
        int specificindex = text.indexOf("Hello", 10);
        System.out.println("Index of 'Hello' after index 10: " + index); // Output: 20


    }
}

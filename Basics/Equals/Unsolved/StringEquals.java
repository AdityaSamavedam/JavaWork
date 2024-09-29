package Basics.Equals.Unsolved;

public class StringEquals {
    /*
     * The equals method in Java is used to compare two strings for equality. Unlike
     * the == operator, which checks for reference equality (whether both references
     * point to the same object), the equals method checks for value equality
     * (whether the content of the strings is the same).
     * 
     * boolean equals(Object obj);
     * Return Value:
     * Returns true if the strings are equal (i.e., they contain the same sequence
     * of characters).
     * Returns false if they are not equal.
     * Important Points
     * Case Sensitivity: The equals method is case-sensitive. For example, "Hello"
     * is not equal to "hello".
     * Null Safety: If you call equals on a null reference, it will throw a
     * NullPointerException. To avoid this, it's common to call equals on a known
     * non-null string.
     * 
     */

     public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "hello";
        String str3 = "Hello";
        String str4 = new String("hello"); // Using new keyword
        String str5 = null;
        //Compare str1 with all strings
}
}


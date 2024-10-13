package Basics.CompareTo.Unsolved;

/*
int compareTo(String anotherString);

A negative integer if the current string is lexicographically less than the specified string.
Zero if the current string is equal to the specified string.
A positive integer if the current string is lexicographically greater than the specified string.

Lexicographic Comparison
The comparison is based on the Unicode values of the characters in the strings.
The comparison is case-sensitive, meaning that uppercase letters are considered less than lowercase letters.

*/

public class StringCompare {
    public static void main(String[] args) {
        String str1 = "apple";
        String str2 = "Banana";
        String str3 = "carrot";
        System.out.println(str1.compareTo(str2));
        System.out.println(str1.compareTo(str3));
    }
}


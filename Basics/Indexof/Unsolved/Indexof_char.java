package Basics.Indexof.Unsolved;

public class Indexof_char {
    public static void main(String[] args) {
        String myStr = "Hello World!";
         //Finding the Index of a Character
        System.out.println(myStr.indexOf("W")); //returns 6
        //Finding the Index of a Substring
        System.out.println(myStr.indexOf("World!")); //returns 6
        //Finding the Index Starting from a Specific Index
        String myStr2 = "Hello World Hello Universe";
        System.out.println(myStr2.indexOf("Hello", 11)); //returns 12
    }
}

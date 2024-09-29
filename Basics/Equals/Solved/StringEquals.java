package Basics.Equals.Solved;

public class StringEquals {
        public static void main(String[] args) {
            String str1 = "hello";
            String str2 = "hello";
            String str3 = "Hello";
            String str4 = new String("hello"); // Using new keyword
    
            // Using equals method
            System.out.println("str1 equals str2: " + str1.equals(str2)); // Output: true
            System.out.println("str1 equals str3: " + str1.equals(str3)); // Output: false
            System.out.println("str1 equals str4: " + str1.equals(str4)); // Output: true
    
            // Comparing with null
            String str5 = null;
            System.out.println("str1 equals str5: " + str1.equals(str5)); // Output: false
        }
    }
    
    


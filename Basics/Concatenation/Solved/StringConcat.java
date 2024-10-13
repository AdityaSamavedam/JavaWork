package Basics.Concatenation.Solved;

public class StringConcat {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";
        // Using the + operator
        String result = str1 + ", " + str2 + "!";
        System.out.println(result); 
        // Using the concat() method
        String concatresult = str1.concat(", ").concat(str2).concat("!");
        System.out.println(concatresult); // Output: "Hello, World!"

        //using string builder
        StringBuilder sb = new StringBuilder();
        
        sb.append("Hello");
        sb.append(", ");
        sb.append("World");
        sb.append("!");
        
        String sbresult = sb.toString();
        System.out.println(sbresult); // Output: "Hello, World!"
    }
    
}

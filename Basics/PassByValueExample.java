package Basics;
 
    public class PassByValueExample {
        public static void main(String[] args) {
            int number = 5;
            modifyPrimitive(number);
            System.out.println("Original number: " + number); // Output: 5
        }
    
        public static void modifyPrimitive(int num) {
            num = 10; // This change does not affect 'number'
            System.out.println("Inside method: " + num); // Output: 10
        }
    }
    
    


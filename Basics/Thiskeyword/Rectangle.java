package Basics.Thiskeyword;

//Example for this keyword usage
    public class Rectangle {
        // Instance variables
        private int width;
        private int height;
    
        // Constructor
        public Rectangle(int width, int height) {
            // Use 'this' to distinguish between instance variables and parameters
            this.width = width;
            this.height = height;
        }
    
        // Method to calculate area
        public int calculateArea() {
            return this.width * this.height; // 'this' is optional here
        }
    
        // Method to set dimensions using 'this'
        public void setDimensions(int width, int height) {
            this.width = width;   // 'this.width' refers to the instance variable
            this.height = height; // 'this.height' refers to the instance variable
        }
    
        // Static method to create a square
        public static Rectangle createSquare(int sideLength) {
            return new Rectangle(sideLength, sideLength); // Using 'this' to call another constructor
        }
    
        public static void main(String[] args) {
            Rectangle rect = new Rectangle(5, 10);
            System.out.println("Area: " + rect.calculateArea()); // Output: Area: 50
    
            // Modifying dimensions
            rect.setDimensions(7, 14);
            System.out.println("New Area: " + rect.calculateArea()); // Output: New Area: 98
    
            // Creating a square using the static method
            Rectangle square = Rectangle.createSquare(4);
            System.out.println("Square Area: " + square.calculateArea()); // Output: Square Area: 16
        }
    }
    
    


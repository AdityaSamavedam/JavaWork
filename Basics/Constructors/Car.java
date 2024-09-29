package Basics.Constructors;

//Example of Constructor class and types of construtors
    public class Car {
        // Attributes
        String color;
        String model;
        int year;
    
        // Default constructor
        public Car() {
            color = "Unknown";
            model = "Unknown";
            year = 0;
        }
    
        // Parameterized constructor
        public Car(String color, String model, int year) {
            this.color = color;
            this.model = model;
            this.year = year;
        }
    
        // Method to display car details
        public void displayInfo() {
            System.out.println("Car Model: " + model + ", Color: " + color + ", Year: " + year);
        }
    
        public static void main(String[] args) {
            // Creating an object using the default constructor
            Car car1 = new Car();
            car1.displayInfo(); // Output: Car Model: Unknown, Color: Unknown, Year: 0
    
            // Creating an object using the parameterized constructor
            Car car2 = new Car("Red", "Toyota", 2020);
            car2.displayInfo(); // Output: Car Model: Toyota, Color: Red, Year: 2020
        }
    }
    
    


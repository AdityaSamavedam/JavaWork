package Basics.Constructors.Solved;

public class ImmutablePoint {
    private final int x; // Final attribute
    private final int y; // Final attribute

    // Constructor to initialize x and y
    public ImmutablePoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Getters for x and y
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    // Main method to demonstrate immutability
    public static void main(String[] args) {
        ImmutablePoint point = new ImmutablePoint(5, 10);
        
        // Print the initial values
        System.out.println("Initial point: (" + point.getX() + ", " + point.getY() + ")");
        
        // Attempting to change the values (this won't compile)
        // point.x = 15; // Error: cannot assign a value to final variable x
        // point.y = 20; // Error: cannot assign a value to final variable y
        
        // Show that values cannot be changed
        System.out.println("Attempted to change point values.");
        System.out.println("Current point: (" + point.getX() + ", " + point.getY() + ")");
    }
}


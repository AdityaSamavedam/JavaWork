package Inheritancenpolymorphism.Inheritance.Solved;

// Superclass
public class Shape {
    // Method to calculate area, to be overridden by subclasses
    public double area() {
        return 0; // Default implementation (could also be abstract)
    }
}

// Subclass for Circle
class Circle extends Shape {
    private double radius;

    // Constructor for Circle
    public Circle(double radius) {
        this.radius = radius;
    }

    // Implement area method
    @Override
    public double area() {
        return Math.PI * radius * radius; // Area = πr²
    }

}

// Subclass for Rectangle
class Rectangle extends Shape {
    private double width;
    private double height;

    // Constructor for Rectangle
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // Implement area method
    @Override
    public double area() {
        return width * height; // Area = width * height
    }
}

// In the printf version, the area will be displayed with exactly two decimal
// places. In contrast, the println version will display the full precision of
// the floating-point number, which might result in more digits than desired.

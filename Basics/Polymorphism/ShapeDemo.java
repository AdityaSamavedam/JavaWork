package Basics.Polymorphism;

import java.util.ArrayList;
import java.util.List;

// Abstract Shape class with a draw method
class Shape {
     void draw(){
        System.out.println("Drawing a shape");
    };
}

// Circle class that extends Shape
class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a Circle");
    }
}

// Rectangle class that extends Shape
class Rectangle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a Rectangle");
    }
}

// Triangle class that extends Shape
class Triangle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a Triangle");
    }
}

// Main class to demonstrate polymorphism
public class ShapeDemo {
    public static void main(String[] args) {
        // Creating a list of Shape objects
        List<Shape> shapes = new ArrayList<>();

        // Adding different Shape objects to the list
        shapes.add(new Circle());
        shapes.add(new Rectangle());
        shapes.add(new Triangle());

        // Iterating through the list and calling the draw method for each shape
        for (Shape shape : shapes) {
            shape.draw();
        }
    }
}


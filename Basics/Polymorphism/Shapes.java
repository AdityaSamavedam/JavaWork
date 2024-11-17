package Basics.Polymorphism;
import java.util.ArrayList;


public class Shapes {
    public void draw() {
        System.out.println("Drawing a shape");
    }
}

public class Circle extends Shapes{
    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }
}

public class Rectangle extends Shapes{
    @Override
    public void draw() {
        System.out.println("Drawing a rectangle");
    }
}

public class Triangle extends Shapes{
    @Override
    public void draw() {
        System.out.println("Drawing a triangle");
    }
}

public class ShapeRun {
    public static void main(String[] args) {
        List<Shapes> myShapes = new ArrayList<>();
        myShapes.add(new Circle());
        myShapes.add(new Rectangle());
        myShapes.add(new Triangle());
        for (Shapes eachShape : myShapes) {
            eachShape.draw();
        }
    }
}
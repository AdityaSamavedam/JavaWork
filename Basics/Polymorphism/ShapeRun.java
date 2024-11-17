package Basics.Polymorphism;


class Shapes {
    public void draw() {
        System.out.println("Drawing a shape");
    }
}

class Circle extends Shapes{
    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }
}

class Rectangle extends Shapes{
    @Override
    public void draw() {
        System.out.println("Drawing a rectangle");
    }
}

class Triangle extends Shapes{
    @Override
    public void draw() {
        System.out.println("Drawing a triangle");
    }
}

// public class ShapeRun {
//     public static void main(String[] args) {
//         ArrayList<Shapes> myShapes = new ArrayList<>();
//         myShapes.add(new Circle());
//         myShapes.add(new Rectangle());
//         myShapes.add(new Triangle());
//         for (Shapes eachShape : myShapes) {
//             eachShape.draw();
//         }
//     }
// }
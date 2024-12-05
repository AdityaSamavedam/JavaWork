package Inheritancenpolymorphism.Polymorphism;

public class Calculator {

    // Method to add two integers
    public int add(int a, int b) {
        System.out.println("Adding two integers:");
        return a + b;
    }

    // Method to add three integers
    public int add(int a, int b, int c) {
        System.out.println("Adding three integers:");
        return a + b + c;
    }

    // Method to add two double values
    public double add(double a, double b) {
        System.out.println("Adding two doubles:");
        return a + b;
    }

    // Method to add an integer and a double
    public double add(int a, double b) {
        System.out.println("Adding an integer and a double:");
        return a + b;
    }

    // Method to add a double and an integer
    public double add(double a, int b) {
        System.out.println("Adding a double and an integer:");
        return a + b;
    }

    
}


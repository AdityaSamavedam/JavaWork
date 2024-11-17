package Basics.Polymorphism;

public class Calculator {
    public int addNumbers(int a, int b) {
        return a + b;
    }

    public int addNumbers(int a, int b, int c) {
        return a + b + c;
    }

    public double addNumbers(int a, double b) {
        return a + b;
    }

    public double addNumbers(double a, int b) {
        return a + b;
    }

    public double addNumbers(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.addNumbers(1,2, 3));
    }
}

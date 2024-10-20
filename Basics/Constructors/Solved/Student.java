package Basics.Constructors.Solved;

public class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;

        if (this.age < 0) {
            throw new IllegalArgumentException("Age cannot be negative.");
        }
    }

    public static void main(String[] args) {
        try {
            Student aditya = new Student("Aditya", 16);
            Student jason = new Student("Jason", -16);
            System.out.println(aditya);
            System.out.println(jason);
        }
        catch(IllegalArgumentException e) {
        System.err.println(e.getMessage());
        }

    }
}

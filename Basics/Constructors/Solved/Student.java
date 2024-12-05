package Basics.Constructors.Solved;

public class Student {
    private String name;
    private int age;

    // Constructor to initialize name and age
    public Student(String name, int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative.");
        }
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    // Main method to test the Student class
    public static void main(String[] args) {
        try {
            Student student1 = new Student("Alice", 20);
            System.out.println(student1);
            
            // This will throw an exception
            Student student2 = new Student("Bob", -5);
            System.out.println(student2);
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}


package Inheritancenpolymorphism.Inheritance.Solved;

// Superclass
public class Person {
    private String name;
    private int age;

    // Constructor for Person
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getters for name and age
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Method to display person information
    public String getInfo() {
        return "Name: " + name + ", Age: " + age;
    }
}

// Subclass
class Student extends Person {
    private String major;

    // Constructor for Student
    public Student(String name, int age, String major) {
        super(name, age); // Call to Person constructor
        this.major = major;
    }

    // Getter for major
    public String getMajor() {
        return major;
    }

    // Method to display student information
    @Override
    public String getInfo() {
        return super.getInfo() + ", Major: " + major;
    }
}




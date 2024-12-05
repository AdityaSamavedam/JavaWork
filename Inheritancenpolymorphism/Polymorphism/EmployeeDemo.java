package Inheritancenpolymorphism.Polymorphism;

// Base Employee class
abstract class Employee {
    protected String name;
    protected double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    // Abstract method to display employee details
    abstract void displayDetails();
}

// Manager subclass with a specific attribute and constructor
class Manager extends Employee {
    private int teamSize;

    public Manager(String name, double salary, int teamSize) {
        super(name, salary);
        this.teamSize = teamSize;
    }

    @Override
    void displayDetails() {
        System.out.println("Manager Name: " + name);
        System.out.println("Salary: $" + salary);
        System.out.println("Team Size: " + teamSize);
    }
}

// Developer subclass with a specific attribute and constructor
class Developer extends Employee {
    private String programmingLanguage;

    public Developer(String name, double salary, String programmingLanguage) {
        super(name, salary);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    void displayDetails() {
        System.out.println("Developer Name: " + name);
        System.out.println("Salary: $" + salary);
        System.out.println("Programming Language: " + programmingLanguage);
    }
}

// Main class to demonstrate polymorphism
public class EmployeeDemo {
    public static void main(String[] args) {
        // Creating Employee references for Manager and Developer objects
        Employee manager = new Manager("Alice", 90000, 5);
        Employee developer = new Developer("Bob", 75000, "Java");

        // Using polymorphism to call subclass-specific displayDetails methods
        manager.displayDetails();
        System.out.println();
        developer.displayDetails();
    }
}


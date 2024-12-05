package Recursion.Solved;

abstract class Employee {
    protected String name;
    protected int salary;
    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    abstract void displayDetails();
}

class Manager extends Employee {
    protected int managementSize;
    
        public Manager(String name, int salary, int managementSize) {
            super(name, salary);
            this.managementSize = managementSize;
    }

    @Override
    void displayDetails() {
        System.out.println("Name: " + name + ", Salary: " + salary + ", Management Size: " + managementSize);
    }
}

class Developer extends Employee {
    protected String language;
    
        public Developer(String name, int salary, String language) {
            super(name, salary);
            this.language = language;
    }

    @Override
    void displayDetails() {
        System.out.println("Name: " + name + ", Salary: " + salary + ", Language: " + language);
    }
}

public class EmployeeTest {
    public static void main(String[] args) {
        Employee manager = new Manager("Jason", 10000, 5);
        Employee developer = new Developer("Jack", 13000, "Java");
        manager.displayDetails();
        developer.displayDetails();
    }
}
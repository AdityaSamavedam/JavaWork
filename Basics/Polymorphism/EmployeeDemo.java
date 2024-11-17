package Basics.Polymorphism;

class Employee {

    public String name;
    public double salary;

    public Employee(String name) {
        this.name = name;
    }

    double calculateSalary() {
        return salary;
    }
}

class FullTimeEmployee extends Employee {

    private double salary;
    public FullTimeEmployee(String name, double salary) {
        super(name);
        this.salary = salary;
    }

    @Override
    double calculateSalary() {
        return salary;
    }
}

class PartTimeEmployee extends Employee {

    private double hourlyRate;
    private int hours;

    public PartTimeEmployee(String name, int hourlyRate, int hours) {
        super(name);
        this.hourlyRate = hourlyRate;
        this.hours = hours;
    }

    @Override
    double calculateSalary() {
        return hourlyRate * hours;
    }
}

public class EmployeeDemo {
    public static void main(String[] args) {
        Employee[] employees = new Employee[2];
        employees[0] = new FullTimeEmployee("John", 10000.0);
        employees[1] = new PartTimeEmployee("Alex", 60, 200);
        
        for (Employee emp : employees) {
            System.out.println(emp.name);
            System.out.println(emp.calculateSalary());
        }
    }
}
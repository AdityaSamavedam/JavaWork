package Basics.Polymorphism;

// Base class Employee with an abstract calculateSalary method
class Employee {
    protected String name;
    double salary;
    
    public Employee(String name) {
        this.name = name;
    }

    double calculateSalary(){
        return salary;
    }
}

// FullTimeEmployee subclass that implements calculateSalary
class FullTimeEmployee extends Employee {
    private double monthlySalary;

    public FullTimeEmployee(String name, double monthlySalary) {
        super(name);
        this.monthlySalary = monthlySalary;
    }

    @Override
    double calculateSalary() {
        return monthlySalary;
    }
}

// PartTimeEmployee subclass that implements calculateSalary
class PartTimeEmployee extends Employee {
    private double hourlyRate;
    private int hoursWorked;

    public PartTimeEmployee(String name, double hourlyRate, int hoursWorked) {
        super(name);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    double calculateSalary() {
        return hourlyRate * hoursWorked;
    }
}

// Main class to demonstrate polymorphism
public class EmployeeArraysDemo {
    public static void main(String[] args) {
        // Creating an array of Employee references
        Employee[] employees = new Employee[2];

        // Adding FullTimeEmployee and PartTimeEmployee to the array
        employees[0] = new FullTimeEmployee("Alice", 5000.0);
        employees[1] = new PartTimeEmployee("Bob", 20.0, 120);

        // Using polymorphism to call calculateSalary on each Employee
        for (Employee employee : employees) {
            System.out.println("Employee: " + employee.name + ", Salary: $" + employee.calculateSalary());
        }
    }
}

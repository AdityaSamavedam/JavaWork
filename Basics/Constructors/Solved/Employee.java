package Basics.Constructors.Solved;

public class Employee {
    private String name;
    private int id;
    private String department;

    // Constructor that takes all three parameters
    public Employee(String name, int id, String department) {
        this.name = name;
        this.id = id;
        this.department = department;
    }

    // Constructor that takes only name and id, using constructor chaining
    public Employee(String name, int id) {
        this(name, id, "Unknown"); // Default department is "Unknown"
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", department='" + department + '\'' +
                '}';
    }

    // Main method to test both constructors
    public static void main(String[] args) {
        Employee emp1 = new Employee("Alice Johnson", 101, "Engineering");
        Employee emp2 = new Employee("Bob Smith", 102); // Default department

        System.out.println(emp1);// Calls emp1.toString() implicitly
        System.out.println(emp2);
    }
}

// The toString method is overridden to provide a string representation of the
// Employee object, making it easy to print out the employee details.

// the println method internally calls the toString method of the Employee
// object emp1

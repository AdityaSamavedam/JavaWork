package Basics.Constructors.Solved;

public class Employee {
    private String name;
    private int id;
    private String department;

    public Employee(String name, int id, String department) {
        this.name = name;
        this.id = id;
        this.department = department;
    }

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee("Alex", 012432, "Tech");
    }
}

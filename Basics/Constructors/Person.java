package Basics.Constructors;

//OverloadedConstructors
public class Person {
    String name;
    int age;
    String address;

    // Constructor 1: No arguments
    public Person() {
        this.name = "Unknown";
        this.age = 0;
        this.address = "Not available";
    }

    // Constructor 2: One argument (name)
    public Person(String name) {
        this.name = name;
        this.age = 0;
        this.address = "Not available";
    }

    // Constructor 3: Two arguments (name and age)
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.address = "Not available";
    }

    // Constructor 4: Three arguments (name, age, and address)
    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    // Display method to print person details
    public void display() {
        System.out.println("Name: " + name + ", Age: " + age + ", Address: " + address);
    }

    public static void main(String[] args) {
        // Using different overloaded constructors
        Person person1 = new Person(); // Default constructor
        Person person2 = new Person("Alice"); // Constructor with one parameter
        Person person3 = new Person("Bob", 25); // Constructor with two parameters
        Person person4 = new Person("Charlie", 30, "NY"); // Constructor with three parameters

        // Displaying person details
        person1.display();
        person2.display();
        person3.display();
        person4.display();
    }
}

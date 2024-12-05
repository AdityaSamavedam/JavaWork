package Basics.Accessor_Mutator.Solved;

//Accessor & Mutator Methods

public class Person {
    // Private attributes
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Accessor method for name
    public String getName() {
        return name;
    }

    // Accessor method for age
    public int getAge() {
        return age;
    }

    // Mutator method for name
    public void setName(String name) {
        this.name = name;
    }

    // Mutator method for age
    public void setAge(int age) {
        if (age >= 0) { // Validation to ensure age is not negative
            this.age = age;
        } else {
            System.out.println("Age cannot be negative.");
        }
    }

    public static void main(String[] args) {
        // Creating a new Person object
        Person person = new Person("Alice", 30);

        // Using accessor methods
        System.out.println("Name: " + person.getName()); // Output: Name: Alice
        System.out.println("Age: " + person.getAge());   // Output: Age: 30

        // Using mutator methods
        person.setName("Bob");
        person.setAge(25);
        System.out.println("Updated Name: " + person.getName()); // Output: Updated Name: Bob
        System.out.println("Updated Age: " + person.getAge());   // Output: Updated Age: 25

        // Attempting to set an invalid age
        person.setAge(-5); // Output: Age cannot be negative.
    }
}


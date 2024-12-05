package Basics.Inheritance.Solved;

// Superclass
class Animal {
    private String name;
    private int age;

    // Constructor for Animal
    public Animal(String name, int age) {
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

    // Method to display animal info
    public String getInfo() {
        return "Name: " + name + ", Age: " + age;
    }
}

// Subclass
class Dog extends Animal {
    private String breed;

    // Constructor for Dog
    public Dog(String name, int age, String breed) {
        super(name, age); // Call to Animal constructor
        this.breed = breed;
    }

    // Getter for breed
    public String getBreed() {
        return breed;
    }

    // Method to display dog info
    @Override
    public String getInfo() {
        return super.getInfo() + ", Breed: " + breed;
    }
}

// Main class to test the classes
public class Main {
    public static void main(String[] args) {
        // Create an instance of Dog
        Dog myDog = new Dog("Buddy", 3, "Golden Retriever");

        // Display the dog's attributes
       System.out.println(myDog.getInfo()); 

        //Shape.java
        Shape circle = new Circle(5.0); // Create a Circle with radius 5.0
        Shape rectangle = new Rectangle(4.0, 6.0); // Create a Rectangle with width 4.0 and height 6.0

        // Print the area of each shape
        System.out.printf("Area of the circle: %.2f%n", circle.area());
        System.out.printf("Area of the rectangle: %.2f%n", rectangle.area());

        //SuperVehicle.java
        // Create instances of Car and Truck
        EvCar myCar= new EvCar("Tesla","X",2020,4);
        Truck myTruck = new Truck("Ford", "F-150", 2019, 1.5);

        // Display vehicle information
        System.out.println("Car Info: " + myCar.getVehicleInfo());
        System.out.println("Truck Info: " + myTruck.getVehicleInfo());

        //Person.java
         // Create instances of Person and Student
         Person person = new Person("Alice", 30);
         Student student = new Student("Bob", 20, "Computer Science");
 
         // Display information
         System.out.println("Person Info: " + person.getInfo());
         System.out.println("Student Info: " + student.getInfo());

         //Bird.java
         // Create an array of Bird references
        Bird[] birds = new Bird[2];
        birds[0] = new Sparrow(); // Assign a Sparrow
        birds[1] = new Eagle();   // Assign an Eagle

        // Demonstrate dynamic method dispatch
        for (Bird bird : birds) {
            bird.makeSound(); // Calls the appropriate makeSound() method
        }

         
    }
}


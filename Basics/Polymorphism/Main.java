package Basics.Polymorphism;

class Main {
    public static void main(String[] args) {
        Animal myAnimal = new Animal(); // Create a Animal object
        Animal myPig = new Pig(); // Create a Pig object
        Animal myDog = new Dog(); // Create a Dog object
        myAnimal.animalSound();
        myPig.animalSound();
        myDog.animalSound();
        // Polymorphic arguments and return types
        Dog d = new Dog();
        Pig p = new Pig();
        myAnimal.giveshot(d);// dog's makenoise runs
        myAnimal.giveshot(p);// pigs makenoise runs
        
        // The giveShot() method can take any
        // Animal you give it. As long as the object
        // you pass in as the argument is a subclass of
        // Animal, it will work

        //Calculator.java
        Calculator calculator = new Calculator();

        // Testing add methods with various parameter types
        System.out.println(calculator.add(5, 10));             // Adding two integers
        System.out.println(calculator.add(5, 10, 15));         // Adding three integers
        System.out.println(calculator.add(5.5, 10.5));         // Adding two doubles
        System.out.println(calculator.add(5, 10.5));           // Adding an integer and a double
        System.out.println(calculator.add(5.5, 10));           // Adding a double and an integer

    }
}

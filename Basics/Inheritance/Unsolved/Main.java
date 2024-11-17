package Basics.Inheritance.Unsolved;

class Animal {
    private String name;
    private int age;
    
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getInfo() {
        return "Name is: " + name + ", age is: " + age;
    }
}

class Dog extends Animal {
    private String breed;
    
    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + ", breed: " + breed;
    }
}

public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog("Coco", 2, "Labrador");
        System.out.println(myDog.getInfo());

        Shape myCircle = new Circle(5);
        System.out.printf("%.2f%n", myCircle.getArea());

        Shape myRectangle = new Rectangle(5, 6);
        System.out.println(myRectangle.getArea());
    }
}
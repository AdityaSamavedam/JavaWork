package Basics.Inheritance.Solved;

public class Bird {
    // Superclass
    public void makeSound()
    {
       System.out.println("Bird makes various sounds");
    }
}

// Subclass for Sparrow
class Sparrow extends Bird {
    @Override
    public void makeSound() {
        System.out.println("Sparrow: Chirp Chirp!");
    }
}

// Subclass for Eagle
class Eagle extends Bird {
    @Override
    public void makeSound() {
        System.out.println("Eagle: Screech!");
    }
}




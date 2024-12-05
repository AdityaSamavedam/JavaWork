package Basics.Polymorphism;

import java.util.ArrayList;
import java.util.List;

// Base Device class
class Device {
    void turnOn() {
        System.out.println("Turning on the device");
    }
}

// Laptop subclass with a specific method
class Laptop extends Device {
    @Override
    void turnOn() {
        System.out.println("Turning on the Laptop");
    }

    void openLaptop() {
        System.out.println("Opening the Laptop");
    }
}

// Phone subclass with a specific method
class Phone extends Device {
    @Override
    void turnOn() {
        System.out.println("Turning on the Phone");
    }

    void makeCall() {
        System.out.println("Making a call from the Phone");
    }
}

// Main class to demonstrate downcasting
public class DeviceDemo {
    public static void main(String[] args) {
        // Creating a list of Device objects
        List<Device> devices = new ArrayList<>();
        devices.add(new Laptop());
        devices.add(new Phone());

        // Iterating through the list and using downcasting to call subclass-specific
        // methods
        for (Device device : devices) {
            device.turnOn(); // Calls the overridden method in each subclass

            if (device instanceof Laptop) {
                Laptop laptop = (Laptop) device; // Downcasting to Laptop
                laptop.openLaptop(); // Calls Laptop-specific method
            } else if (device instanceof Phone) {
                Phone phone = (Phone) device; // Downcasting to Phone
                phone.makeCall(); // Calls Phone-specific method
            }
        }
    }
}

// instanceof is a keyword used to test whether an object is an instance of a
// particular class or subclass. It’s a type-checking operator that returns true
// if the object is an instance of the specified type (class, subclass, or
// interface); otherwise, it returns false
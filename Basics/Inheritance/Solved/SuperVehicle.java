package Basics.Inheritance.Solved;

// Superclass
public class SuperVehicle {
    private String make;
    private String model;
    private int year;

    // Constructor for Vehicle
    public SuperVehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    // Getters for Vehicle attributes
    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    // Method to display vehicle information
    public String getVehicleInfo() {
        return year + " " + make + " " + model;
    }
}

// Subclass for Car
class EvCar extends SuperVehicle {
    private int numberOfDoors;

    // Constructor for Car with constructor chaining
    public EvCar(String make, String model, int year, int numberOfDoors) {
        super(make, model, year); // Call to Vehicle constructor
        this.numberOfDoors = numberOfDoors;
    }

    // Getter for numberOfDoors
    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    // Method to display car information
    @Override
    public String getVehicleInfo() {
        return super.getVehicleInfo() + ", Doors: " + numberOfDoors;
    }
}

// Subclass for Truck
class Truck extends SuperVehicle {
    private double payloadCapacity;

    // Constructor for Truck with constructor chaining
    public Truck(String make, String model, int year, double payloadCapacity) {
        super(make, model, year); // Call to Vehicle constructor
        this.payloadCapacity = payloadCapacity;
    }

    // Getter for payloadCapacity
    public double getPayloadCapacity() {
        return payloadCapacity;
    }

    // Method to display truck information
    @Override
    public String getVehicleInfo() {
        return super.getVehicleInfo() + ", Payload Capacity: " + payloadCapacity + " tons";
    }
}




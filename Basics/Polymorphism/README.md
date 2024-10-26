## Define a class Employee with a method calculateSalary(). Create subclasses FullTimeEmployee and PartTimeEmployee, each implementing their own salary calculation. Write a main method that demonstrates polymorphism by calling calculateSalary() on an array of Employee references

## Method Overloading and Overriding Basics
Write a program demonstrating method overloading in Java. Create a Calculator class with methods for addition that take different parameter types (e.g., int, double).

Write a program that shows method overriding. Create a base class Animal with a makeSound method, and subclasses like Dog and Cat that override makeSound.

## Polymorphism in Collections
Write a program that creates a list of Shape objects (e.g., Circle, Rectangle, and Triangle). Use a loop to iterate through the list and call the draw method for each shape.

Demonstrate polymorphism by creating a list of Animal objects (e.g., Dog, Cat, Bird). Iterate over the list and call each animal's makeSound method.

## Polymorphism with Type Casting
Create a class hierarchy with a base class Device and subclasses Laptop and Phone. Write a program that demonstrates downcasting to call subclass-specific methods.

## Real-World Scenario: Banking System

Design a payment processing system with a base class PaymentMethod and subclasses like CreditCard, DebitCard, and PayPal. Write a method that processes payments using any payment method (polymorphic behavior).

### Advanced Questions

## Runtime Polymorphism with Constructors
Create a class Employee with subclasses Manager and Developer. Demonstrate polymorphism by creating Employee references for Manager and Developer objects, initializing them with constructor parameters that are specific to each subclass.

## Factory Pattern using Polymorphism
Implement a factory class ShapeFactory that returns an instance of a Shape (e.g., Circle, Square) based on a parameter. Use polymorphism to call draw on the object returned from the factory.

## Polymorphic Behavior in Exception Handling
Write a program with a superclass BaseException and subclasses FileNotFoundException and IOException. Demonstrate polymorphism by handling different types of exceptions in a single catch block.

package Basics.Polymorphism;

// Base class for PaymentMethod
 class PaymentMethod {
    void processPayment(double amount){
        System.out.println(amount);
    }
}

// CreditCard subclass that overrides processPayment
class CreditCard extends PaymentMethod {
    @Override
    void processPayment(double amount) {
        System.out.println("Processing credit card payment of $" + amount);
        // Add specific logic for credit card payment processing here
    }
}

// DebitCard subclass that overrides processPayment
class DebitCard extends PaymentMethod {
    @Override
    void processPayment(double amount) {
        System.out.println("Processing debit card payment of $" + amount);
        // Add specific logic for debit card payment processing here
    }
}

// PayPal subclass that overrides processPayment
class PayPal extends PaymentMethod {
    @Override
    void processPayment(double amount) {
        System.out.println("Processing PayPal payment of $" + amount);
        // Add specific logic for PayPal payment processing here
    }
}

// PaymentProcessor class to process any PaymentMethod polymorphically
class PaymentProcessor {
    // Method to process payments using any payment method
    public void process(PaymentMethod paymentMethod, double amount) {
        paymentMethod.processPayment(amount); // Polymorphic behavior
    }
}

// Main class to demonstrate the payment processing system
public class PaymentDemo {
    public static void main(String[] args) {
        PaymentProcessor processor = new PaymentProcessor();

        // Creating instances of different PaymentMethod subclasses
        PaymentMethod creditCard = new CreditCard();
        PaymentMethod debitCard = new DebitCard();
        PaymentMethod paypal = new PayPal();

        // Processing payments with different payment methods
        processor.process(creditCard, 150.0);   // Processing credit card payment
        processor.process(debitCard, 75.5);     // Processing debit card payment
        processor.process(paypal, 200.0);       // Processing PayPal payment
    }
}


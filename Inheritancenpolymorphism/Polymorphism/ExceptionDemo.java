package Inheritancenpolymorphism.Polymorphism;

// BaseException superclass for custom exceptions
class BaseException extends Exception {
    public BaseException(String message) {
        super(message);
    }
}

// FileNotFoundException subclass of BaseException
class FileNotFoundException extends BaseException {
    public FileNotFoundException(String message) {
        super(message);
    }
}

// IOException subclass of BaseException
class IOException extends BaseException {
    public IOException(String message) {
        super(message);
    }
}

// Main class to demonstrate exception handling
public class ExceptionDemo {
    public static void main(String[] args) {
        try {
            // Simulate a situation where an exception is thrown
            performOperation("fileNotFound");

            // Another operation that may throw a different exception
            performOperation("ioException");
        } catch (BaseException e) { // Polymorphic handling of BaseException and its subclasses
            System.out.println("Exception caught: " + e.getMessage());
        }
    }

    // Method that throws different exceptions based on input
    public static void performOperation(String operationType) throws BaseException {
        switch (operationType) {
            case "fileNotFound":
                throw new FileNotFoundException("File not found during operation.");
            case "ioException":
                throw new IOException("Input/Output error occurred.");
            default:
                System.out.println("Operation completed successfully.");
        }
    }
}

package Basics.Constructors.Solved;

public class Counter {
    // Static variable to keep track of the number of instances
    private static int instanceCount = 0;

    // Constructor increments the instance count
    public Counter() {
        instanceCount++;
    }

    // Static method to get the current instance countcd IJava/
    public static int getInstanceCount() {
        return instanceCount;
    }

    // Main method to test the Counter class
    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();

        // Print the number of instances created
        System.out.println("Number of Counter instances created: " + Counter.getInstanceCount());
    }
}

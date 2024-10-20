package Basics.Constructors.Solved;

public class Counter {
    private static int count = 0;

    public Counter() {
        count++;
    }

    public int getCount() {
        return count;
    }

    public static void main(String[] args) {
        Counter counter1 = new Counter();
        System.out.println("The count is: " + counter1.getCount());
        Counter counter2 = new Counter();
        System.out.println("The count is: " + counter2.getCount());
        Counter counter3 = new Counter();
        System.out.println("The count is: " + counter3.getCount());
    }
}

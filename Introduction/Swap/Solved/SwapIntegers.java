package Introduction.Swap.Solved;

public class SwapIntegers {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        
        // Output before swap
        System.out.println("Before swap: a = " + a + ", b = " + b);
        
        // Swapping using a temporary variable
        int temp = a;
        a = b;
        b = temp;
        
        // Output after swap
        System.out.println("After swap: a = " + a + ", b = " + b);
}
}
package Recursion;

public class Exp {

    public static double Exponent(int base, int power) {
        if (power <= 0) {
            return 1;
        }
        return base * Exponent(base, power - 1);
    }
    public static void main(String[] args) {
        System.out.println(Exponent(2, 5));
    }   
}
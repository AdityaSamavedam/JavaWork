package ArrayList.AccumulateAlgorithm.Solved;

import java.util.ArrayList;
public class Accumulate {
    public static void main(String[] args) {
   
                // Create an ArrayList and add some integers
                ArrayList<Integer> numbers = new ArrayList<>();
                numbers.add(10);
                numbers.add(20);
                numbers.add(30);
                numbers.add(40);
                numbers.add(50);
        
                // Variable to hold the accumulated sum
                int sum = 0;
        
                // Accumulate the elements using a for-each loop
                for (int number : numbers) {
                    sum += number;
                }
        
                // Print the accumulated sum
                System.out.println("The accumulated sum of the elements in the ArrayList is: " + sum);
            }
        }
        


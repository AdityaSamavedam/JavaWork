package ArrayList.FindHighest.Solved;

import java.util.ArrayList;

public class FindHighest {
     public static void main(String[] args) {
        // Create an ArrayList and add some scores
        ArrayList<Integer> scores = new ArrayList<>();
        scores.add(85);
        scores.add(92);
        scores.add(78);
        scores.add(90);
        scores.add(88);

        // Initialize a variable to hold the highest score
        int highestScore = scores.get(0); // Assume the first score is the highest initially

        // Iterate through the ArrayList to find the highest score
        for (int score : scores) {
            if (score > highestScore) {
                highestScore = score; // Update highestScore if the current score is greater
            }
        }

        // Print the highest score
        System.out.println("The highest score is: " + highestScore);
    }
}

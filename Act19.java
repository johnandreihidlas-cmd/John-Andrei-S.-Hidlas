import java.util.Arrays;

public class Act19 {
    public static void main(String[] args) {
        // Store the scores and the number to search for
        int[] scores = {83, 67, 76, 90, 85};
        int target = 67;
        boolean found = false;

        // Search for the target score
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] == target) {
                System.out.println("Found at index: " + i);
                found = true;
            }
        }

        if (!found) {
            System.out.println("Not found");
        }

        // Sort a copy so the original array stays unchanged
        int[] sorted = scores.clone();
        Arrays.sort(sorted);

        // Display both arrays
        System.out.println("Original: " + Arrays.toString(scores));
        System.out.println("Sorted: " + Arrays.toString(sorted));
    }

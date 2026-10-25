public class Act18 {
    public static void main(String[] args) {
        // Store the scores in an array
        int[] scores = {83, 91, 78, 92, 88, 80,90,87};

        int sum = 0;
        int highest = scores[0];
        int lowest = scores[0];

        // Calculate the sum and find the highest and lowest scores
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];

            if (scores[i] > highest) {
                highest = scores[i];
            }

            if (scores[i] < lowest) {
                lowest = scores[i];
            }
        }

        // Calculate and display the statistics
        double average = (double) sum / scores.length;

        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
        System.out.println("Highest: " + highest);
        System.out.println("Lowest: " + lowest);
    }

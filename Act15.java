public class Act15 {
    public static void main(String[] args) {
        for (int row = 1; row <= 5; row++) {
            for (int col = 1; col <= row; col++) {
                if (row == 4 && col == 3) {
                    break;
                     // Stops the inner loop at row 4, column 3.
                }

                if (row == 2 && col == 1) {
                    continue; 
                    // Skips row 2, column 1.
                }

                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
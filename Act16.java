import java.util.Scanner;

public class Act16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] stock = {{5, 2}, {-1, 8}, {1, 4}};
        int total = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                int n = stock[i][j];

                if (n == -1) continue;
                total += n;

                if (n < 3) {
                    System.out.println("Low stock: " + n);
                    break;
                }
            }
        }

        System.out.println("Total stock: " + total);

        int choice;
        do {
            System.out.print("Enter 0 to exit: ");
            choice = sc.nextInt();
        } while (choice != 0);

        System.out.println("Goodbye!");
        sc.close();
    }

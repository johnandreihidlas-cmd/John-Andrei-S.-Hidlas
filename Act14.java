import java.util.Scanner;

public class Act14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = 1;
        int sum = 0;

        while (number != 0) {
            System.out.print("Enter a number (0 to stop): ");
            number = input.nextInt();

            if (number != -1) {
                sum += number;
            }
        }

        System.out.println("Total: " + sum);
        input.close();
    }
}
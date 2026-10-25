public class Act8 {
    public static void main(String[] args) {
        int a = 5;
        int b = 2;

        // Prediction: true
        System.out.println("Expression 1: " + (a + b * 3 > 10));

        int count = 4;

        // Prediction: false
        System.out.println("Expression 2: " + (count++ + 2 * 3 == 10));
        // The actual result is true because multiplication happens first, and count++ uses the old value before increasing it.

        int score = 80;
        int absences = 4;

        // Prediction: true
        System.out.println("Expression 3: " + (score >= 75 && absences <= 3 || score >= 90));
        // The actual result is false because && is evaluated before ||, and both parts of the final OR expression are false.
    }
}
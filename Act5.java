public class Act5 {
    public static void main(String[] args) {

        int num1 = 17;
        int num2 = -8;

        System.out.println("Addition: " + (num1 + num2));
        System.out.println("Subtraction: " + (num1 - num2));
        System.out.println("Multiplication: " + (num1 * num2));
        System.out.println("Division: " + (num1 / num2));

        // Division and modulus behave differently with negative numbers
        System.out.println("Modulus: " + (num1 % num2));
    }
}
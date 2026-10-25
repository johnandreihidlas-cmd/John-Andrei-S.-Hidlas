public class Act7 {
    public static void main(String[] args) {
        double balance = 100;

        balance += 20;
        System.out.println("After adding 200: " + balance);

        balance *= 1.10;
        System.out.println("After 10% growth: " + balance);

        balance += 10;
        System.out.println("After adding 100: " + balance);

        int count = 5;

        System.out.println("Postfix: " + count++);
        System.out.println("Count after postfix: " + count);

        System.out.println("Prefix: " + ++count);
        System.out.println("Count after prefix: " + count);
        // Postfix prints the old value before increasing it, while prefix increases the value before printing it.
    }
}
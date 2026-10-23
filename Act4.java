
public class Act4 {
    public static void main(String[] args) {

        byte num = 127;
        num++;

        System.out.println("Overflow: " + num);

        String a = new String("Hello");
        String b = new String("Hello");
        String c = "Hello";

        // False because a and b are different objects
        System.out.println(a == b);

        // True because a and b have the same text
        System.out.println(a.equals(b));

        // False because a and c are different objects
        System.out.println(a == c);

        int[] x = {10, 20};
        int[] y = x;

        y[0] = 50;

        System.out.println("Array x: " + x[0]);
        System.out.println("Array y: " + y[0]);
    }
}
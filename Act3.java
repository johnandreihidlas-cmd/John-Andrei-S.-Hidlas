public class Act3 {
    public static void main(String[] args) {

        double cm = 427;

        int meters = (int)(cm / 100);
        double remaining = cm % 100;

        System.out.println("Centimeters: " + cm);
        System.out.println("Meters: " + meters);
        System.out.println("Remaining: " + remaining);

        double num = meters;
        System.out.println("Implicit casting: " + num);

        double value = 12.5;
        int result = (int)value;

        System.out.println("Original: " + value);
        System.out.println("Converted: " + result);
    }
}
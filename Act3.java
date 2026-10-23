public class Act3 {
    public static void main(String[] args) {

        double cm = 250.75;

        int meters = (int)(cm / 100);
        double remaining = cm % 100;

        System.out.println("Centimeters: " + cm);
        System.out.println("Whole meters: " + meters);
        System.out.println("Remaining centimeters: " + remaining);

        int num = 5;
        double value = num;

        System.out.println("Implicit casting: " + value);

        double price = 12.75;

        // The decimal part is lost when converting double to int
        int result = (int) price;

        System.out.println("Original value: " + price);
        System.out.println("After casting: " + result);
    }
}
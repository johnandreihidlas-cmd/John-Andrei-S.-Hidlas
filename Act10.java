public class Act10 {
    public static void main(String[] args) {
        double purchaseAmount = 1200;
        double discountRate;

        if (purchaseAmount < 100) {
            discountRate = 0;
        } else if (purchaseAmount < 500) {
            discountRate = 0.05;
        } else if (purchaseAmount < 1000) {
            discountRate = 0.10;
        } else {
            discountRate = 0.15;
        }

        double finalPrice = purchaseAmount - (purchaseAmount * discountRate);

        System.out.println("Discount: " + (discountRate * 100) + "%");
        System.out.println("Final Price: " + finalPrice);
    }
}
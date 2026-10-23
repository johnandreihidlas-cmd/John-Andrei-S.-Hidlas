public class Act2 {
    public static void main(String[] args) {

        int quantity = 3;
        double unitPrice = 25.50;
        String storeName = "SMeringhoy Store";

        double totalCost = quantity * unitPrice;

        System.out.println("Store: " + storeName);
        System.out.println("Quantity: " + quantity);
        System.out.println("Price: " + unitPrice);
        System.out.println("Total Cost: " + totalCost);

        // totalCost should not be int because the price can have decimals
    }
}
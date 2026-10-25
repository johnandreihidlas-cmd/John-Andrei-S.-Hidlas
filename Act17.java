public class Act17 {
    public static void main(String[] args) {
        String[] things = {"Games", "Music", "Foods", "Movies", "Sleep"};

        for (int i = 0; i < things.length; i++) {
            System.out.println((i + 1) + ". " + things[i]);
        }

        System.out.println("Total: " + things.length);
    }
}
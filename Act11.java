public class Act11 {
    public static void main(String[] args) {
        String username = "Andrei67";
        String password = "19200606";
        boolean locked = false;
        
        if (username.equals("Andrei67")) {
            if (password.equals("19200606")) {
                if (!locked) {
                    System.out.println("Login successful!");
                } else {
                    System.out.println("Account is locked.");
                }
            } else {
                System.out.println("Incorrect password.");
            }
        } else {
            System.out.println("Incorrect username.");
        }
    }
}
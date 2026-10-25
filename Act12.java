public class Act12 {
    public static void main(String[] args) {
        String username = "AndreiBPI";
        int pin = 1234;
        double balance = 7000;
        double withdrawal = 1000;
        double withdrawnToday = 500;
        double limit = 3000;
        String tier;
        double feeRate;

        if (username.equals("AndreiBPI")) {
            if (pin == 1234) {
                if (balance < 1000) {
                    tier = "Bronze";
                } else if (balance < 5000) {
                    tier = "Silver";
                } else if (balance < 10000) {
                    tier = "Gold";
                } else {
                    tier = "Platinum";
                }

                switch (tier) {
                    case "Bronze": feeRate = 0.02; break;
                    case "Silver": feeRate = 0.015; break;
                    case "Gold": feeRate = 0.01; break;
                    default: feeRate = 0.005;
                }

                double total = withdrawal + withdrawal * feeRate;

                if (withdrawal <= balance) {
                    if (withdrawnToday + withdrawal <= limit) {
                        if (total <= balance) {
                            System.out.println("APPROVED");
                            System.out.println("Tier: " + tier);
                            System.out.println("Remaining Balance: " + (balance - total));
                        } else {
                            System.out.println("DENIED: Insufficient balance for fee.");
                        }
                    } else {
                        System.out.println("DENIED: Daily limit exceeded.");
                    }
                } else {
                    System.out.println("DENIED: Insufficient balance.");
                }
            } else {
                System.out.println("Incorrect PIN.");
            }
        } else {
            System.out.println("Incorrect username.");
        }
    }

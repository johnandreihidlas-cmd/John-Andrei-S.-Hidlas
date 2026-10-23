
public class Act6 {
    public static void main(String[] args) {
        double averageGrade = 82;
        int absences = 2;

        if ((averageGrade >= 75 && absences <= 3) || averageGrade >= 90) {
            System.out.println("Result: PASS");

            if (averageGrade >= 90) {
                System.out.println("Reason: Grade is 90 or higher.");
            } else {
                System.out.println("Reason: Grade is at least 75 and absences are 3 or fewer.");
            }
        } else {
            System.out.println("Result: FAIL");
            System.out.println("Reason: Grade and absences requirements were not met.");
        }
    }
}
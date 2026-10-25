public class Act20 {

    // Store student information
    static class Student {
        String name;
        int[] scores;
        double average;

        Student(String name, int[] scores) {
            this.name = name;
            this.scores = scores;

            int sum = 0;

            // Calculate the average
            for (int i = 0; i < scores.length; i++) {
                sum += scores[i];
            }

            average = (double) sum / scores.length;
        }
    }

    public static void main(String[] args) {
        // Create students and their subject scores
        Student[] students = {
            new Student("Bruce", new int[]{92, 86, 94, 90}),
            new Student("Jim", new int[]{85, 86, 94, 93}),
            new Student("Shua", new int[]{85, 96, 85, 89})
        };

        // Search for a student
        String target = "Bruce";
        boolean found = false;

        for (int i = 0; i < students.length; i++) {
            if (students[i].name.equals(target)) {
                System.out.println("Found: " + students[i].name);
                found = true;
            }
        }

        if (!found) {
            System.out.println("Student not found");
        }

        // Sort students by average, highest first
        for (int i = 0; i < students.length - 1; i++) {
            for (int j = 0; j < students.length - 1 - i; j++) {
                if (students[j].average < students[j + 1].average) {
                    Student temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
            }
        }

        // Display rankings and handle ties
        System.out.println("\nCLASS RANKING");
        int rank = 1;

        for (int i = 0; i < students.length; i++) {
            if (i > 0 && students[i].average != students[i - 1].average) {
                rank = i + 1;
            }

            System.out.println(rank + ". " + students[i].name
                    + " - Average: " + students[i].average);
        }
    }
}
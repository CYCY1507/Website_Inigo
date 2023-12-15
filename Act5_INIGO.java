import java.util.Scanner;

public class Act5_INIGO {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Define the number of students and activities
        int numStudents = 5;
        int numActivities = 3;

        // Create a 2D array to store grades
        double[][] grades = new double[numStudents][numActivities];

        // Input grades for each student and activity
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Enter grades for Student " + (i + 1) + ":");
            for (int j = 0; j < numActivities; j++) {
                System.out.print("Enter grade for Activity " + (j + 1) + ": ");
                grades[i][j] = scanner.nextDouble();
            }
        }

        // Calculate and display average grades for each student
        System.out.println("\nAverage Grades for Each Student:");
        for (int i = 0; i < numStudents; i++) {
            double sum = 0;
            for (int j = 0; j < numActivities; j++) {
                sum += grades[i][j];
            }
            double average = sum / numActivities;
            System.out.println("Student " + (i + 1) + ": " + average);
        }

        // Close the scanner
        scanner.close();
    }
}

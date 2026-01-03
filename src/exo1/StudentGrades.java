package exo1;
import java.util.Arrays;
import java.util.Scanner;
public class StudentGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int n = scanner.nextInt();
        double [] grades = new double [n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter grade for student " + (i + 1) + ": ");
            grades[i] = scanner.nextDouble();
        }
        // Menu for operations
        int choice;
        do {
            System.out.println("\nChoose an operation:");
            System.out.println("1. Sort and display grades");
            System.out.println("2. Display average grade");
            System.out.println("3. Display highest and lowest grades");
            System.out.println("4. Display number of students with a specific grade");
            System.out.println("5. Exit");
            System.out.print("Your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Sort and display grades
                    Arrays.sort(grades);
                    System.out.println("Sorted grades: " + Arrays.toString(grades));
                    break;
                case 2:
                    // Calculate and display average
                    double sum = 0;
                    for (double grade : grades) {
                        sum += grade;
                    }
                    double average = sum / grades.length;
                    System.out.println("Average grade: " + average);
                    break;
                case 3:
                    // Display highest and lowest grades
                    double max = grades[0];
                    double min = grades[0];
                    for (double grade : grades) {
                        if (grade > max) max = grade;
                        if (grade < min) min = grade;
                    }
                    System.out.println("Highest grade: " + max);
                    System.out.println("Lowest grade: " + min);
                    break;
                case 4:
                    // Count students with a specific grade
                    System.out.print("Enter the grade to count: ");
                    double target = scanner.nextDouble();
                    int count = 0;
                    for (double grade : grades) {
                        if (grade == target) count++;
                    }
                    System.out.println("Number of students with grade " + target + ": " + count);
                    break;
                case 5:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 5);

        scanner.close();
    }
}




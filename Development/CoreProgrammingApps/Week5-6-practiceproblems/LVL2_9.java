
// This program stores marks for 3 subjects in a 2D array, calculates percentages, and assigns letter grades.

import java.util.Scanner;

public class LVL2_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[][] marks = new int[n][3]; // 3 subjects: Phys, Chem, Maths
        double[] percentages = new double[n];
        char[] grades = new char[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i + 1) + " marks:");
            int sum = 0;
            for (int j = 0; j < 3; j++) {
                System.out.print("  Subject " + (j + 1) + ": ");
                marks[i][j] = sc.nextInt();
                if (marks[i][j] < 0) { i--; break; } // Simple validation
                sum += marks[i][j];
            }
            
            percentages[i] = sum / 3.0;
            if (percentages[i] >= 80) grades[i] = 'A';
            else if (percentages[i] >= 60) grades[i] = 'B';
            else grades[i] = 'C';
        }

        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i+1) + " Percentage: " + percentages[i] + "% Grade: " + grades[i]);
        }
    }
}

// This program uses a 2D array to store height, weight, and BMI for multiple people, categorizing their weight status.

import java.util.Scanner;

public class LVL2_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of persons: ");
        int n = sc.nextInt();

        // Columns: [0]=Weight(kg), [1]=Height(m), [2]=BMI
        double[][] personData = new double[n][3];
        String[] status = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Person " + (i+1));
            System.out.print(" Weight (kg): "); personData[i][0] = sc.nextDouble();
            System.out.print(" Height (m): "); personData[i][1] = sc.nextDouble();

            // BMI Formula: weight / (height * height)
            personData[i][2] = personData[i][0] / (personData[i][1] * personData[i][1]);

            if (personData[i][2] < 18.5) status[i] = "Underweight";
            else if (personData[i][2] < 25) status[i] = "Normal";
            else status[i] = "Overweight";
        }

        System.out.println("\nWeight | Height | BMI | Status");
        for (int i = 0; i < n; i++) {
            System.out.printf("%.2f | %.2f | %.2f | %s\n", 
                personData[i][0], personData[i][1], personData[i][2], status[i]);
        }
    }
}
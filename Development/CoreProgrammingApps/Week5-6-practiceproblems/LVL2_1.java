
// This program calculates a 5% or 2% bonus for 10 employees based on service years, using a while loop to force valid user input.

import java.util.Scanner;

public class LVL2_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] salaries = new double[10];
        double[] years = new double[10];
        double[] bonuses = new double[10];
        double[] newSalaries = new double[10];

        double totalBonus = 0, totalOldSal = 0, totalNewSal = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Employee " + (i + 1) + ":");
            System.out.print("  Enter Salary: ");
            double s = sc.nextDouble();
            System.out.print("  Enter Years of Service: ");
            double y = sc.nextDouble();

            // Validation: If invalid, decrement i to repeat this index
            if (s <= 0 || y < 0) {
                System.out.println("Invalid input. Please enter positive values.");
                i--; 
                continue;
            }

            salaries[i] = s;
            years[i] = y;
            
            // Logic: 5% for > 5 years, else 2%
            bonuses[i] = (years[i] > 5) ? salaries[i] * 0.05 : salaries[i] * 0.02;
            newSalaries[i] = salaries[i] + bonuses[i];

            totalOldSal += salaries[i];
            totalBonus += bonuses[i];
            totalNewSal += newSalaries[i];
        }

        System.out.println("\nTotal Old Salary: " + totalOldSal);
        System.out.println("Total Bonus Paid: " + totalBonus);
        System.out.println("Total New Salary: " + totalNewSal);
    }
}
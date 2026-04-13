
// This program stores up to 10 numbers in an array but stops early if the user enters 0 or a negative number, then calculates the total sum.

import java.util.Scanner;

public class LVL1_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] numbers = new double[10];
        double total = 0.0;
        int index = 0;

        while (true) {
            System.out.print("Enter a number (0 or negative to stop): ");
            double input = sc.nextDouble();

            if (input <= 0 || index == 10) break;

            numbers[index] = input;
            index++;
        }

        for (int i = 0; i < index; i++) {
            total += numbers[i];
        }
        System.out.println("Total sum of entered numbers: " + total);
    }
}
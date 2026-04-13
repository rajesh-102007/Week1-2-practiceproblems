
// This program breaks a number into individual digits and uses a frequency array of size 10 to count and display how many times each digit (0-9) appears.

import java.util.Scanner;

public class LVL3_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        long number = sc.nextLong();
        long tempNumber = Math.abs(number); 

        String numStr = Long.toString(tempNumber);
        int digitCount = numStr.length();
        int[] digits = new int[digitCount];

        for (int i = 0; i < digitCount; i++) {
            digits[i] = (int)(tempNumber % 10);
            tempNumber /= 10;
        }
        int[] frequency = new int[10];

        for (int digit : digits) {
            frequency[digit]++;
        }

        System.out.println("\nDigit Frequency for " + number + ":");
        System.out.println("---------------------------");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + " appears " + frequency[i] + " time(s).");
            }
        }
    }
}
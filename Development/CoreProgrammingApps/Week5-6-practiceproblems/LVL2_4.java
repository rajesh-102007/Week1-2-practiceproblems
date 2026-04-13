
// This program breaks a number into digits and stores them in an array that doubles in size if the number of digits exceeds the initial limit.

import java.util.Scanner;

public class LVL2_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a large number: ");
        long num = sc.nextLong();

        int maxDigit = 2; // Starting small to demonstrate resizing
        int[] digits = new int[maxDigit];
        int index = 0;

        while (num != 0) {
            if (index == maxDigit) {
                // Resize: Create temp array, copy data, reassign
                maxDigit += 10;
                int[] temp = new int[maxDigit];
                System.arraycopy(digits, 0, temp, 0, digits.length);
                digits = temp;
            }
            digits[index++] = (int)(num % 10);
            num /= 10;
        }

        int largest = 0, secondLargest = 0;
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        System.out.println("Largest: " + largest + ", Second Largest: " + secondLargest);
    }
}
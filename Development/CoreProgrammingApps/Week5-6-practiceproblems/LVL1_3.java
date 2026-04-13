
// This program calculates a multiplication table for a user-input number, stores the results in an array, and displays them.

import java.util.Scanner;

public class LVL1_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int[] multiplicationTable = new int[11]; // Index 1 to 10

        for (int i = 1; i <= 10; i++) {
            multiplicationTable[i] = number * i;
            System.out.println(number + " * " + i + " = " + multiplicationTable[i]);
        }
    }
}
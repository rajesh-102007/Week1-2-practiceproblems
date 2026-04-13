
// This program takes a 2D grid (Matrix) from the user and copies all elements into a single-dimension array using nested loops.

import java.util.Scanner;

public class LVL1_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows and columns: ");
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];
        int[] flatArray = new int[rows * cols];

        System.out.println("Enter matrix values:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        int k = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                flatArray[k++] = matrix[i][j];
            }
        }

        System.out.print("Converted 1D Array: ");
        for (int val : flatArray) System.out.print(val + " ");
    }
}
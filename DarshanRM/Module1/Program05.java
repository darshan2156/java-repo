package org.darshan;

import java.util.Scanner;

public class Program05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n : ");
        int n = sc.nextInt();

        for (int row = 0; row < n; row++) {
            // Star
            for (int col = 0; col < n-row; col++) {
                if (col == n - 1 - row) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            // Space
            for (int space = 0; space < 2 * row - 1; space++) {
                if (row == n/2) System.out.print("*");
                else System.out.print(" ");
            }
            // Star
            if(row != 0) System.out.print("*");
            System.out.println();
        }
    }
}

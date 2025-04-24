package org.darshan.Day2;

import java.util.Scanner;

public class PrintingPatternNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n : ");
        int n = sc.nextInt();

        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n - row; col++) {
                System.out.print(n - row);
            }
            System.out.println();
        }

        sc.close();
    }
}

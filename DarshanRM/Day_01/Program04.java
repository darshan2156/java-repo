package org.darshan;

import java.util.Scanner;

public class Program04 {
    static void mainBody(int n, int row) {
        for (int star = 0; star < n - row; star++) {
            System.out.print("*");
        }
        for (int space = 0; space < (2 * row) - 1; space++) {
            System.out.print(" ");
        }
        for (int star = 0; star < n - row; star++) {
            if (star == 0 && row == 0) continue;
            System.out.print("*");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n : ");
        int n = sc.nextInt();

        // Upper part
        for (int row = 0; row < n ; row++) {
            mainBody(n, row);
        }

        // Lower part
        for (int row = n-2; row >= 0 ; row--) {
            mainBody(n, row);
        }
    }
}

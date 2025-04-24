package org.darshan.Day2;

import java.util.Scanner;

public class ConvertIntToBinary {
    private static void convertIntegerToBinary(int n) {
        StringBuilder binary = new StringBuilder();
        while (n != 0) {
            binary.append(((n & 1) == 1) ? 1 : 0);
            n >>= 1;
        }
        binary.reverse();
        System.out.println("Binary format of " + n + " is " + binary);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer(decimal) number : ");
        int n = sc.nextInt();

        convertIntegerToBinary(n);

        sc.close();
    }
}

package org.darshan.Day2.FastestFingers;

import java.util.Scanner;

public class Program3 {

    private static void convertIntToBinary (int n) {
        StringBuilder binary = new StringBuilder();
        while (n != 0) {
            binary.append(((n & 1) == 1) ? 1 : 0);
            n >>= 1;
        }
        binary.reverse();
        System.out.println(binary);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        convertIntToBinary(n);

        sc.close();
    }
}

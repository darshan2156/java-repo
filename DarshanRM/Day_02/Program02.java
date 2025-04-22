package org.darshan.Day2.FastestFingers;

import java.util.Scanner;

public class Program2 {
    private static boolean isPrime(int n) {
        for (int i = 2; i<n; i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }

    private static void printNPrimeNums(int start, int n) {
        int count = 0;
        while (count < n) {
            if (isPrime(start)) {
                System.out.println(start);
                count++;
            }
            start++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int start = sc.nextInt();
        int n = sc.nextInt();
        printNPrimeNums(start, n);

        sc.close();
    }
}

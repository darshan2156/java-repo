package org.darshan.Day2;

import java.util.Scanner;

public class PrimeNumber {
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
                System.out.print(start + " ");
                count++;
            }
            start++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the start number from which you want prime numbers : ");
        int start = sc.nextInt();
        System.out.print("Enter number of prime numbers you want from starting number : ");
        int n = sc.nextInt();

        System.out.print(n + " prime numbers starting from " + start + " are : ");
        printNPrimeNums(start, n);

        sc.close();
    }
}

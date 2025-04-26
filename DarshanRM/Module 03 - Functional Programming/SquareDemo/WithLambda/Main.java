package org.darshan.FunctionalProgramming.Custom.SquareDemo.WithLambda;

import org.darshan.FunctionalProgramming.Custom.SquareDemo.ISquare;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Enter the number : ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        ISquare squareImplObj = (num) -> num * num;

        System.out.println("Square of " + number + " is " + squareImplObj.findSquare(number));
    }
}

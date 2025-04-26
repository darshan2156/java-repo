package org.darshan.FunctionalProgramming.Custom.SquareDemo.WithoutLambda;

import org.darshan.FunctionalProgramming.Custom.SquareDemo.ISquare;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Enter the number : ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        ISquare obj = new Square();
        System.out.println("Square of " + number + " is " + obj.findSquare(number));
    }
}

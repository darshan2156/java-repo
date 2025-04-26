package org.darshan.FunctionalProgramming.InBuilt.FunctionFunctionalInterfaceUsage;

import java.util.Scanner;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int number = scanner.nextInt();

        Function<Integer, Integer> cubeImpObj = (num) -> num * num * num;

        System.out.println("Cube of " + number + " is " + cubeImpObj.apply(number));
    }
}

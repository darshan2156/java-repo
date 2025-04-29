package org.darshan.FunctionalProgramming.LambdaPractise;

import java.util.Scanner;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        // 1. print hello world
        System.out.println("Hello world");

        // 2. take a number as input and multiple numbers then write result
        Consumer<Integer> multipleObj = (number) -> System.out.println("Square of number " + number + " is " + (number * number));
        multipleObj.accept(5);

        // 3. take 2 numbers as input and return sum of them
        // BiFunction<Integer, Integer, Integer> addImplObj = Integer::sum;
        BiFunction<Integer, Integer, Integer> addImplObj = (num1, num2) -> num1 + num2;
        System.out.println(addImplObj.apply(4, 6));

        // 4. take a number as input and return the root of number


    }
}

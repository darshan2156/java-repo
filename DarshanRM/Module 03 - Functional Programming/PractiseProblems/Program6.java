package org.darshan.PractiseProblems;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Program6 {
    public static void subtract(int num) {
        System.out.println(num - 2);
    }

    public static void main(String[] args) {
        // Real world use case:
        List<Integer> nums = Arrays.asList(1, 5, 6, 9, 2, 3);
        System.out.println(nums);
        System.out.println();

        // 1. filter(Predicate)
        // Task : Take the array and get only even number from the array
        List<Integer> evenNums = nums.stream()
                .filter(num -> num%2==0)
                .toList();
        System.out.println("Even number of array : " + evenNums);
        System.out.println();

        nums.stream()
                .filter(num -> num%2==0)
                .forEach(System.out::println);
        System.out.println();

        // 2. map(Function)
        // Task : Take the array and get cube of all the numbers of array
        System.out.print("Cube of all the numbers in the array : ");
        List<Integer> cubeNums = nums.stream()
                .map(num -> num * num * num)
                .toList();
        System.out.println(cubeNums);
        System.out.println();

        // 3. forEach(Consumer)
        // Task : Takes number and apply function on each number
        // cubeNums.forEach(Program6::subtract);
        System.out.println("For each loop with functions");
        cubeNums.forEach(num -> subtract(num));
        System.out.println();

        // 4. sort(Comparator)


        // 5. generate(Supplier)
        // Task : Generate 'n' random numbers
        System.out.println("Random number generator : ");
        Stream.generate(
                        () -> (int)(Math.random() * 7 + 1)
                )
                .limit(10)
                .forEach(System.out::println);
    }
}

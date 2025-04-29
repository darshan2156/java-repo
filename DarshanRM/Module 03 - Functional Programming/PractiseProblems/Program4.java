package org.darshan.PractiseProblems;

import java.util.function.Supplier;

public class Program4 {
    public static void main(String[] args) {
        // Task : Generate a random number between 1 to 7 using lambda function

        Supplier<Integer> randomNumberSupplier =  () -> (int)(Math.random() * 7 + 1);

        for (int i = 0; i < 14; i++) {
            System.out.println(randomNumberSupplier.get());
        }
    }
}

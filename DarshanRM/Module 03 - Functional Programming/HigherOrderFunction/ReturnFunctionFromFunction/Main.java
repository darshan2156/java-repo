package org.darshan.HigherOrderFunction.ReturnFunctionFromFunction;

import java.util.function.Function;

public class Main {
    public static Function<Integer, Integer> giveSquareFunction() {
        return x -> x * x;
    }

    public static void main(String[] args) {
        Function<Integer, Integer> function = giveSquareFunction();
        System.out.println(function.apply(4));
    }
}

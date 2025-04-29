package org.darshan.PractiseProblems;

import java.util.function.Function;

public class Program3 {
    public static void main(String[] args) {
        // Task :
        // Function 1 takes a number and return number + 2
        // Function 2 takes a number and return number * 4
        // Function 3 take a number passes it to function 1 and output of function 1 to function 2

        Function<Integer, Integer> addFunctionImplObj = num -> num + 2;
        Function<Integer, Integer> mulFunctionImplObj = num -> num * 4;
        Function<Integer, Integer> nestedLambda = addFunctionImplObj.andThen(mulFunctionImplObj);

        System.out.println(nestedLambda.apply(3));
    }
}

package org.darshan.FunctionalProgramming.PractiseProblems;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

public class Program1 {
    public static void main(String[] args) {
        // Task 1 : Create a lambda function which takes array of string as input and
        // return the count of number of string who length is greater than 5

        Predicate<String> checkLengthImplObj = (str) -> str.length() > 5;

        Function<ArrayList<String>, Integer> countLongStringsImplObj = (strings) -> {
            int count = 0;
            for (String string : strings) {
                if (checkLengthImplObj.test(string)) {
                    System.out.println(string);
                    count++;
                }
            }
            return count;
        };

        ArrayList<String> strs = new ArrayList<>(){{
            add("Darshan");
            add("hel");
            add("rokkad");
            add("world");
        }};
        System.out.println(countLongStringsImplObj.apply(strs));
    }
}

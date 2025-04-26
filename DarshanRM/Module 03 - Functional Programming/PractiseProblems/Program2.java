package org.darshan.FunctionalProgramming.PractiseProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Function;

public class Program2 {
    public static void main(String[] args) {
        System.out.print("Enter the string : ");
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();

        // Solution 1
        Function<String, ArrayList<Character>> getStringCharactersImplObj = (String str) -> {
            ArrayList<Character> chars = new ArrayList<>();
            for (int i = 0; i < str.length(); i++) {
                chars.add(str.charAt(i));
            }
            return chars;
        };
        System.out.println("Array of character : " + getStringCharactersImplObj.apply(inputString));

        // Solution 2
        Function<String, char[]> convertStringToCharArrayImplObj = String::toCharArray;
        System.out.println("Array of character : " + Arrays.toString(convertStringToCharArrayImplObj.apply(inputString)));
    }
}

package org.darshan.FunctionalProgramming.InBuilt.BiFunctionFunctionalInterfaceUsage;

import java.util.Scanner;
import java.util.function.BiFunction;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your first name : ");
        String firstName = scanner.nextLine();
        System.out.print("Enter your last name : ");
        String lastName = scanner.nextLine();

        BiFunction<String, String, String> fullNameGenerator = (fName,  lName) -> (firstName + " " + lastName);

        System.out.println("Full name : " + fullNameGenerator.apply(firstName, lastName));
    }
}

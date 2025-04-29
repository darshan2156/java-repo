package org.darshan.FunctionalProgramming.InBuilt.PredicateFunctionalInterface;

import java.util.Scanner;
import java.util.function.Predicate;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        // Create a function that takes email id as input and tells whether email id is valid or not

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the email id : ");
        String email = scanner.nextLine();

        Predicate<String> checkValidEmailId = (emailId) -> {
            String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
            Pattern pattern = Pattern.compile(emailRegex);
            return pattern.matcher(email).matches();
        };

        System.out.println("Email id " + email + " is " + (checkValidEmailId.test(email)?"valid.":"invalid."));
    }
}

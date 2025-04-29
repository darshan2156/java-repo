package org.darshan.FunctionalProgramming.InBuilt.ConsumerFunctionalInterface;

import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        Consumer<String> convertToUpperCaseImplObj = (String name) -> System.out.println(name.toUpperCase());
        convertToUpperCaseImplObj.accept("Zeta Academy Program");
    }
}

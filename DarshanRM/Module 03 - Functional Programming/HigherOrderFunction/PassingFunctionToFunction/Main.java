package org.darshan.HigherOrderFunction.PassingFunctionToFunction;

public class Main {
    public static void method(Runnable runnable) {
        runnable.run();
    }

    public static void main(String[] args) {
        method(() -> System.out.println("executing runnable using HOF"));
    }
}

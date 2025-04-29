package org.darshan.PractiseProblems;

import java.util.function.*;

public class Program5 {
    public static void main(String[] args) {
        // 1. BiFunction
        BiFunction<Integer, Integer, Integer> addFunction= Integer::sum;
        System.out.println(addFunction.apply(5, 6));

        // 2. BiConsumer
        BiConsumer<String, Integer> printFullNameConsumer = (name, age) -> System.out.println(name + " " + age);
        printFullNameConsumer.accept("Darshan", 21);

        // 3. UnaryOperator
        UnaryOperator<Integer> square = num -> num * num;
        System.out.println(square.apply(3));

        // 4. BinaryOperator
        BinaryOperator<Integer> multiply = (num1, num2) -> num1 * num2;
        System.out.println(multiply.apply(6, 8));

        // 5. ToIntFunction
        ToIntFunction<String> stringLength = (str) -> str.length();
        System.out.println(stringLength.applyAsInt("Harsha"));
    }
}

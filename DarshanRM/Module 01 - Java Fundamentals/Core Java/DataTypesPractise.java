package org.darshan.Day1;

import java.util.Arrays;

public class DataTypesPractise {
    public static void main(String[] args) {
        int num = 10;
        String name = "Darshan";
        float pi = 3.142f;
        char firstLetter = 'A';
        boolean isJavaFun = true;

        System.out.println(num);
        System.out.println(name);
        System.out.println(pi);
        System.out.println(firstLetter);
        System.out.println(isJavaFun);

        String[] hobbies = {"Reading", "Writing"};
        Arrays.stream(hobbies).forEach(System.out::println);
    }
}

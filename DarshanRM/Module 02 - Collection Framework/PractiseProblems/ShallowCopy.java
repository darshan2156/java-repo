package org.darshan.CollectionsPractise.CollectionFramework.PractiseProblems;

import java.util.Arrays;

public class ShallowCopy {
    public static void main(String[] args) {
        int[] original = {1, 2, 3};
        int[] copy = original;
        copy[0] = 99;

        // Shallow copy
        System.out.println(Arrays.toString(original));
    }
}

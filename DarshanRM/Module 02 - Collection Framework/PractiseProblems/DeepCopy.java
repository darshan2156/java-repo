package org.darshan.CollectionsPractise.CollectionFramework.PractiseProblems;

import java.util.Arrays;

public class DeepCopy {
    public static void main(String[] args) {
        int[] original = {1, 2, 3};
        int[] nums = Arrays.copyOf(original, original.length);
        nums[2] = 5;
        System.out.println(original[2]);
        System.out.println(nums[2]);
    }
}

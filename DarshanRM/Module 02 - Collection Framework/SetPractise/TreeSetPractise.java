package org.darshan.CollectionsPractise.CollectionFramework.SetPractise;

import java.util.TreeSet;

public class TreeSetPractise {
    public static void main(String[] args) {
        TreeSet<Integer> nums = new TreeSet<>();
        nums.add(3);
        nums.add(2);
        nums.add(6);
        nums.add(4);
        // nums.add(null);
        // null's are not allowed - null pointer exception

        // Always set will be sorted
        System.out.println(nums);

    }
}

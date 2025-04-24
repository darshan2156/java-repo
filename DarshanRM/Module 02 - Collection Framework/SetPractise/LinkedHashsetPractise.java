package org.darshan.CollectionsPractise.CollectionFramework.SetPractise;

import java.util.LinkedHashSet;

public class LinkedHashsetPractise {
    public static void main(String[] args) {
        LinkedHashSet<Integer> nums = new LinkedHashSet<>();
        nums.add(5);
        nums.add(1);
        nums.add(3);
        nums.add(2);
        nums.add(9);
        nums.add(1);
        nums.add(null);

        // Insertion order of the number will be maintained
        System.out.println("Linked Hashset : " + nums);
    }
}

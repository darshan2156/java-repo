package org.darshan.CollectionsPractise.CollectionFramework.SetPractise;

import java.util.HashSet;

public class HashSetPractise {

    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(4);
        set.add(3);
        set.add(2);
        set.add(8);
        set.add(2);
        set.add(null);

        System.out.println("Set : " + set);

        set.remove(2);

        // Insertion order of the numbers will not be maintained
        System.out.println("Set : " + set);
    }
}

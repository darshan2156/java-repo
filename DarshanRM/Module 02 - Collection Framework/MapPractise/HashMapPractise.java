package org.darshan.CollectionsPractise.CollectionFramework.HashMapPractise;

import java.util.HashMap;

public class HashMapPractise {
    public static void main(String[] args) {
        // Key-value pair
        HashMap<Integer, String> rank = new HashMap<>();
        rank.put(4, "Darshan");
        rank.put(2, "Hash");
        rank.put(8, "Kalyan");
        rank.put(1, "Josh");
        rank.put(null, "Hello");
        rank.put(9, null);

        System.out.println(rank);

        System.out.println();

        // HashMap store elements always in sorted order of their key
        for(Integer key : rank.keySet()) {
            System.out.println(key + " -> " + rank.get(key));
        }

        // Internally hashmap use hashset to store key
    }
}

package org.darshan.CollectionsPractise.CollectionFramework.HashMapPractise;

import java.util.TreeMap;

public class TreeMapPractise {
    public static void main(String[] args) {
        // Key-value pair
        TreeMap<Integer, String> rank = new TreeMap<>();
        rank.put(4, "Darshan");
        rank.put(2, "Hash");
        rank.put(8, "Kalyan");
        rank.put(1, "Josh");
        rank.put(9, null);
        // null keys are not allowed

        System.out.println(rank);

        System.out.println();

        // TreeMap store key-value pair in sorted order of their key
        for(Integer key : rank.keySet()) {
            System.out.println(key + " -> " + rank.get(key));
        }
    }
}

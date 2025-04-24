package org.darshan.CollectionsPractise.CollectionFramework.HashMapPractise;

import java.util.HashMap;
import java.util.Map;

public class HashMapPractise {
    public static void main(String[] args) {
        // Key-value pair
        // Internally hashmap use hashset to store key
        HashMap<Integer, String> rank = new HashMap<>();
        rank.put(4, "Darshan");
        rank.put(2, "Hash");
        rank.put(8, "Kalyan");
        rank.put(1, "Josh");
        rank.put(null, "Hello");
        rank.put(9, null);

        System.out.println(rank);

        System.out.println(rank.remove(2));
        System.out.println(rank.containsKey(2));
        System.out.println(rank.containsValue("Josh"));
        System.out.println(rank.entrySet());
        System.out.println(rank.keySet());
        System.out.println(rank.values());
        System.out.println();

        // HashMap store elements always in sorted order of their key
        for(Integer key : rank.keySet()) {
            System.out.println(key + " -> " + rank.get(key));
        }

        System.out.println();
        for (Map.Entry<Integer, String> pair : rank.entrySet()) {
            System.out.println(pair.getKey() + " -> " + pair.getValue());
        }
    }
}

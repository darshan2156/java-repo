package org.darshan.CollectionsPractise.CollectionFramework.HashMapPractise;

import java.util.LinkedHashMap;

public class LinkedHashMapPractise {
    public static void main(String[] args) {
        LinkedHashMap<String, Float> map = new LinkedHashMap<>();
        map.put("Darshan", 7f);
        map.put("Harsha", 1f);
        map.put("Abhishekh", 2f);
        map.put(null, 4f);
        map.put("hello", null);
        // null's are allowed

        // insertion order is maintained in linked hashmap
        System.out.println(map);
    }
}

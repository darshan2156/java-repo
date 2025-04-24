package org.darshan.CollectionsPractise.CollectionFramework.ListPractise;

import java.util.ArrayList;
import java.util.List;

public class ArrayListPractise {
    private static void printNames(List<String> names) {
        System.out.print("Names : ");
        for (int index = 0; index < names.size(); index++) {
            System.out.print(names.get(index) + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        // 1. "add" method
        names.add("Darshan");
        names.add("Abhishekh");
        names.add("Harsh");

        // 2. "get" and "size" method
        printNames(names);

        // 4. "remove" method
        System.out.println("Removed name at index 1.");
        names.remove(1);
        printNames(names);

        // 5. "contains" method
        System.out.println("Darshan is " + (names.contains("Darshan")?"present":"not present") + " in arraylist." );

        // 6. "set" method
        names.set(0, "PK");
        System.out.println("Changed name at index 0.");
        printNames(names);
    }
}

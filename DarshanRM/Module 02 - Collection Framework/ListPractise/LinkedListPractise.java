package org.darshan.CollectionsPractise.CollectionFramework.ListPractise;

import java.util.LinkedList;

public class LinkedListPractise {
    public static void printLinkedList(LinkedList<String> names) {
        System.out.print("Names : ");
        for (int i = 0; i < names.size(); i++) {
            System.out.print(names.get(i) + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<>();

        names.add("Darshan");
        names.addFirst("Harsh");
        names.addLast("Abhishekh");
        names.addLast("Harsh");
        names.add("Sachin");

        printLinkedList(names);

        System.out.println("First index of Harsh is : " + names.indexOf("Harsh"));
        System.out.println("Last index of Harsh is : " + names.lastIndexOf("Harsh"));

        names.removeFirst();
        names.set(0, "Balu");

        printLinkedList(names);

        System.out.println("First element of the linked list : " + names.peekFirst());
        System.out.println("Last element of the linked list : " + names.peekLast());
    }
}

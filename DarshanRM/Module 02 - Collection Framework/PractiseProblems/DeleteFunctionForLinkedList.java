package org.darshan.CollectionsPractise.CollectionFramework.PractiseProblems;

import java.util.LinkedList;

public class DeleteFunctionForLinkedList {
    private static void removeNode(LinkedList<Integer> linkedList, int index) {
        if (index >= linkedList.size()) {
            System.out.println("You can't remove node from index " + index + " because out of bound.");
        } else {
            linkedList.remove(index);
        }
    }

    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(7);
        linkedList.add(6);
        linkedList.add(5);
        linkedList.add(3);

        System.out.println(linkedList);

        removeNode(linkedList, 2);
        removeNode(linkedList, 4);

        System.out.println(linkedList);
    }
}

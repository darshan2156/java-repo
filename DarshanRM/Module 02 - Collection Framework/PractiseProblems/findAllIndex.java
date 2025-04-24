package org.darshan.CollectionsPractise.CollectionFramework.PractiseProblems;

public class findAllIndex {

    private static void printIndexes(int[] arr, int index) {
        if (index == arr.length) {
            return;
        }
        if (arr[index] == 2) {
            System.out.println(index);
        }
        printIndexes(arr, index + 1);
    }

    public static void main(String[] args) {
        int[] arr = {3, 4, 2, 6, 3, 2, 7, 5, 2, 78, 2};

        printIndexes(arr, 0);

    }
}

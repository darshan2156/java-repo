package org.darshan.CollectionsPractise.CollectionFramework.PractiseProblems;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class UseOfIterator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array list : ");
        int size = scanner.nextInt();

        ArrayList<Integer> nums = new ArrayList<>(size);
        System.out.print("Enter " + size + " number of the array : ");
        for (int i = 0; i < size; i++) {
            nums.add(scanner.nextInt());
        }

        System.out.print("Array : ");
        Iterator<Integer> iterator = nums.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
    }
}

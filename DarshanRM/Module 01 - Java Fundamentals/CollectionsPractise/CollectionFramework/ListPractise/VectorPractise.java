package org.darshan.CollectionsPractise.CollectionFramework.ListPractise;

import java.util.Vector;

public class VectorPractise {
    public static void printVector(Vector<Integer> nums) {
        System.out.print("Nums : ");
        for (int index = 0; index < nums.size(); index++) {
            System.out.print(nums.get(index) + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Vectors are thread safe
        Vector<Integer> nums = new Vector<>();
        System.out.println("Initial capacity of the vector : " + nums.capacity());

        nums.add(3);
        nums.add(0, 5);
        nums.add(8);

        printVector(nums);

        nums.remove(2);
        nums.set(0, 32);
        printVector(nums);

        System.out.println("Is number 3 is present in vector or not : " + nums.contains(3));

        for (int i = 1; i < 10; i++) {
            nums.add(i);
        }
        printVector(nums);

        System.out.println("Capacity of the vector : " + nums.capacity());
        // number vector capacity increases by 100% (it double each time it gets fill)

        nums.clear();
        printVector(nums);
    }
}

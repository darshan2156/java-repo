package org.darshan.CollectionsPractise.CollectionFramework.PractiseProblems;

import java.util.ArrayList;
import java.util.Iterator;

public class MultipleDimsArrayIterator {
    public static void main(String[] args) {

        ArrayList<Integer> nums1 = new ArrayList<>() {{
            add(1);
            add(2);
            add(3);
        }};
        ArrayList<Integer> nums2 = new ArrayList<>() {{
            add(4);
            add(5);
            add(6);
        }};
        ArrayList<Integer> nums3 = new ArrayList<>() {{
            add(7);
            add(8);
            add(9);
        }};

        ArrayList<ArrayList<Integer>> grid = new ArrayList<>(new ArrayList<>() {{
            add(nums1);
            add(nums2);
            add(nums3);
        }});

        System.out.println(grid);

        // print number of grid using iterator
        System.out.print("Grid : ");
        Iterator<ArrayList<Integer>> rowIterator1 = grid.iterator();
        while (rowIterator1.hasNext()) {
            Iterator<Integer> columnIterator = rowIterator1.next().iterator();
            while (columnIterator.hasNext()) {
                System.out.print(columnIterator.next() + " ");
            }
        }
        System.out.println();

        // print number of grid using iterator but using only one loop
        System.out.print("Grid : ");
        Iterator<ArrayList<Integer>> rowIterator = grid.iterator();
        Iterator<Integer> columnIterator = rowIterator.next().iterator();

        while (columnIterator.hasNext()) {
            System.out.print(columnIterator.next() + " ");
            if(!columnIterator.hasNext() && rowIterator.hasNext()) {
                columnIterator = rowIterator.next().iterator();
            }
        }
    }
}

package org.darshan.CollectionsPractise.CollectionFramework.PractiseProblems;

import java.util.ArrayList;

public class MultipleDimsArray {
    public static void main(String[] args) {

        ArrayList<Integer> nums1 = new ArrayList<>() {{
            add(1);
            add(2);
        }};
        ArrayList<Integer> nums2 = new ArrayList<>() {{
            add(3);
            add(4);
        }};
        ArrayList<Integer> nums3 = new ArrayList<>() {{
            add(5);
            add(6);
        }};

        ArrayList<ArrayList<Integer>> grid = new ArrayList<>(new ArrayList<>() {{
            add(nums1);
            add(nums2);
            add(nums3);
        }});

        System.out.println(grid);
        System.out.println(grid.get(grid.size() / 2));
        System.out.println(grid.indexOf(nums2));
    }
}

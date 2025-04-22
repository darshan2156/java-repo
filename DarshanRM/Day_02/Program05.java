package org.darshan.Day2.FastestFingers;

import java.util.Scanner;

public class Program5 {

    private static void findNthLargestNumber(int[] arr, int targetIndex) {
        sortArray(arr, 0 , arr.length - 1);

        if (targetIndex >= arr.length) {
            System.out.println("Not present");
        } else {
            System.out.println(arr[targetIndex]);
        }
    }

    private static void sortArray(int[] arr, int low, int high) {
        if (low < high) {
            int mid = (low + high) / 2;
            sortArray(arr, low, mid);
            sortArray(arr, mid+1, high);
            mergeArray(arr, low, mid, high);
        }
    }

    private static void mergeArray(int[] arr, int low, int mid, int high) {
        int[] temp = new int[high - low + 1];

        int index = 0, leftIndex = low, rightIndex = mid+1;
        while (leftIndex <= mid && rightIndex <= high) {
            if(arr[leftIndex] <= arr[rightIndex]) {
                temp[index++] = arr[leftIndex++];
            } else {
                temp[index++] = arr[rightIndex++];
            }
        }

        while (leftIndex <= mid ) {
            temp[index++] = arr[leftIndex++];
        }

        while (rightIndex <= high) {
            temp[index++] = arr[rightIndex++];
        }

        for (int i = 0; i < temp.length; i++) {
            arr[low + i] = temp[i];
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int targetIndex = sc.nextInt();

        findNthLargestNumber(arr, targetIndex);
    }
}

package org.example;

import static org.example.BinarySearch.binarySearch;

public class Main {

    public static void main(String[] args) {
        int[] arr = { 1, 5, 2, 10, 5, 7, 2 };

        QuickSort.quickSort(arr, 0, arr.length - 1);

        for (int i : arr) {
            System.out.print(i + " ");
        }

        System.out.println();

        System.out.println(binarySearch(arr, 10));
    }
}
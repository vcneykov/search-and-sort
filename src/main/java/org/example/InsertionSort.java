package org.example;

public class InsertionSort {

    //Insertion sort is a simple sorting algorithm that works by iteratively inserting each element
    // of an unsorted list into its correct position in a sorted portion of the list.
    // It is a stable sorting algorithm, meaning that elements with equal values maintain
    // their relative order in the sorted output.

    //Insertion sort is like sorting playing cards in your hands.
    // You split the cards into two groups: the sorted cards and the unsorted cards.
    // Then, you pick a card from the unsorted group and put it in the right place in the sorted group.
    public static void insertionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }
    }
}

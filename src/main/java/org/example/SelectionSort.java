package org.example;

public class SelectionSort {

    // Selection sort is a simple and efficient sorting algorithm that works by repeatedly selecting the smallest
    // element from the unsorted portion of the list and moving it to the sorted portion of the list.
    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minimalElementIndex = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minimalElementIndex] > arr[j]) {
                    minimalElementIndex = j;
                }

                // Swap the found minimum element with the first element
                int temp = arr[minimalElementIndex];
                arr[minimalElementIndex] = arr[i];
                arr[i] = temp;
            }
        }
    }
}

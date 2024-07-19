package org.example;

public class MergeSort {

    static void merge(int[] arr, int left, int mid, int right) {
        int sizeLeft = mid - left + 1;
        int sizeRight = right - mid;

        int[] leftArr = new int[sizeLeft];
        int[] rightArr = new int[sizeRight];

        for (int i = 0; i < sizeLeft; i++) {
            leftArr[i] = arr[left + i];
        }

        for (int i = 0; i < sizeRight; i++) {
            rightArr[i] = arr[mid + i + 1];
        }

        int i = 0, j = 0, k = left;

        while (i < sizeLeft && j < sizeRight) {
            if (leftArr[i] < rightArr[j]) {
                arr[k++] = leftArr[i++];
            } else {
                arr[k++] = rightArr[j++];
            }
        }

        while (i < sizeLeft) {
            arr[k++] = leftArr[i++];
        }

        while (j < sizeRight) {
            arr[k++] = rightArr[j++];
        }
    }

    static void mergeSort(int[] arr, int left, int right) {
        if (left >= right) {
            return;
        }

        int mid = left + (right - left) / 2;

        mergeSort(arr, left, mid);
        mergeSort(arr, mid + 1, right);

        merge(arr, left, mid, right);
    }
}

package dsa.advanced_sorts;

import dsa.shared.Helper;

public abstract class QuickSort {
    public static void sort(int[] arr) {
        sort(arr, 0, arr.length - 1);
    }
    public static void sort(int[] arr, int start, int end) {
        if (start < end) {
            int pivot = partition(arr, start, end);
            sort(arr, start, pivot - 1);
            sort(arr, pivot + 1, end);
        }
    }

    public static int partition(int[] arr, int start, int end) {
        int pivot = arr[end];
        int i = start;
        for (int j = start; j < end; j++) {
            if (arr[j] < pivot) {
                Helper.swap(arr, i, j);
                i++;
            }
        }
        Helper.swap(arr, i, end);
        return i;
    }
}

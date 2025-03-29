package dsa.elementary_sorts;

import dsa.shared.Helper;

public class BubbleSort {
    public static void sort(int[] array) {
        boolean swap = true;
        for (int iPass = 0; swap && iPass < array.length - 1; iPass++) {
            swap = false;
            for (int i = 0; i < array.length - 1 - iPass; i++) {
                if (array[i] > array[i + 1]) {
                    Helper.swap(array, i, i + 1);
//                    int temp = array[i];
//                    array[i] = array[i + 1];
//                    array[i + 1] = temp;
                    swap = true;
                }
            }
        }
    }
}

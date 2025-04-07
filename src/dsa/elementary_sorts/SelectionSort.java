package dsa.elementary_sorts;

import dsa.shared.Helper;

public class SelectionSort {

    public static void sort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            //supozojme se indeksi i pare eshte me vlere me te vogel
            int minIndex = i;

            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }


            //nese kemi gjet nje indeks me vleren me te vogel se ajo e supozuara ndrro vendet
            if (minIndex != i) {
//                int temp = array[i];
//                array[i] = array[minIndex];
//                array[minIndex] = temp;
                Helper.swap(array, minIndex, i);
            }

        }
    }

    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = findMinIndex(array, i); // procedural abstraction
            if (minIndex != i) {
                Helper.swap(array, minIndex, i);
            }
        }
    }

    public static int findMinIndex(int[] array, int startIndex) {
        int minIndex = startIndex;
        for (int i = startIndex + 1; i < array.length; i++) {
            if (array[i] < array[minIndex]) {
                minIndex = i;
            }
        }
        return minIndex;
    }

}















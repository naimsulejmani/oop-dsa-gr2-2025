package dsa.elementary_sorts;

import dsa.shared.Helper;

import java.util.Arrays;

public class SelectionSortDemo {
    public static void main(String[] args) {
        int[] array = Helper.generateArray(10);

        System.out.println("Before sorting: ");
        System.out.println(Arrays.toString(array));

        System.out.println("Sorting...");
        SelectionSort.selectionSort(array);

        System.out.println("After sorting: ");
        System.out.println(Arrays.toString(array));
    }
}











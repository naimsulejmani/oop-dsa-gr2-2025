package dsa.elementary_sorts;

import dsa.shared.Helper;

import java.util.Arrays;

public class InsertionSortDemo {
    public static void main(String[] args) {

        int[] array = Helper.generateArray(10);

        System.out.println("Before sorting: ");
        System.out.println(Arrays.toString(array));

        System.out.println("Sorting...");
        InsertionSort.sort(array);

        System.out.println("After sorting: ");
        System.out.println(Arrays.toString(array));
    }
}











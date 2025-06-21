package dsa.advanced_sorts;

import dsa.shared.Helper;

import java.util.Arrays;

public class HeapSortDemo {
    public static void main(String[] args) {
        int[] arr = Helper.generateArray(10);
        System.out.println(Arrays.toString(arr));
        HeapSort.sort(arr);
        System.out.println(Arrays.toString(arr));

    }
}

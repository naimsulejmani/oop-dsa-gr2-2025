package dsa.advanced_sorts;

import dsa.shared.Helper;

import java.util.Arrays;

public class QuickSortDemo {
    public static void main(String[] args) {
        int[] array = Helper.generateArray(10);
        System.out.println(Arrays.toString(array));
        QuickSort.sort(array);
        System.out.println(Arrays.toString(array));
    }
}

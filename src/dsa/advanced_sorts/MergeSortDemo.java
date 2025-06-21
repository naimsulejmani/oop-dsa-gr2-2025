package dsa.advanced_sorts;

import dsa.shared.Helper;

import java.util.Arrays;

public class MergeSortDemo {

    public static void main(String[] args) {
        int[] array = Helper.generateArray(10);
        System.out.println(Arrays.toString(array));
        MergeSort.sort(array);
        System.out.println(Arrays.toString(array));
    }
}

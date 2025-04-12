package dsa.adts;

import dsa.shared.Helper;

import java.util.Arrays;

public class Example1 {
    public static void main(String[] args) {
        int[] array = Helper.generateArray(10);
        System.out.println("Original array:");
        System.out.println(Arrays.toString(array));

//        InsertionSort.sort(array);
        Arrays.sort(array);
        System.out.println("Sorted array:");
        System.out.println(Arrays.toString(array));
    }
}

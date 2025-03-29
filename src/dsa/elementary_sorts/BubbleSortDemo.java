package dsa.elementary_sorts;

import java.util.Arrays;

public class BubbleSortDemo {
    public static void main(String[] args) {
        int[] array = {56, 21, 333, -213, 87, 2, 1, 9};

        System.out.println("Vargu i pasortuar: ");
        System.out.println(Arrays.toString(array));

        BubbleSort.sort(array);

        System.out.println("Vargu i sortuar: ");
        System.out.println(Arrays.toString(array));
    }
}














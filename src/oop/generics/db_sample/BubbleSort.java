package oop.generics.db_sample;

public class BubbleSort<T extends Comparable<T>> {

    public void sort(T[] array) {
        boolean swapped;
        int n = array.length;
        do {
            swapped = false;
            for (int i = 0; i < n - 1; i++) {
                if (array[i].compareTo(array[i + 1]) > 0) {
                    T temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    swapped = true;
                }
            }
            n--; // Reduce the range of the next pass
        } while (swapped);
    }
}

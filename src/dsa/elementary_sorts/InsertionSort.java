package dsa.elementary_sorts;

public class InsertionSort {
    public static void sort(int[] array) {
        for (int pointer = 1; pointer < array.length; pointer++) {
            // ruaje ne temp vleren e elementit aktual
            int current = array[pointer];
            int position = pointer;

            // perderisa pozita eshte me e madhe se 0 dhe vlera e elementit ne poziten e meparshme eshte me e madhe se vlera aktuale
            while (position > 0 && array[position - 1] > current) {
                // nderro vendet e elementeve dhe shko ne poziten tjeter vijuese
                array[position] = array[position - 1];
                position--;
            }
            array[position] = current;
        }
    }
}

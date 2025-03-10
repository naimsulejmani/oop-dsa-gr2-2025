package dsa.sorting_algorithms;

public class BinarySearch {
    public static int indexOf(int[] array, int searchValue) {
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            // gjeje indeksin e elementit te mesit
            int mid = (low + high) / 2;

            if (array[mid] == searchValue) {
                return mid;
            }

            if (array[mid] < searchValue) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }

        }
        return -1;
    }

    public static boolean contains(int[] array, int searchValue) {
        return indexOf(array, searchValue) != -1;
    }
}










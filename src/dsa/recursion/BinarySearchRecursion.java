package dsa.recursion;

public class BinarySearchRecursion {
    public static int indexOf(int[] array, int searchValue, int low, int high) {
        if (low > high) return -1;
        int mid = (low + high) / 2;
        if (array[mid] == searchValue) return mid;
        else if (array[mid] > searchValue) {
            return indexOf(array, searchValue, low, mid - 1);
        } else {
            return indexOf(array, searchValue, mid + 1, high);
        }

    }
}

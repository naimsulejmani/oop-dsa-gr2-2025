package dsa.sorting_algorithms;

public class BinarySearchDemo {
    public static void main(String[] args) {
        int[] array = {1, 1, 1, 1, 1, 1, 3, 4, 5, 6,123,12314,98230,120983193};

        int searchValue = 123;
        int otherSearchValue = 100;

        int index1 = BinarySearch.indexOf(array, searchValue);
        System.out.printf("Elementi %d ndodhet ne poziten %d%n", searchValue, index1);

        int index2 = BinarySearch.indexOf(array, otherSearchValue);
        System.out.printf("Elementi %d ndodhet ne poziten %d%n", otherSearchValue, index2);

    }
}

package dsa.sorting_algorithms;

public class SequentialSearchDemo {
    public static void main(String[] args) {
        int[] array = {89, 4, 123, 77, 54, 32, -100, -23, 12, 1, 0};
        int searchValue = 12;
        int otherSearchValue = 100;

        int index1 = SequentialSearch.indexOf(array, searchValue);
        System.out.printf("Elementi %d ndodhet ne poziten %d%n", searchValue, index1);

        int index2 = SequentialSearch.indexOf(array, otherSearchValue);
        System.out.printf("Elementi %d ndodhet ne poziten %d%n", otherSearchValue, index2);
    }
}

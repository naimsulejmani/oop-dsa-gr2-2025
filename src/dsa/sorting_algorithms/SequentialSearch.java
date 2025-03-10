package dsa.sorting_algorithms;

public class SequentialSearch {

    public static int indexOf(int[] array, int searchValue) {

        for (int index = 0; index < array.length; index++) {
            //Nese elementi ne varg eshte i barabarte me vleren qe po e kerkojme
            //atehere kthe indeksin e elemetit ku jemi
            if (array[index] == searchValue) {
                return index;
            }
        }
        return -1;
    }

    public static boolean contains(int[] array, int searchValue) {
        return indexOf(array, searchValue) != -1;
    }


}

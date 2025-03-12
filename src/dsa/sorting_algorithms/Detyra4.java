package dsa.sorting_algorithms;

public class Detyra4 {

    public static int minElement(int[] array) {
        int min = array[0];//supozojme qe elementi i pare ne varg eshte me i vogli

        //fillo prej elementit te rradhes (2-te)
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static int minimumMaNdryshe(int[] array) {
        int min = minElement(array);
        return SequentialSearch.indexOf(array, min);
    }

    public static int getMinElementOrMinElementIndex(int[] array, boolean returnIndex) {
        return returnIndex ? minimalElementIndex(array) : minElement(array);
    }

    public static int minimalElementIndex(int[] array) {
        int index = 0;

        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[index]) {
                index = i;
            }
        }
        return index;
    }

    public static int[] minElementAndIndex(int[] array) {
        int min = minElement(array);
        int index = minimalElementIndex(array);
        return new int[]{min, index};
    }

    public static Minimum minElementAndIndex2(int[] array) {
        int min = minElement(array);
        int index = minimalElementIndex(array);
        return new Minimum(min, index);
    }

    public static void main(String[] args) {
        int[] array = {89, 4, 123, 77, 54, 32, -100, -23, 12, 1, 0};
        Minimum minimum = minElementAndIndex2(array);
        System.out.println("Minimum element: " + minimum.getValue());
        System.out.println("Index of minimum element: " + minimum.getIndex());
    }

}













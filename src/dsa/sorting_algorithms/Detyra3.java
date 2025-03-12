package dsa.sorting_algorithms;

public class Detyra3 {

    public static int multiplificationOfElements(int[] array) {
        int produce = 1;

        for (int number : array) {
            produce *= number;
        }
        return produce;
    }

    public static int sumOfElements(int[] array) {
        int sum = 0;

        for (int number : array) {
            sum += number;
        }
        return sum;
    }

    public static double mesatarja(int[] array) {
        double sum = sumOfElements(array);
        return sum / array.length;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        System.out.println(sumOfElements(array));
        System.out.println(multiplificationOfElements(array));
    }
}

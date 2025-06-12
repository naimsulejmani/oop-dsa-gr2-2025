package oop.generics;

import oop.generics.db_sample.Product;

public class TypeVariableBounds {
/* <<<<<<<<<<<<<<  ✨ Windsurf Command ⭐ >>>>>>>>>>>>>>>> */
    /**
     * Example of using generic methods. Finds the minimum of an array of values.
     * @param args command line arguments, ignored
     */
/* <<<<<<<<<<  482cea9f-877b-4e92-99a2-d0f28351991f  >>>>>>>>>>> */
    public static void main(String[] args) {
        double min = min(new Double[]{1.0, 2.0, 3.0, 4.0, 5.0});
        int minInt = min(new Integer[]{1, 2, 3, 4, 5});
//        Product minProduct = min(
//                new Product[]{new Product("1", "Naim", 1.0),
//                        new Product("2", "Ronaldo", 2.0),
//                        new Product("2", "Messi", -2.0)
//                }
//        );

//        System.out.println(minProduct);
    }

    public static <T> void print(T item) {
        System.out.println(item);
    }

    public static <T extends Number> void print(T item) {

    }

    public static <T extends Comparable<T>> boolean compare(T a, T b) {
        return a.compareTo(b) > 0;
    }

    public static <T extends Comparable<T>> T min(T[] items) {
        if (items == null || items.length == 0) {
            throw new IllegalArgumentException("Array cannot be null or empty");
        }
        T min = items[0];
        for (T item : items) {
            if (item.compareTo(min) < 0) {
                min = item;
            }
        }
        return min;
    }
}

package oop.generics.db_sample;

import java.time.LocalDate;
import java.util.Arrays;

public class BubbleSortDemo {
    public static void main(String[] args) {
        String[] array = {"Naim", "Ronaldo", "Messi", "Zidane", "Beckham"};
        new BubbleSort<String>().sort(array);
        System.out.println(Arrays.toString(array));
        Integer[] integer = {5, 3, 8, 1, 2};
        new BubbleSort<Integer>().sort(integer);
        System.out.println(Arrays.toString(integer));

        Product[] products =
                new Product[]{
//                        new Product("1", "Naim", 1.0),
//                        new Product("2", "Ronaldo", 2.0),
//                        new Product("3", "Messi", -3.0)
                };
        new BubbleSort<Product>().sort(products);
        System.out.println(Arrays.toString(products));

        Consumer[] consumers = new Consumer[]{
                new Consumer(1, "Naim"),
                new Consumer(2, "Ronaldo"),
                new Consumer(3, "Messi")
        };
//        new BubbleSort<Consumer>().sort(consumers);
        System.out.println(Arrays.toString(consumers));

        LocalDate[] dates  = {
                LocalDate.of(2023, 10, 1),
                LocalDate.of(2022, 5, 15),
                LocalDate.of(2021, 12, 25)
        };
//        new BubbleSort<LocalDate>().sort(dates);
        System.out.println(Arrays.toString(dates));
    }
}

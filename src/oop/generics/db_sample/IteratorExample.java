package oop.generics.db_sample;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class IteratorExample {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
//        products.add(new Product("1", "Naim", 1.0));
//        products.add(new Product("2", "Ronaldo", 2.0));
//        products.add(new Product("3", "Messi", 3.0));

        for (Product p : products) {
            System.out.println(p);
        }

        Iterator<Product> iterator = products.iterator();

        while (iterator.hasNext()) {
            Product p = iterator.next();
            System.out.println(p);
        }

//        Scanner scanner = new Scanner(System.in);

    }
}

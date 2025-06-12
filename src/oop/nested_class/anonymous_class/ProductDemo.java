package oop.nested_class.anonymous_class;

import java.util.*;

public class ProductDemo {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product(1, "Laptop", 1500, 10));
        products.add(new Product(2, "Tablet", 500, 20));
        products.add(new Product(3, "Smartphone", 800, 15));

        Collections.sort(products, ProductSort.byStock);
        System.out.println(products);

        //Comparator<Product> byName = (p1, p2) -> p1.getName().compareTo(p2.getName());

        Comparator<Product> byName = Comparator.comparing(Product::getName);


        List<String> names = new ArrayList<>();
        names.add("Naim");
        names.add("Filan");
        names.add("Fistek");
        Collections.sort(names, String::compareTo);
    }
}

package oop.nested_class.anonymous_class;

import java.util.Comparator;

public class ProductSort {
    public static Comparator<Product> byPrice = new Comparator<Product>() {
        @Override
        public int compare(Product p1, Product p2) {
            return Double.compare(p1.getPrice(), p2.getPrice());
        }
    };

    public static Comparator<Product> byStock = new Comparator<Product>() {
        @Override
        public int compare(Product p1, Product p2) {
            return Long.compare(p1.getStock(), p2.getStock());
        }
    };

    public static Comparator<Product> byName = Comparator.comparing(Product::getName);

    public static Comparator<Product> byId = Comparator.comparingInt(Product::getId);


}

package oop.nested_class;

public class LocalInnerClass {
    public static void main(String[] args) {
        class Product {
            private String name;
            private double price;

            public Product(String name, double price) {
                this.name = name;
                this.price = price;
            }
        }

        Product product = new Product("Tablet", 500);
        Product product2 = new Product("Laptop", 1000);
        product.name = "AAAA";
    }
}

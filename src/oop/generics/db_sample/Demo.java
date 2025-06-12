package oop.generics.db_sample;

import java.util.List;

public class Demo {
    public static void main(String[] args) {
        ProductRepository repository = new ProductRepository();
//        repository.add(new Product("LPT01","Laptop i keq",160));
//        repository.add(new Product("LPT02","Laptop i mire",1600));

        List<Product> products = repository.findAll();
    }
}

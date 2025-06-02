package oop.exceptions;

public class ProductMain {
    public static void main(String[] args) throws ProductException {
        throw new ProductException("Gabim ne product");
//        throw new NullPointerException("Gabim ne product");
//        Integer.parseInt("abc");
    }
}

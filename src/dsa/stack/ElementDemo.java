package dsa.stack;

import oop.inheritance.Book;

import java.util.Scanner;

public class ElementDemo {
    public static void main(String[] args) {
        ElementInt elementInt = new ElementInt(10, null);
        ElementDouble elementDouble = new ElementDouble(20.2, null);

        Element<String> elementString = new Element<>("Naim", null);
        Element<Scanner> elementScanner = new Element<>(new Scanner(System.in), null);
        Element<Integer> elementInteger = new Element<>(20, null);
        Element<Double> elementDouble1 = new Element<>(20.2, null);
        Element<Float> elementFloat = new Element<>(2F, null);
        Element<Boolean> elementBoolean = new Element<>(false, null);
    }
}

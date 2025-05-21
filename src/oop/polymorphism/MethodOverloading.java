package oop.polymorphism;

import org.w3c.dom.ls.LSOutput;

public class MethodOverloading {
    public static void main(String[] args) {
        System.out.println(Math.abs(10F));
        test(10,23.2);
    }

    public static void test(int a, int b) {
        System.out.printf("%d => %d\n", a, b);
    }

    public static void test(double a, double b) {
        System.out.printf("%.2f => %.2f\n", a, b);
    }

    public static void test(int b, double a) {
        System.out.printf("%d => %d\n", a, b);
    }

    public static void test(double b, int a) {
        System.out.printf("%d => %d\n", a, b);
    }



}

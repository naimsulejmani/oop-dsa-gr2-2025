package oop.polymorphism;

import oop.inheritance.hr.Programmer;
import oop.inheritance.hr.ProgrammerType;

import java.time.LocalDate;

public class Test {
    public static void main(String[] args) {
        add(10, 20, 30);
        byte b = 10;
        short s = 20;


        System.out.println(multiply(b, s));

        Integer x = 10;
        Double y = 30.0;
        Programmer p = new Programmer(1, "Naim", "Sulejmani", LocalDate.now(), 1000.0, 200.0, ProgrammerType.FULLSTACK);

        print(x);
        print(y);
        print(p);
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static int mbledhiDyNumra(int a, int b) {
        return a + b;
    }

    public static int mbledhiTreNumra(int a, int b, int c) {
        return a + b + c;
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void print(Object object) {
        System.out.println(object.toString());

    }

}













package oop.generics;

import java.time.LocalDate;

public class MethodGeneric {
    public static void main(String[] args) {
        test();
        test(1);
        test(1, 2);
        test(1, 2, 3, 4, 5);
        hello(new int[]{1, 2, 3,});

        double messiDouble = getMiddle(1.0, 3.3, 5D, 6D, 7D);
        System.out.println("Messi Double: " + messiDouble);
        int messiInt = getMiddle(1, 2, 3, 4, 5);
        System.out.println("Messi Int: " + messiInt);
        String messiString = getMiddle("Naim", "Ronaldo", "Messi");
        System.out.println("Messi String: " + messiString);
        print("Naim",1,2, LocalDate.now());
    }

    //varargs
    public static <T> T getMiddle(T... items) {
        if (items.length == 0) return null;
        return items[items.length / 2];
    }

    public static <T> void print(T... items) {
        for (T item : items) {
            System.out.println(item);
        }
    }


//    public static <T,U> T getTest(U... items) {
//        return null;
//    }

    public static void hello(int[] array) {

    }

    public static void test(int... numrat) {
        //qitu sillet sikurse me kan array
        if (numrat.length == 0) {
            System.out.println("Ska asnje numer!");
            return;
        }
        for (int i = 0; i < numrat.length; i++) {
            System.out.printf("%d ,", numrat[i]);
        }
    }

    public static void palidhje(int x, String... emrat) {

    }
}

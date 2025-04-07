package oop.arrays_example;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayExample {
    private String[] elements;

    public ArrayExample() {
        elements = new String[3];
        elements[0] = "Naim";
        elements[1] = "Naime";
        elements[2] = "Naimus";

        for (int i = 0; i < elements.length; i++) {
            System.out.printf("elements[%d] = %s%n", i, elements[i]);
        }
    }

    public static void main(String[] args) {
        ArrayExample ae = new ArrayExample();
        ae.elements[1] = "Test";

        new ArrayExample();

        int[] array = new int[] {1,2,3,4};

        ArrayList list = new ArrayList();

        array[1] = 10; // me indeks bejme update elementin e vargut
        int x = array[0]; // me indeks lexojme ne varg

    }
}

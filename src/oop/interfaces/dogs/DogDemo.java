package oop.interfaces.dogs;

import java.util.Comparator;

public class DogDemo {
    public static void main(String[] args) {
        Dog  dog = new Dog();

        System.out.println(dog instanceof Dog);
        System.out.println(dog instanceof Animal);
        System.out.println(dog instanceof Pet);
        System.out.println(dog instanceof Object);
        System.out.println(dog instanceof Comparable<?>);
        System.out.println(dog instanceof Comparator<?>);
    }
}

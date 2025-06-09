package oop.interfaces.dogs;

import java.util.Comparator;

public class Dog extends Animal implements Pet, Comparable<Dog>, Comparator<Dog> {
    @Override
    public int compareTo(Dog o) {
        return (int) (Math.random() * 100) - 50;
    }

    @Override
    public int compare(Dog o1, Dog o2) {
        return 0;
    }
}

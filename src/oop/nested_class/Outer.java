package oop.nested_class;

public class Outer {
    public static class Inner {
        public void displayInner() {
            System.out.println("This is an inner class method.");
        }
    }

    private static class Node {
        public void displayNode() {
            System.out.println("This is a private static inner class method.");
        }
    }

    public static Node getNodeInstance() {
        return new Node();
    }

    public void displayOuter() {
        System.out.println("This is an outer class method.");
    }

    public Outer() {

    }
}

package oop.generics;

public class PairDemo {
    public static void main(String[] args) {
        Pair<Integer> pair1 = new Pair<>(10, 20);
        Pair<String> pair2 = new Pair<>("Naim", "Sulejmani");
        Pair<Double> pair3 = new Pair<>(10.0, 20.0);
        Pair<Boolean> pair4 = new Pair<>(true, false);
        Pair<NodeInt> pair5 = new Pair<>(new NodeInt(10), new NodeInt(20));

    }
}

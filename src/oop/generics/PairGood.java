package oop.generics;

public class PairGood<T,U> {
    private T first;
    private U second;

    public PairGood(T first, U second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public U getSecond() {
        return second;
    }

    public void setSecond(U second) {
        this.second = second;
    }

    @Override
    public String toString() {
        return "PairGood{" +
                "first=" + first +
                ", second=" + second +
                '}';
    }
}

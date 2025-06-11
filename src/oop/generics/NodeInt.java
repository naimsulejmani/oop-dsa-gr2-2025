package oop.generics;

public class NodeInt {
    private int value;
    private NodeInt next;

    public NodeInt(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public NodeInt getNext() {
        return next;
    }

    public void setNext(NodeInt next) {
        this.next = next;
    }
}

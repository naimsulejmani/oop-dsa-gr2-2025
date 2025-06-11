package oop.generics;

public class NodeFloat {
    private float value;
    private NodeFloat next;

    public NodeFloat(float value) {
        this.value = value;
    }

    public float getValue() {
        return value;
    }

    public void setValue(float value) {
        this.value = value;
    }

    public NodeFloat getNext() {
        return next;
    }

    public void setNext(NodeFloat next) {
        this.next = next;
    }
}

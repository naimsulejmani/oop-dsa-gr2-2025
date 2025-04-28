package dsa.stack;

public class ElementInt {
    private int data;
    private ElementInt next;

    public ElementInt(int data, ElementInt next) {
        this.data = data;
        this.next = next;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public ElementInt getNext() {
        return next;
    }

    public void setNext(ElementInt next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "ElementInt{" +
                "data=" + data +
                '}';
    }
}

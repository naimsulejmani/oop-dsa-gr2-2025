package dsa.stack;

public class ElementDouble {
    private double data;
    private ElementDouble next;

    public ElementDouble(double data, ElementDouble next) {
        this.data = data;
        this.next = next;
    }

    public double getData() {
        return data;
    }

    public void setData(double data) {
        this.data = data;
    }

    public ElementDouble getNext() {
        return next;
    }

    public void setNext(ElementDouble next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "ElementDouble{" +
                "data=" + data +
                '}';
    }
}

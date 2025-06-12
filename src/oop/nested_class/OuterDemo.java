package oop.nested_class;

public class OuterDemo {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.displayOuter();

        Outer.Inner inner = new Outer.Inner();
        inner.displayInner();

        var node = Outer.getNodeInstance();

    }
}

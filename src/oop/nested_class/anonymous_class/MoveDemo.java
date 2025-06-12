package oop.nested_class.anonymous_class;

public class MoveDemo {
    public static void main(String[] args) {
        Moveable moveable = new Moveable() {
            @Override
            public void move(int x, int y) {
                System.out.println("X: " + x + ", Y: " + y);
            }
        };

        moveable.move(5, 10);
        moveable.move(20, 30);
    }
}

package oop.class_summary.ushtrime;

public class SquareDemo {
    public static void main(String[] args) {
        Square square1 = new Square(4);
        Square square2 = new Square(4);

        System.out.println(square1.getArea());
        System.out.println(square1.getPerimeter());
        square1.draw();

        System.out.println(square1.hasGreaterAreaThan(square2));
    }
}

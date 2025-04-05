package oop.class_summary.detyra_20250405;

public class RectangleDemo {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(3, 5);
        Rectangle r2 = new Rectangle(2, 2);

        r1.draw();

        r1.swap();

        System.out.println("\n---------------------\n");

        r1.draw();

        System.out.println("R1 area: " + r1.getArea());
        System.out.println("R1 perimeter: " + r1.getPerimeter());
        System.out.println("R1 is square: " + r1.isSquare());

    }
}

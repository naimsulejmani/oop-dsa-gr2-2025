package oop.class_summary.ushtrime;

public class PointDemo {
    public static void main(String[] args) {
        Point pika1 = new Point(2, 4);
        Point pika2 = new Point(3, 7);
        Point pika0 = new Point();

        System.out.println(pika1.distanceTo(pika2));
        System.out.println(pika0.distanceTo(pika0));
    }
}

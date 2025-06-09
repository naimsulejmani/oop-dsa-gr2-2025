package oop.abstract_class;

public class ShapeDemo {
    public static void main(String[] args) {
        Shape shape1 = new Square(3.0);
        Shape shape2 = new Circle(3.0);
//        Shape shape3 = new Shape();

        System.out.println(shape2.getPerimeter());
        System.out.println(shape2.getArea());
        shape2.draw();
    }
}

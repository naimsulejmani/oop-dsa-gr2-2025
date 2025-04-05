package oop.class_summary.detyra_20250405;

public class Rectangle {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
//        this.length = length;
//        this.width = width;
        setLength(length);
        setWidth(width);
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length <= 0) {
            System.out.println("Nuk mund te jete nje numer zero ose negativ");
            System.out.println("Do te vendoset 1 per qellime te ushtrimit");
            this.length = 1;
            return;
        }
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width <= 0) {
            System.out.println("Nuk mund te jete nje numer zero ose negativ");
            System.out.println("Do te vendoset 2 per qellime te ushtrimit");
            this.width = 2;
            return;
        }
        this.width = width;
    }

    public double getArea() {
        return length * width;
    }

    public double getPerimeter() {
        return 2 * (length + width);
    }

    public void draw() {
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public boolean isSquare() {
        return length == width;
    }

    public void swap() {
        double temp = length;
        length = width;
        width = temp;
    }


}

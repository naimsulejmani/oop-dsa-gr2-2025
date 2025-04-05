package oop.class_summary.detyra_20250405;

public class Circle {
    private double radius = 1;

    public Circle(double radius) {
        setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius <= 0) {
            System.out.println("Nuk mund te jete zero ose negative!");
            return;
        }
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius; // Math.PI * Math.pow(radius, 2);
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public double getDiameter() {
        return 2 * radius;
    }

}









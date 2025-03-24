package oop.class_summary.ushtrime;

public class Point {
    private double x;
    private double y;

    public Point() {

    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double distanceTo(Point anotherPoint) {
        double deltaX = this.getX() - anotherPoint.getX();
        double deltaY = this.getY() - anotherPoint.getY();
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }

    public double distanceTo(double x2, double y2) {
        double deltaX = this.getX() - x2;
        double deltaY = this.getY() - y2;
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }


}














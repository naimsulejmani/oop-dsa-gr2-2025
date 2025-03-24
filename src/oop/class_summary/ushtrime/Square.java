package oop.class_summary.ushtrime;

public class Square {
    private double side = 1;

    public Square(double side) {
        setSide(side);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        if (side <=0 ) {
            System.out.println("Nuk mund te jete nje numer negativ");
            return;
        }
        this.side = side;
    }
    public double getArea() {
        return side * side;
    }

    public double  getPerimeter(){
        return 4 * side;
    }

    public void draw(){
        for (int i = 0; i < side; i++) {
            for (int j = 0; j < side; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public boolean hasGreaterAreaThan(Square other) {
        return this.getArea() > other.getArea();
    }


}




























package oop.inheritance.aviary;

public class Parrot extends FlyingBird {
    public Parrot(String call, String color, String food) {
        super(call, color, food);
    }

    public Parrot(String color) {
        super("Squawk", color, "fruits");
    }

    @Override
    public String toString() {
        return "Parrot{" + super.toString() + "}";
    }
}

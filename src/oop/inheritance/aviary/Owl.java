package oop.inheritance.aviary;

public class Owl extends FlyingBird {
    public Owl(String call, String color) {
        super(call, color, "mice");
    }

    @Override
    public String toString() {
        return "Owl{" + super.toString() + "}";
    }
}

package oop.inheritance.aviary;

public class Goose extends WalkingBird {
    public Goose() {
        super("Honk", "White", "Grains");
    }

    public Goose(String color) {
        super("Honk", color, "Grains");
    }

    @Override
    public String toString() {
        return "Goose{" + super.toString() + "}";
    }
}

package oop.inheritance.aviary;

public class Ostrich extends WalkingBird {
    public Ostrich() {
        super("neek-neek", "brown", "grass");
    }

    public Ostrich(String color) {
        super("neek-neek", color, "grass");
    }

    @Override
    public String toString() {
        return "Ostrich{" + super.toString() + "}";
    }
}

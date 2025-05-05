package oop.inheritance.aviary;

public class FlyingBird extends Bird {
    public FlyingBird(String call, String color, String food) {
        super(call, color, food, Movement.FLEW);
    }

    @Override
    public String toString() {
        return "FlyingBird{" + super.toString() + "}";
    }
}

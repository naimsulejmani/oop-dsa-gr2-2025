package oop.inheritance.aviary;

public class WalkingBird extends Bird {

    public WalkingBird(String call, String color, String food) {
        super(call, color, food, Movement.WALKED);
    }

    @Override
    public String toString() {
        return "WalkingBird{" + super.toString() + "}";
    }
}

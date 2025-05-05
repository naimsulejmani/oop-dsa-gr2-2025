package oop.inheritance.aviary;

public class Bird {
    private String call;
    private String color;
    private String food;
    private Movement movement;

    public Bird(String call, String color, String food, Movement movement) {
        this.call = call;
        this.color = color;
        this.food = food;
        this.movement = movement;
    }

    public String getCall() {
        return call;
    }

    public void setCall(String call) {
        this.call = call;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public Movement getMovement() {
        return movement;
    }

    public void setMovement(Movement movement) {
        this.movement = movement;
    }

    @Override
    public String toString() {
        return "Bird{" +
                "call='" + call + '\'' +
                ", color='" + color + '\'' +
                ", food='" + food + '\'' +
                ", movement=" + movement +
                '}';
    }
}












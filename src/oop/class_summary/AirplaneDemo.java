package oop.class_summary;

public class AirplaneDemo {
    public static void main(String[] args) {
        Airplane boeing747 = new Airplane();
        boeing747.setMaxSpeed(3500);
        System.out.println(boeing747.getMaxSpeed());
    }
}

package oop.class_summary;

public class Airplane {
    // variblat instance
    private double maxSpeed;

    public double getMaxSpeed() {
        if (maxSpeed <= 500) return 500;
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        if (maxSpeed >= 500 && maxSpeed <= 3000) {
            this.maxSpeed = maxSpeed;
        } else {
            System.out.println("Invalid max speed");
            System.out.println("Will use default max-speed 500!");
        }
    }
}

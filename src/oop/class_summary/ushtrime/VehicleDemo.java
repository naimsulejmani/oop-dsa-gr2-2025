package oop.class_summary.ushtrime;

public class VehicleDemo {
    public static void main(String[] args) {
        Vehicle bmw = new Vehicle("BMW", "X5", 2020);
        Vehicle mercedes = new Vehicle("Mercedes", "C-Class", 2018);

        System.out.println(bmw.getAge());
        System.out.println(mercedes.getAge());
    }
}

package oop.class_summary.ushtrime;

import java.time.LocalDate;

public class Vehicle {
    private final static int MIN_YEAR = 1900;
    private String brand;
    private String model;
    private int yearProduced;

    public Vehicle(String brand, String model, int yearProduced) {
        this.brand = brand;
        this.model = model;
        setYearProduced(yearProduced);
    }

    public Vehicle() {

    }


    private void setYearProduced(int yearProduced) {
        if (yearProduced < MIN_YEAR) {
            System.out.println("Year produced cannot be less than " + MIN_YEAR);
            return;
        } else if (yearProduced > LocalDate.now().getYear()) {
            System.out.println("Year produced cannot be greater than the current year");
            return;
        }
        this.yearProduced = yearProduced;

    }


    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYearProduced() {
        return yearProduced;
    }

    public int getAge() {
        return LocalDate.now().getYear() - yearProduced;
    }

    // new Vehicle().getAge();
    // new Vehicle("Toyota", "Corolla", 1880).getAge();
}







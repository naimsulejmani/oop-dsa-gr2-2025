package oop.provimi;

public class Car {
    private String vin;
    private String model;
    private int fuelCapacity;
    private double price;
    private String color;
    private Tire[] tires;


    public Car(String vin, String model, int fuelCapacity, double price, String color, Tire[] tires)
    throws SomeWheelsNotFoundException, LimitExceedException {
        setVin(vin);
        this.model = model;
        setFuelCapacity(fuelCapacity);
        this.price = price;
        this.color = color;
        if (tires == null ) {
            throw new IllegalArgumentException("Invalid number of tires. It must be between 4 and 6.");
        } else if (tires.length <4) {
            throw new SomeWheelsNotFoundException("Invalid number of tires. It must be at least 4.");
        }
        this.tires = tires;
    }

    //te shtohet metoda qe shikon se a ki gume rezerve
    public boolean hasReseveTire() {
        return tires.length == 5;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        if (vin == null || vin.isBlank() || vin.trim().length() != 17) {
            throw new IllegalArgumentException("Invalid VIN number. It must be 17 characters long.");
        }
        this.vin = vin;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(int fuelCapacity) throws LimitExceedException {
        if (fuelCapacity < 30) {
            throw new IllegalArgumentException("Invalid fuel capacity. It must be between 30 and 80.");
        } else if(fuelCapacity > 80) {
            throw new LimitExceedException("Keni kaluar kufirin e lejuar");
        }
        this.fuelCapacity = fuelCapacity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        return String.format("Car{vin='%s', model='%s', fuelCapacity=%d, price=%.2f, color='%s'}",
                vin, model, fuelCapacity, price, color);
    }

    public void increasePrice(double percentage) {
        this.price += this.price * (percentage / 100);
    }
}

package oop.provimi;

public class Tire {
    private TireType type;
    private int diameter;
    private String brand;

    public Tire(TireType type, int diameter, String brand) {
        this.type = type;
        this.diameter = diameter;
        this.brand = brand;
    }

    public TireType getType() {
        return type;
    }

    public void setType(TireType type) {
        this.type = type;
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return String.format("Tire Type: %s\nDiameter: %d\nBrand: %s", type, diameter, brand);
    }
}

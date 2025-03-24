package oop.class_summary.ushtrime;

public class Temperature {
    private final static int MIN_TEMP = -100;
    private final static int MAX_TEMP = 100;

    private double value;

    public Temperature() {

    }

    public Temperature(double valueInCelcius) {
        this.value = valueInCelcius;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        if (value < MIN_TEMP || value > MAX_TEMP) {
            System.out.println("Nuk lejohen vlera jashta normales -100 dhe 100.");
            System.out.println("Temperatura do te vendoset ne 0. Celcius");
            return;
        }
        this.value = value;
    }

    public double toFahrenheit() {
        return value * 1.8 + 32; // return value * 9.0 /5 + 32;
    }

    public double toKelvin() {
        return value + 273.15;
    }

    public void fromKelvin(double kelvin) {
        double celsius = kelvin - 273.15;
        setValue(celsius);
    }

    public void fromFahrenheit(double fahrenheit) {
        double celsius = (fahrenheit - 32) * 5 / 9;
        setValue(celsius);
    }
}












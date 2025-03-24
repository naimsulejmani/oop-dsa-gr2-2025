package oop.class_summary.ushtrime;

public class TemperatureDemo {
    public static void main(String[] args) {
        Temperature tempPrishtine = new Temperature(17);
        System.out.println(tempPrishtine.toFahrenheit());
        System.out.println(tempPrishtine.toKelvin());

        Temperature losAngelesTemp = new Temperature();
        losAngelesTemp.fromFahrenheit(77.7);
        System.out.println(losAngelesTemp.getValue());
        System.out.println(losAngelesTemp.toKelvin());
    }
}

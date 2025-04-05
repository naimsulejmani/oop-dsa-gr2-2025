package oop.enums.ushtrime;

public class MemoryUnitsDemo {
    public static void main(String[] args) {

        MemoryUnits m1 = MemoryUnits.KILOBYTES;

        System.out.println(m1.getKilobytes());
        System.out.println(MemoryUnits.MEGABYTES.getKilobytes());


    }
}

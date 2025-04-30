package oop.inheritance;

public class LaptopDemo {
    public static void main(String[] args) {
        Laptop l1 = new Laptop();
        System.out.println(l1.toString());

        GamingLaptop g1 = new GamingLaptop();
        System.out.println(g1.toString());
        g1.test();
    }
}

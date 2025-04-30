package oop.inheritance;

public class Laptop {

    public Laptop() {
        super();
    }

    @Override
    public String toString() {
        return "Laptopi";
    }


    public final void test() {
        System.out.println("TEST");
        System.out.println(this);
        System.out.println(toString());
        System.out.println(this.toString());
        System.out.println(super.toString());
//        System.out.println(equals(this));
    }
}

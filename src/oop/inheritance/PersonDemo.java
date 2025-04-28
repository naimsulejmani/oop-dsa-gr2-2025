package oop.inheritance;

public class PersonDemo {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.setId(1);
        p1.setName("Filan fisteku");

        Person p2 = new Person(2, "Naim Sulejmani");
    }
}

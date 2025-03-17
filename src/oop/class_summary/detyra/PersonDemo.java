package oop.class_summary.detyra;

public class PersonDemo {
    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person("Naim Sulejmani", 18, "m");

        person1.whoIAm();

        person2.whoIAm();

        System.out.println("Are you teeneger: " + person2.isTeenager());
        System.out.println("Are you retired: " + person2.isRetired());
    }
}

package oop.inheritance;


public class PatientDemo {
    public static void main(String[] args) {
        Patient p1 = new Patient();
        Patient p2 = new Patient();
        p1.setId(1);
        p1.setName("Naim Sulejmani");
        System.out.println(p1);
    }
}

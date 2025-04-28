package oop.associations.spitali;

import java.time.LocalDateTime;

public class HospitalDemo {
    public static void main(String[] args) {
        Hospital emergjenca = new Hospital(1, "QKMF 1", "Prishtine - Dardani");
        Doctor doctor1 = new Doctor(1, "Naim Sulejmani", "Pergjithshem");
        Patient patient1 = new Patient(1, "Avdi Shabani");

        Therapy therapy = new Therapy(emergjenca, patient1, doctor1,
                "Pak kupa prof!", LocalDateTime.now(),
                "Ja leshon reali najnjo me fitu!");

        System.out.println(therapy);

    }
}

package oop.class_summary.ushtrime;

import java.time.LocalDate;

public class Person {
    private long personalNo;
    private String name;
    private String surname;
    private LocalDate birthdate;
    private char gender;

    public Person(long personalNo, String name, String surname, LocalDate birthdate, char gender) {
        this.personalNo = personalNo;
        this.name = name;
        this.surname = surname;
        this.birthdate = birthdate;
        this.gender = gender;
    }

    public long getPersonalNo() {
        return personalNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        name = name.trim();
        if (!name.isBlank() && name.length() >= 2) {
            this.name = name;
        }

    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        if (birthdate.isAfter(LocalDate.now())) {
            System.out.println("Invalid date");
            return;
        }
        this.birthdate = birthdate;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        if (gender != 'M' && gender != 'F') {
            System.out.println("Invalid gender");
            return;
        }
        this.gender = gender;
    }
}

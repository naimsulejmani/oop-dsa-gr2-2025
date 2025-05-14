package oop.inheritance.hr;

import java.time.LocalDate;

public class Employee {
    private long id;
    private String name;
    private String surname;
    private LocalDate birthdate;

    public Employee() {

    }

    public Employee(long id, String name, String surname, LocalDate birthdate) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.birthdate = birthdate;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
        this.birthdate = birthdate;
    }

    public double pay() {
        return 300.0;
    }

    @Override
    public String toString() {
        return String.format("""
                ID: %d
                Emri: %s
                Mbiemri: %s
                Birthdate: %s
                """, id, name, surname, birthdate);
    }
}

package oop.arrays_example.fifa;

import java.time.LocalDate;

public class Player {
    private static long nextId = 1;

    private final long id;
    private String name;
    private String surname;
    private LocalDate birthdate;
    private String country;
    private String club;
    private boolean active = true;
    private char gender;
    private Position position;

    public Player(String name, String surname, LocalDate birthdate, String country, String club, char gender, Position position) {
        this.name = name;
        this.surname = surname;
        this.birthdate = birthdate;
        this.country = country;
        this.club = club;
        this.gender = gender;
        this.position = position;
        this.id = nextId++;
    }

    public Player(String name, String surname, LocalDate birthdate, String country, String club, char gender) {
        this(name, surname, birthdate, country, club, gender, null);
    }

    public long getId() {
        return id;
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

        if (birthdate.isAfter(LocalDate.now())) {
            System.out.println("Ky lojtar akoma nuk ka lindur!");
            return;
        } else if (birthdate.isAfter(LocalDate.now().minusYears(5))) {
            System.out.println("Nuk mundet me regjistru pa i bere 5 vjet te plota e disa sekonda!");
            return;
        }

        this.birthdate = birthdate;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getClub() {
        return club;
    }

    public void setClub(String club) {
        this.club = club;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "Player{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", birthdate=" + birthdate +
                ", country='" + country + '\'' +
                ", club='" + club + '\'' +
                ", active=" + active +
                ", gender=" + gender +
                ", position=" + position +
                '}';
    }
}



















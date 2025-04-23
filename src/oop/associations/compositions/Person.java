package oop.associations.compositions;

public class Person {
    private String name;
    private String surname;
    private Date birthdate = new Date(2000, 1, 1);

    public Person(String name, String surname, Date birthdate) {
        setName(name);
        setSurname(surname);
        setBirthdate(birthdate);
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

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        if (birthdate == null)
            return;
        this.birthdate = birthdate;
    }
}

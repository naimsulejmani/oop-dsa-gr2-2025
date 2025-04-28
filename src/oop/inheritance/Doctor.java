package oop.inheritance;

public class Doctor extends Person {
    private String speciality;

    public Doctor() {
        //constructor default
    }

    public Doctor(int id, String name, String speciality) {
        super(id, name);
        this.speciality = speciality;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "speciality='" + speciality + '\'' +
                ", person=" + super.toString() +
                '}';
    }
}

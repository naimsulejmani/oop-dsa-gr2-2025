package oop.inheritance.hr;

import java.time.LocalDate;

public class Manager extends SalariedEmployee {

    public Manager(long id, String name, String surname, LocalDate birthdate, double salary, double bonus) {
        super(id, name, surname, birthdate, salary, bonus);
    }

    @Override
    public String toString() {
        return String.format("""
                %s
                Position: Manager
                """, super.toString());
    }
}

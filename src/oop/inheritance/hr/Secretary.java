package oop.inheritance.hr;

import java.time.LocalDate;

public class Secretary extends HourlyEmployee {
    public Secretary(long id, String name, String surname, LocalDate birthdate, double hourlyRate, double hoursWorked) {
        super(id, name, surname, birthdate, hourlyRate, hoursWorked);
    }

    @Override
    public String toString() {
        return String.format("""
                %s
                Position: Secretary
                """, super.toString());
    }
}

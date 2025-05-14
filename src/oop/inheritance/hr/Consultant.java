package oop.inheritance.hr;

import java.time.LocalDate;

public class Consultant extends HourlyEmployee{
    public Consultant(long id, String name, String surname, LocalDate birthdate, double hourlyRate, double hoursWorked) {
        super(id, name, surname, birthdate, hourlyRate, hoursWorked);
    }

    @Override
    public String toString() {
        return String.format("""
                %s
                Position: Consultant
                """, super.toString());
    }
}

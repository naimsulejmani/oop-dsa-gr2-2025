package oop.inheritance.hr;

import java.time.LocalDate;

public class Programmer extends SalariedEmployee {
    private ProgrammerType type;

    public Programmer(long id, String name, String surname, LocalDate birthdate, double salary, double bonus, ProgrammerType type) {
        super(id, name, surname, birthdate, salary, bonus);
        this.type = type;
    }

    public ProgrammerType getType() {
        return type;
    }

    public void setType(ProgrammerType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return String.format("""
                %s
                Position: Programmer
                Type: %s
                """, super.toString(), type);
    }
}



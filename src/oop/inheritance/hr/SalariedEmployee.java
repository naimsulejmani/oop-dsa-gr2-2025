package oop.inheritance.hr;

import java.time.LocalDate;

public class SalariedEmployee extends Employee {
    private double salary;
    private double bonus;

    public SalariedEmployee(long id, String name, String surname, LocalDate birthdate, double salary, double bonus) {
        super(id, name, surname, birthdate);
        this.salary = salary;
        this.bonus = bonus;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public double pay() {
        return salary + bonus;
    }

    @Override
    public String toString() {
        return String.format("""
                %s
                Salary: %.2f EUR
                Bonus: %.2f EUR
                Total: %.2f EUR
                """, super.toString(), salary, bonus, pay());
    }
}

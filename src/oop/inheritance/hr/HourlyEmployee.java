package oop.inheritance.hr;

import java.time.LocalDate;

public class HourlyEmployee extends Employee {
    private double hourlyRate;
    private double hoursWorked;

    public HourlyEmployee(long id, String name, String surname, LocalDate birthdate, double hourlyRate, double hoursWorked) {
        super(id, name, surname, birthdate);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }


    @Override
    public double pay() {
        return hourlyRate * hoursWorked;
    }

    @Override
    public String toString() {
        return String.format("""
                %s
                Hourly Rate: %.2f EUR
                Hours Worked: %.2f
                Total:        %.2f EUR
                """, super.toString(), hourlyRate, hoursWorked, pay());


    }
}










package oop.inheritance.hr;

import java.time.LocalDate;

public class EmployeeDemo {
    public static void main(String[] args) {
        Employee employee = new Programmer(1, "Avdi", "Shabani",
                LocalDate.of(2006, 1, 1), 500, 0.50, ProgrammerType.FULLSTACK);
        Employee employee2 = new Consultant(2, "Vjosa", "Qorri",
                LocalDate.of(2003, 3, 3), 15, 100);


        new PayCheck(1,2025,employee2).print();
    }
}

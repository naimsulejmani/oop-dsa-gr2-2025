package oop.inheritance.hr;

import dsa.arrays_example.ArrayListDemo;

import java.time.LocalDate;
import java.util.ArrayList;

public class PayrollGenerator {

    public static void generatePayments(int month, int year) {
        System.out.println("Generating payments for month: " + month + ", year: " + year);
        // Logic to generate payments
        // This could involve iterating over employees, calculating their salaries,
        // and generating payment records.

        String employeesAsCsv = """
                1,Naim,Sulejmani,Consultant,1986-12-16,10,15
                2,Priam,Zogu,Secretary,2006-05-05,10,7.5
                3,Vjosa,Qorri,Manager,2005-01-01,1000,500
                4,Njomza,Terstena,Programmer,1989-07-07,FRONTEND,1500,250
                """;


        ArrayList<Employee> employees = new ArrayList<>();

        String employeesRows[] = employeesAsCsv.split("\n");
        for (String employeeRow : employeesRows) {

            String[] employeeColumns = employeeRow.split(",");
            long id = Long.parseLong(employeeColumns[0].trim());
            String name = employeeColumns[1].trim();
            String surname = employeeColumns[2].trim();
            String position = employeeColumns[3].trim().toLowerCase();
            LocalDate birthDate = LocalDate.parse(employeeColumns[4].trim());

            switch (position) {
                case "consultant", "secretary" -> {
                    double hoursWorked = Double.parseDouble(employeeColumns[5].trim());
                    double hourlyRate = Double.parseDouble(employeeColumns[6].trim());
                    if (position.equals("consultant")) {
                        Consultant consultant = new Consultant(id, name, surname, birthDate, hourlyRate, hoursWorked);
                        employees.add(consultant);
                    } else {
                        Secretary secretary = new Secretary(id, name, surname, birthDate, hourlyRate, hoursWorked);
                        employees.add(secretary);
                    }
                }
                case "manager" -> {
                    double salary = Double.parseDouble(employeeColumns[5].trim());
                    double bonus = Double.parseDouble(employeeColumns[6].trim());
                    Manager manager = new Manager(id, name, surname, birthDate, salary, bonus);
                    employees.add(manager);
                }
                case "programmer" -> {
                    ProgrammerType type = ProgrammerType.valueOf(employeeColumns[5].trim().toUpperCase());
                    double salary = Double.parseDouble(employeeColumns[6].trim());
                    double bonus = Double.parseDouble(employeeColumns[7].trim());
                    Programmer programmer = new Programmer(id, name, surname, birthDate, salary, bonus, type);
                    employees.add(programmer);
                }
                default -> {
                    System.out.println("Unknown position: " + position);
                }
            }
        }
        for (Employee employee : employees) {
            new PayCheck(month, year, employee).print();
            System.out.println("\n\n");
        }


    }
}







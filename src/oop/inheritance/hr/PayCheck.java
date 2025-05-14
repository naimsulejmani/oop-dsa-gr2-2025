package oop.inheritance.hr;

import java.time.LocalDateTime;

public class PayCheck {
    private static int nextId = 1;
    private final int id;
    private int month;
    private int year;
    private Employee employee;
    private final LocalDateTime issueDate;


    public PayCheck(int month, int year, Employee employee) {
        this.month = month;
        this.year = year;
        this.employee = employee;
        this.issueDate = LocalDateTime.now();
        this.id = nextId++;
    }

    public int getId() {
        return id;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public LocalDateTime getIssueDate() {
        return issueDate;
    }

    public void print() {
        System.out.printf("""
                Paycheck ID: %d
                Month: %d
                Year: %d
                Employee: #%d %s %s
                Issue Date: %s
                Amount: %.2f EUR
                """, id, month, year,
                employee.getId(), employee.getName(), employee.getSurname(),
                issueDate, employee.pay());
    }
}











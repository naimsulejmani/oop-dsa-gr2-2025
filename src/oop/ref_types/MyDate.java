package oop.ref_types;

public class MyDate {
    private int day = 1;
    private int month = 1;
    private int year = 1900;

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if (day < 1 || day > 31) {
            System.out.println("Dita duhet te jete ne intervalin 1-31");
            return;
        }
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if (month < 1 || month > 12) {
            System.out.println("Muaji duhet te jete ne intervalin 1-12");
            return;
        }
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year < 1900 || year > 2100) {
            System.out.println("Viti duhet te jete ne intervalin 1900-2100");
            return;
        }
        this.year = year;
    }

    @Override
    public String toString() {
        return String.format("%02d/%02d/%04d", day, month, year);
    }
}










package oop.class_summary;

public class CacttusDate {
    private int day;
    private int month;
    private int year;


    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if (day < 1 || day > 31) {
            System.out.println("Nuk eshte nje dite e vlefshme");
            return;
        }
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if (month < 1 || month > 12) {
            System.out.println("Nuk eshte nje muaj i vlefshem");
            return;
        }
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year < 1) {
            System.out.println("Nuk eshte nje vit i vlefshem");
            return;
        }
        this.year = year;
    }

    public void print() {
        System.out.printf("%d.%d.%d%n", day, month, year);
    }
}












package dsa.adts;

public class Date implements Comparable<Date> {

    private int year = 1900;
    private int month = 1;
    private int day = 1;

    public Date(int year, int month, int day) {
        setYear(year);
        setMonth(month);
        setDay(day);
    }

    //YYYY-MM-DD -> YYYYMMDD
    public Date(String date) {
        String[] dateParts = date.split("-");
        if (dateParts.length != 3) {
            System.out.println("Date format is not valid");
            return;
        }

        int year = Integer.parseInt(dateParts[0]);
        int month = Integer.parseInt(dateParts[1]);
        int day = Integer.parseInt(dateParts[2]);
        setYear(year);
        setMonth(month);
        setDay(day);

    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return String.format("%04d-%02d-%02d", year, month, day);
    }

    /*
    vlere <0 -> this eshte me i vogel se other
    vlere >0 -> this eshte me i madh se other
    vlere =0 -> this eshte i barabarte me other
     */
    @Override
    public int compareTo(Date o) {
        if (this.year != o.year) {
            return o.year - this.year;
        } else if (this.month != o.month) {
            return o.month - this.month;
        }
        return o.day - this.day;
    }


    @Override
    public boolean equals(Object obj) {
        Date o = (Date)obj;
        return compareTo(o) == 0;
    }
}

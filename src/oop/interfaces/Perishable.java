package oop.interfaces;

import java.time.Period;

public interface Perishable {
    //konstanta
    Period MAX_PERIOD = Period.ofDays(30); //public static final

    //metodat abstracte pa trup
    void perish(); //public abstract

    boolean isPerished(); //public abstract

    //metoda te implementuara
    //default methods
    default boolean verifyPeriod(Period period) {
        return comparePeriod(period) <= 0;
    }

    private int comparePeriod(Period period) {
        return period.getDays() - MAX_PERIOD.getDays();
    }

    static int getMaxDays() {
        return MAX_PERIOD.getDays();
    }


}

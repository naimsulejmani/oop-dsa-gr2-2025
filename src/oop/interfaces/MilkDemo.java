package oop.interfaces;

import java.time.Period;
import java.util.List;

public class MilkDemo {
    public static void main(String[] args) {
        Object o = new Milk();
        Perishable p = new Milk();
        System.out.println(p.isPerished());
        p.perish();
        System.out.println(p.isPerished());

        System.out.println(p.verifyPeriod(Period.ofDays(40)));
        System.out.println(Perishable.getMaxDays());
        System.out.println(Perishable.MAX_PERIOD);


    }
}

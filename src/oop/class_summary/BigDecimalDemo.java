package oop.class_summary;

import java.math.BigDecimal;

public class BigDecimalDemo {
    public static void main(String[] args) {
        BigDecimal nr1 = new BigDecimal("9999999999999999999999999999999999999999.5");
        BigDecimal nr2 = new BigDecimal("1100000000000000000000000000000000000000000000000000000000000000000000.5");


        if(nr1.compareTo(nr2)>0) {
            return;
        }

        System.out.println(nr1.add(nr2));
        System.out.println(nr1.multiply(nr2));

    }
}

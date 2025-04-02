package oop.enums;


import java.util.Scanner;

public class EnumSwitch {
    public static void main(String[] args) {
        System.out.println("Vlersone profen Naim!");
        for (Rating rating : Rating.values()) {
            System.out.printf("Zgjedh %d - per %s%n", rating.ordinal(), rating.getStars());
        }
        System.out.println("Perzgjedhja: ");
        Scanner reader = new Scanner(System.in);
        int ratingId = reader.nextInt();

        Rating profaRating = Rating.values()[ratingId];

        switch (profaRating) {
            case ZERO -> System.out.println("INATI JA PASKIT PROFES!");
            case ONE, TWO, THREE -> System.out.println("Prof shko ne shtepi se duhet met zevendesu ");
            case FOUR -> System.out.println("QITU JE PROF MOS E LUEJ");
            case FIVE -> System.out.println("PO TA BOJM QEJFIN PROFE");
        }

    }
}

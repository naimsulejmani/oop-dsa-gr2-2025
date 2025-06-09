package oop.abstractions;

public abstract class Wrestler {

    public void paymentForWork(int hours) {
        System.out.println("Payment for " + hours + " hours of work is: " + hours * 250);
    }

    public abstract void themeMusic();

    public abstract void finisher();
}

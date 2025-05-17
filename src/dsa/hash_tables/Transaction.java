package dsa.hash_tables;

import java.nio.DoubleBuffer;
import java.time.LocalDate;

public class Transaction implements Comparable<Transaction> {
    private String who;
    private LocalDate when;
    private double amount;

    public Transaction(String who, LocalDate when, double amount) {
        this.who = who;
        this.when = when;
        this.amount = amount;
    }

    public String getWho() {
        return who;
    }

    public void setWho(String who) {
        this.who = who;
    }

    public LocalDate getWhen() {
        return when;
    }

    public void setWhen(LocalDate when) {
        this.when = when;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public int compareTo(Transaction o) {
        if (Double.compare(this.amount, o.amount) != 0) {
            return Double.compare(this.amount, o.amount);
        } else {
            if (!this.when.isEqual(o.when)) {
                return this.when.compareTo(o.when);
            }
            return this.who.compareTo(o.who);
        }
    }


    @Override
    public int hashCode() {
        int hash = 17; // prime number
        hash = 31 * hash + who.hashCode();
        hash = 31 * hash + when.hashCode();
        hash = 31 * hash + Double.hashCode(amount);
        return hash;
    }


    @Override
    public boolean equals(Object obj) {
        return this.hashCode() == obj.hashCode();
    }

    @Override
    public String toString() {
        return "Transaction{" +
               "who='" + who + '\'' +
               ", when=" + when +
               ", amount=" + amount +
               '}';
    }
}

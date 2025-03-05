package oop.introduction;

public class BankAccount {

    private String name;
    private double balance;
    private String bankName;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String BankName) {
        this.bankName = BankName;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Nuk mund te vendosni vlere negative");
        }
    }

    public void withdraw(double amount) {
        if (amount < 0 || amount > balance) {
            System.out.println("Nuk mund te vendosni vlere negative");

        } else {
            balance -= amount;
        }
    }

    public void print() {
        System.out.printf("%s ka %.2f EUR ne banken %s %n", name, balance, bankName);
    }

}













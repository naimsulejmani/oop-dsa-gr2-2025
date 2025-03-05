package oop.introduction;

public class Account {
    //variabla instance, data-attribute, data field
    private String name;
    private double balance;


    //cdo variable instance mundet me pas metodat GET dhe SET
    // GET per te lexuar vleren e variables instance
    // SET per te ndryshuar vleren e variables instance


    public void setName(String _name) {
        name = _name;
    }

    public String getName() {
        return name;
    }

    public void setBalance(double balance) {
        if(balance < 0){
            System.out.println("Nuk mund te vendosni vlere negative");
            return;
        }
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }


}










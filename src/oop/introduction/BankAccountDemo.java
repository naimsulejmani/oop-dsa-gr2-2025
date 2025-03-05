package oop.introduction;

public class BankAccountDemo {

    public static void main(String[] args) {
        BankAccount account1 = new BankAccount();

        account1.setName("Gjergj");
        account1.setBankName("BANKA");
        account1.deposit(200.00);
        account1.withdraw(300.00);
        account1.withdraw(100.00);


        //        System.out.println(account1.getName() + " ka " + account1.getBalance() + " ne " + account1.getBankName());
        account1.print();

        BankAccount account2 = new BankAccount();
        account2.setName("Haxhia");
        account2.setBankName("Turkish Economy Bankisi");
        account2.deposit(1_000_000.00);
        account2.withdraw(300_000);
        account2.print();


    }
}









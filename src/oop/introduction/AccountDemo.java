package oop.introduction;

public class AccountDemo {
    public static void main(String[] args) {
        //krijimi i objektit rregullat
        //DataType emriVariables = new DataType();

        Account account1 = new Account();
        Account account2 = new Account();
        account1.setName("Gjergj");
        account2.setName("Luan");

        account1.setBalance(100);
        account2.setBalance(500);
        account2.setBalance(-100);

        System.out.println(account1.getName() + " ka " + account1.getBalance() + " euro ne llogari");
        System.out.println(account2.getName() + " ka " + account2.getBalance() + " euro ne llogari");

    }
}

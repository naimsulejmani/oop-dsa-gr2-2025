package dsa.hash_tables;

import java.time.LocalDate;

public class TransactionDemo {
    public static void main(String[] args) {
        Transaction t1 = new Transaction("Naim", LocalDate.of(2000,1,1),1000);
        Transaction t2 = new Transaction("Naim", LocalDate.of(2000,1,1),1000);

        System.out.println(t1.hashCode());
        System.out.println(t2.hashCode());

        System.out.println(t1.equals(t2));
        /*
        149928006
        713338599
        false

         */
    }
}

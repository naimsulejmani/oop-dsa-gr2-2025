package dsa.adts;

import java.time.LocalDate;

public class Example2 {

//    public void test();
//    public int shuma(int a, int b);
    public static void main(String[] args) {
        int shuma = sum(5, 20);
        System.out.println("Shuma eshte: " + shuma);

        LocalDate data = LocalDate.now();
        System.out.println(data.plusDays(30));
    }

    public static int sum(int a, int b) {
        return a + b;
    }
}

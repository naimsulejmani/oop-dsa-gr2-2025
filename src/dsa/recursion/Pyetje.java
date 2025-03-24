package dsa.recursion;

import java.util.Scanner;

public class Pyetje {
    static Scanner reader = new Scanner(System.in);

    static void aPoKuptoni(String pergjigja) {
        if (pergjigja.equalsIgnoreCase("po")) {
            System.out.println("ME NE FUND dicka murret vesh!");
            return;
        }
        System.out.println("Profa e sqaron lenden perseri 10 minuta!");
        System.out.println("A po kuptoni more: ");
        aPoKuptoni(reader.nextLine());
    }

    public static void main(String[] args) {
        aPoKuptoni("JO");
    }
}

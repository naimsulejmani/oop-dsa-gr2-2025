package oop.enums;

import java.util.Scanner;

public class VlersimiDemo {
    public static void main(String[] args) {
        System.out.println("Versimi per nxenesin X");

        for (Vlersimi vlersimi : Vlersimi.values()) {
            System.out.printf("Zgjedh %d - per %s%n", vlersimi.ordinal()+1, vlersimi.getPershkrimi());
        }
        System.out.println("Perzgjedhja: ");
        Scanner reader = new Scanner(System.in);
        int nota = reader.nextInt();
        Vlersimi vlersimi = Vlersimi.values()[nota-1];

        switch (vlersimi) {
            case DOBET -> System.out.println("Nxenesi e perserit vitin!");
            case SHKELQYESHEM -> System.out.println("Nxenesi ka shkelqyer!");
            default -> System.out.println("Nxenesi ka kaluar me sukses!");
        }






    }
}

package oop.arrays_example.fifa;

import java.time.LocalDate;
import java.util.Scanner;

public class PlayerDemo {


    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        Actions actions = null;

        //perderisa shfrytezuesi nuk e zgjedh vetvetiu me dal nga programi, hin ne loop
        do {
            showMenu();
            int actionId = Integer.parseInt(reader.nextLine());

            if (actionId < 0 || actionId >= Actions.values().length) {
                System.out.println("Opsioni i zgjedhur nuk ekziston!");
                continue;
            }
            actions = Actions.values()[actionId];


        } while (actions != Actions.EXIT);

        System.out.println("GYLE GYLE!");

    }


    public static void showMenu() {
        System.out.println("Lista me opsione:");
        System.out.println("-------------------------------------------------------");
        for (Actions action : Actions.values()) {
            System.out.printf("Shkruaj %d -> per te %s%n", action.ordinal(), action);
        }
        System.out.println("-------------------------------------------------------");
        System.out.print("Zgjedh opsionin: ");
    }
}











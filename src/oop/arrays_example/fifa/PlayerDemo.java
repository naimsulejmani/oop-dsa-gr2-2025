package oop.arrays_example.fifa;

import java.time.LocalDate;
import java.util.Arrays;
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

            switch (actions) {
                case REGISTER -> register(reader);
                case UPDATE -> update(reader);
                case DELETE -> delete(reader);
                case CLEAR -> clear(reader);
                case TRANSFER -> transfer(reader);
                case FIND -> find(reader);
                case FIND_ALL -> findAll();
                case RETIRE -> retire(reader);
                default -> {
                    System.out.println("OOO SHKOOO, SHKOOO E MOS U KTHEEE");
                }
            }


        } while (actions != Actions.EXIT);

        System.out.println("GYLE GYLE!");

    }

    private static void retire(Scanner reader) {
        System.out.println("Welcome to Retire Player Menu");
        System.out.println("--------------------");
        PlayerService.printAllPlayers();
        System.out.print("Select id of the player that you want to retire: ");
        long id = Long.parseLong(reader.nextLine());

        Player player = PlayerService.findPlayerById(id);
        if (player == null) {
            System.out.println("Player with id " + id + " not found!");
            return;
        }
        System.out.println("A je i sigurte se deshironi te retire lojtarin: \n" + player);
        System.out.print("YES - per po, Cfaredo tjeter per JO...: ");
        String answer = reader.nextLine();

        if (!answer.equalsIgnoreCase("yes")) {
            System.out.println("E MORE PISHMANLI!!!");
            return;
        }
        player.setActive(false);
        System.out.println("Player with id " + id + " retired successfully!");


    }

    private static void findAll() {
        //how to clear all console to start from the begining
//        System.out.print("\033[H\033[2J");
//        System.out.flush();
        PlayerService.printAllPlayers();
    }

    private static void find(Scanner reader) {

    }

    private static void transfer(Scanner reader) {
    }

    private static void clear(Scanner reader) {

    }

    private static void delete(Scanner reader) {
        System.out.println("Welcome to Delete Player Menu");
        System.out.println("-------------------------------");
        PlayerService.printAllPlayers();
        System.out.print("Select one of the player id to delete: ");
        long id = Long.parseLong(reader.nextLine());
        PlayerService.removePlayerById(id);
    }

    private static void update(Scanner reader) {

    }

    private static void register(Scanner reader) {
        System.out.println("Welcome to Register Player Menu");
        System.out.println("-------------------------------------------------------");
        System.out.print("Enter player name: ");
        String name = reader.nextLine();
        System.out.print("Enter player surname: ");
        String surname = reader.nextLine();
        System.out.print("Enter player birthdate(YYYY-MM-DD): ");
        LocalDate birthdate = LocalDate.parse(reader.nextLine());
        System.out.print("Enter player country: ");
        String country = reader.nextLine();
        System.out.print("Enter player club: ");
        String club = reader.nextLine();
        System.out.print("Enter player gender: ");
        char gender = reader.nextLine().charAt(0);
        System.out.println("Enter one of the following positions: ");
        System.out.print(Arrays.toString(Position.values()) + ": ");
        String position = reader.nextLine().toUpperCase();
        Player player = new Player(name, surname, birthdate, country, club, gender,
                Position.valueOf(position));
        PlayerService.add(player);

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











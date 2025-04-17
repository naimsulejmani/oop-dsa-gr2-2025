package oop.arrays_example.fifa;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;

public class PlayerDemo {

    //https://notepad.pw/pinguinat
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
//        System.out.print("YES - per po, Cfaredo tjeter per JO...: ");
//        String answer = reader.nextLine();
//
//        if (!answer.equalsIgnoreCase("yes")) {
//            System.out.println("E MORE PISHMANLI!!!");
//            return;
//        }

        if (!confirm(reader)) {
            System.out.println("I re pishman!");
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
        System.out.println("Welcome to Find Player Menu");
        System.out.println("--------------------------------");
        PlayerService.printAllPlayers();
        System.out.print("Select id of the player that you want to find: ");
        long id = Long.parseLong(reader.nextLine());
        Player player = PlayerService.findPlayerById(id);
        if (player == null) {
            System.out.println("Player with id " + id + " not found!");
            return;
        }
        System.out.println("You selected: ");
        System.out.println("----------------------------------------");
        System.out.printf("ID: %d%n", player.getId());
        System.out.printf("Name: %s%n", player.getName());
        System.out.printf("Surname: %s%n", player.getSurname());
        System.out.printf("Birthdate: %s%n", player.getBirthdate());
        System.out.printf("Country: %s%n", player.getCountry());
        System.out.printf("Club: %s%n", player.getClub());
        System.out.printf("Position: %s%n", player.getPosition());
        System.out.printf("Active: %s%n", player.isActive() ? "✅" : "❌");
        System.out.println("----------------------------------------");
    }

    private static void transfer(Scanner reader) {
        System.out.println("Welcome to Transfer Player Menu");
        System.out.println("-------------------------------");
        PlayerService.printAllPlayers();
        System.out.print("Select player id to transfer: ");
        long id = Long.parseLong(reader.nextLine());
        Player player = PlayerService.findPlayerById(id);
        if (player == null) {
            System.out.println("Player with id " + id + " not found!");
            return;
        }
        System.out.println("You selected: ");
        PlayerService.print(player);
        System.out.println("Enter a new club: ");
        String newClub = reader.nextLine();
        System.out.printf("Deshironi te transferoni lojtarin nga %s ne -> %s?%n", player.getClub(), newClub);
        if (!confirm(reader)) {
            System.out.println("Transferimi deshtoi!");
            return;
        }

        player.setClub(newClub);
        System.out.println("Transferimi u kry me sukses!");

    }

    private static void clear(Scanner reader) {
        System.out.println("A je i sigurte se deshironi te resetoni databazen (listen)!");
        if (!confirm(reader)) {
            System.out.println("Shyqyr qe i re pishman!");
            return;
        }
        PlayerService.clear();
        System.out.println("Database reset successfully!");
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
        System.out.println("Welcome to Update Player Menu");
        System.out.println("---------------------------------------");
        PlayerService.printAllPlayers();
        System.out.print("Select one of the player id: ");
        long id = Long.parseLong(reader.nextLine());
        Player player = PlayerService.findPlayerById(id);
        if (player == null) {
            System.out.println("Player with id " + id + " not found!");
            return;
        }

        System.out.println("A deshironi me ndryshu emrin?");
        if (confirm(reader)) {
            System.out.print("Enter new name:");
            String name = reader.nextLine();
            player.setName(name);
        }

        System.out.println("A deshironi me ndryshu mbiemrin?");
        if (confirm(reader)) {
            System.out.print("Enter new surname:");
            String surname = reader.nextLine();
            player.setSurname(surname);
        }

        System.out.println("A deshironi me ndryshu daten e lindjes?");
        if (confirm(reader)) {
            System.out.print("Enter new birthdate(YYYY-MM-DD): ");
            String birthdate = reader.nextLine();
            player.setBirthdate(LocalDate.parse(birthdate));
        }

        System.out.println("A deshironi me ndryshu shtetin?");
        if (confirm(reader)) {
            System.out.print("Enter new country:");
            String country = reader.nextLine();
            player.setCountry(country);
        }

        System.out.println("A deshironi me ndryshu club?");
        if (confirm(reader)) {
            System.out.print("Enter new club:");
            String club = reader.nextLine();
            player.setClub(club);
        }

        System.out.println("A deshironi me ndryshu gjinine?");
        if (confirm(reader)) {
            System.out.print("Enter new gender:");
            char gender = reader.nextLine().charAt(0);
            player.setGender(gender);
        }

        System.out.println("A deshironi me ndryshu pozicionin?");
        if (confirm(reader)) {
            System.out.print("Enter new position:");
            System.out.println("Enter one of the following positions: ");
            System.out.print(Arrays.toString(Position.values()) + ": ");
            String position = reader.nextLine().toUpperCase();
            player.setPosition(Position.valueOf(position));
        }

        System.out.println("A deshironi me ndryshu statusin?");
        if (confirm(reader)) {
            System.out.print("Enter new status (TRUE/FALSE):");
            boolean active = Boolean.parseBoolean(reader.nextLine());
            player.setActive(active);
        }
        System.out.println("Update successfully!");


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

    public static boolean confirm(Scanner reader) {
        System.out.println("A je i sigurte? ");
        System.out.print("YES - per po, Cfaredo tjeter per JO...: ");
        String answer = reader.nextLine();
        return answer.equalsIgnoreCase("yes");
    }
}











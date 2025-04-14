package oop.arrays_example.fifa;

import java.util.ArrayList;

public class PlayerService {
    // lista ku kemi me i ruajt lojtaret / nje lloj tabele memorike
    private static ArrayList<Player> players = new ArrayList<>();


    // INSERT INTO Player(...) VALUES (...)
    public static void add(Player player) {
        players.add(player);
    }

    //SELECT * FROM Players WHERE ID=?
    public static Player findPlayerById(long id) {
        for (Player player : players) {
            if (player.getId() == id) {
                return player;
            }
        }
        return null;
    }

    //https://notepad.pw/pinguinati/
    public static void printAllPlayers() {
        System.out.println("Lista me lojtare:");
        System.out.println("-------------------------------------------------------");
        for (Player player : players) {
            print(player);
        }
        System.out.println("-------------------------------------------------------");
        System.out.println("Total players: " + players.size());
        System.out.println("-------------------------------------------------------");
    }

    public static void print(Player player) {
        System.out.printf("%-5d %-20s %-20s %-10s %-10s %-10s %-10s %n",
                player.getId(), player.getName(), player.getSurname(), player.getBirthdate(),
                player.getCountry(), player.getClub(), player.getPosition());
    }

    public static void removePlayerById(long id) {
        Player player = findPlayerById(id);
        if (player == null) {
            System.out.println("Player with id " + id + " not found!");
            return;
        }
        players.remove(player);
        System.out.println("Player with id " + id + " removed successfully!");
    }

}










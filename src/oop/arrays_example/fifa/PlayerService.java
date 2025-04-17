package oop.arrays_example.fifa;

import java.time.LocalDate;
import java.util.ArrayList;

public class PlayerService {
    // lista ku kemi me i ruajt lojtaret / nje lloj tabele memorike
    private static ArrayList<Player> players = new ArrayList<>();

    //static block initializer
    static {
        players.add(new Player("Naim", "Sulejmani",
                LocalDate.of(1986, 12, 16), "N. Macedonia",
                "Shkupi", 'M', Position.GK));
        players.add(new Player("Avdi", "Shabani",
                LocalDate.of(2006, 12, 1), "Kosove",
                "Drita", 'M', Position.CF));
    }


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
        System.out.printf("%-5d %-20s %-20s %-10s %-20s %-20s %-2s %s%n",
                player.getId(), player.getName(), player.getSurname(), player.getBirthdate(),
                player.getCountry(), player.getClub(), player.getPosition(),
                player.isActive() ? "✅" : "❌");
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


    public static void clear() {
        players.clear();
    }
}










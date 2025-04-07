package oop.arrays_example;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> clubs = new ArrayList<>(); // kapaciteti fillestar eshte 10
        ArrayList<Integer> numbers = new ArrayList<>(100);

        ArrayList<String> secondClubs = new ArrayList<>();
        secondClubs.addLast("Prishtina");
        secondClubs.add("Trepca");

        clubs.add("Barcelona");
        clubs.add("Bayern Munich");
        clubs.addFirst("Real Madrid");
        clubs.addLast("ManUnited");
        clubs.add(3, "Arsenal");
        clubs.add("Arsenal");
        clubs.add("Arsenal");
        clubs.add("Arsenal");

        clubs.addAll(3, secondClubs);

        for (String club : clubs) {
            System.out.println(club);
        }


        System.out.println(clubs.get(0));
        System.out.println(clubs.getFirst());

        System.out.println(clubs.get(clubs.size() - 1));
        System.out.println(clubs.getLast());

        System.out.println(clubs.get(5));


        System.out.println(clubs.indexOf("arsenal"));
        System.out.println(clubs.indexOf("Arsenal"));

        System.out.println(clubs.lastIndexOf("Arsenal"));


        System.out.println(clubs.contains("Trepca"));
        System.out.println(clubs.contains("Barca ma e mire se krejt!"));
        System.out.println(clubs.size());
        System.out.println(clubs.isEmpty());

        clubs.remove("Arsenal");
        clubs.remove(1);
//        clubs.removeFirst(); // VAR DECIDED
        clubs.removeLast();
        clubs.removeAll(secondClubs);
//        clubs.removeIf(s -> s.startsWith("A"));
        clubs.clear();
        System.out.println(clubs.size());
        System.out.println(clubs.isEmpty());


        clubs.set(1, "Milan");
        clubs.set(2, "Bayern Munchen");

        String[] array = (String[]) clubs.toArray();


    }
}











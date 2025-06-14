package oop.provimi.moster_tjeter;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class TrekendeshiKendrejteDemo {
    public static void main(String[] args) {
        List<TrekendeshiKendrejte> trekendeshat = new ArrayList();
        Scanner sc = new Scanner(System.in);
        final String SENTINEL = "exit";
        String input = "";
        while (!SENTINEL.equals(input.toLowerCase())) {
            System.out.println("Shkruani katetet e trekendeshit A:");
            double katetiA = Double.parseDouble(sc.nextLine());
            System.out.println("Shkruani katetet e trekendeshit B:");
            double katetiB = Double.parseDouble(sc.nextLine());
            TrekendeshiKendrejte t1 = new TrekendeshiKendrejte(katetiA, katetiB);
            trekendeshat.add(t1);
            System.out.println("A deshironi te shtoni nje tjeter trekenedesh? (shkruani 'exit' per te dale)");
            input = sc.nextLine();
        }

        for (TrekendeshiKendrejte t : trekendeshat) {
            System.out.println(t);
        }

        Iterator<TrekendeshiKendrejte> it = trekendeshat.iterator();
        while(it.hasNext()) {
            System.out.println("Iterating through: " + it.next());
        }

    }
}

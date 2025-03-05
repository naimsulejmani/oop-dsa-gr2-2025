package dsa.arrays_example;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        //araylisa prapavije e perdore vargun e thjeshte array[]
        ArrayList list = new ArrayList();
        list.add("Java OOP");
        list.add("Java Basic");
        list.add(false);
        list.add(10);
        list.add(100L);
        list.add(20.20F);
        list.add(20.34);
        list.add('A');

        System.out.println(list.get(0));
        System.out.println(list.size());
        System.out.println(list.get(list.size() - 1));
        System.out.println(list.getLast());
        System.out.println(list.getFirst());

        ArrayList<String> emrat = new ArrayList<>();
        emrat.add("Naim");
        emrat.add("Filan");
        emrat.add("Fistek");
        System.out.println(emrat.getFirst());

        ArrayList<Integer> numrat = new ArrayList<>();
        numrat.add(10);
        numrat.add(20);
        numrat.add(30);
        System.out.println(numrat.get(2));

        numrat.removeFirst();


        int index = emrat.indexOf("Filan");
        emrat.remove(index);
        System.out.println(emrat.contains("Filan"));
        System.out.println(emrat.contains("Naim"));
        System.out.println(emrat.indexOf("Naim"));

        emrat.clear();


        ArrayList<Double> pagat = new ArrayList<>();
        pagat.add(256.66);
        pagat.add(300.00);
        pagat.add(400.00);
        pagat.add(500.00);
        pagat.set(1, 1000.0);
        pagat.addFirst(2000.0);
        pagat.addLast(1_000_000.99);


        for(Double page: pagat) {
            System.out.println(page);
        }

    }
}














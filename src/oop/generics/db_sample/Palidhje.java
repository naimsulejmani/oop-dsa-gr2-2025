package oop.generics.db_sample;

public class Palidhje implements Comparable<Palidhje> {
    private int id;
    private String name;

    public Palidhje(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Palidhje() {
    }

    @Override
    public int compareTo(Palidhje o) {
        return this.id - o.id;
    }


    public static void main(String[] args) {
        Palidhje p = new Palidhje(38, "Naim");
        Palidhje p1 = new Palidhje(40, "Ronaldo");

        System.out.println(p.compareTo(p1));
        System.out.println(p1.compareTo(p));
    }
}

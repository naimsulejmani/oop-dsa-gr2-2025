package oop.class_summary.detyra;

public class BookDemo {
    public static void main(String[] args) {
        Book book1 = new Book();
        Book book2 = new Book();

        Book pse = new Book("Pse","Sterio Spase",400);
        System.out.println(pse.isBookLong());
    }
}

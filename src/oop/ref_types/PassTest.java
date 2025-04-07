package oop.ref_types;

public class PassTest {
    public static void main(String[] args) {
        int x = 10;
        System.out.println("Vlera para thirrjes se metodes eshte: " + x);
        passByValue(x);
        System.out.println("Vlera pas thirrjes se metodes eshte: " + x);


        System.out.println("-------------------------------------------------");
        MyDate date = new MyDate(1, 1, 2000);
        System.out.println("Data para thirrjes se metodes eshte: " + date.toString());
        passByReference(date);
        System.out.println("Data pas thirrjes se metodes eshte: " + date.toString());



        System.out.println("-------------------------------------------------");
        MyDate date1 = new MyDate(1, 1, 2000);
        System.out.println("Data para thirrjes se metodes eshte: " + date1);
        passByReferenceBad(date1);
        System.out.println("Data pas thirrjes se metodes eshte: " + date1);
    }

    public static void passByValue(int x) {
        System.out.println("Vlera para ndryshimit eshte: " + x);
        x = 20;
        System.out.println("Vlera pas ndryshimit eshte: " + x);
    }

    public static void passByReference(MyDate date) {
        System.out.println("Data para ndryshimit eshte: " + date.toString());
        date.setDay(15);
        date.setMonth(5);
        date.setYear(2023);
        System.out.println("Data pas ndryshimit eshte: " + date.toString());
    }

    public static void passByReferenceBad(MyDate date) {
        System.out.println("Data para ndryshimit eshte: " + date.toString());
        date = new MyDate(2, 2, 2002);
        System.out.println("Data pas ndryshimit eshte: " + date.toString());
    }


}

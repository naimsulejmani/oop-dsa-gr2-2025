package oop.associations.compositions;

import java.util.ArrayList;

public class PersonDemo {
    public static void main(String[] args) {

        String textFile = """
                Naim Sulejmani,1986,12,16
                Filan Fisteku, 2000,1,1
                Filane Fistekime, 2002,2,2
                """;

        ArrayList<Person> people = new ArrayList<>();


        String[] rows = textFile.split("\n");

        for (String row : rows) {
            String[] parts = row.split(",");
            String[] nameParts = parts[0].split(" ");
            String name = nameParts[0];
            String surname = nameParts[1];
            int year = Integer.parseInt(parts[1]);
            int month = Integer.parseInt(parts[2]);
            int day = Integer.parseInt(parts[3]);
            var birthdate = new Date(year, month, day);
            Person person = new Person(name, surname, birthdate);
            people.add(person);
        }


    }
}

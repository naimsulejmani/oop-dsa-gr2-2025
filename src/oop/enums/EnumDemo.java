package oop.enums;

public class EnumDemo {
    public static void main(String[] args) {
        Gender gender1 = Gender.MALE;
        JobType position1 = JobType.CONTRACT;

        System.out.println(gender1);
        System.out.println(position1);


        System.out.println(PizzaStatus.ORDERED.compareTo(PizzaStatus.CANCELLED));
        System.out.println(PizzaStatus.CANCELLED.compareTo(PizzaStatus.ORDERED));
    }
}

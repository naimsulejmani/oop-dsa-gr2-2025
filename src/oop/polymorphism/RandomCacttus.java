package oop.polymorphism;

public class RandomCacttus {
    private final int id;
    private static final int id2;
    // public readonly int id;
    private int randomNumber;

//instance initializer block
    {
        id=10;
        this.randomNumber = (int) (Math.random() * 2_000_000_000);
    }

    static {
        System.out.println("Static");
        id2=10;
    }


    public RandomCacttus() {
        //default constructor

    }

    public int getRandomNumber() {
        return randomNumber;
    }
}

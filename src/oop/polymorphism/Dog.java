package oop.polymorphism;

public class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("woof woof!");
    }

    public void fetch() {
        System.out.println("Fetching the ball!");
    }
}

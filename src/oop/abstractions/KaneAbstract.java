package oop.abstractions;

public abstract class KaneAbstract extends Wrestler {
    @Override
    public void themeMusic() {
        System.out.println("Theme music is: Kane");
    }

    public abstract void eat();
}

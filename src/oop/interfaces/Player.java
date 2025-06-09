package oop.interfaces;

public interface Player {
    public static final int MAX_AGE = 40;
    final int MIN_AGE=18;
    int id = 10;

    void play();
    public abstract void train();
    abstract void rest();
}

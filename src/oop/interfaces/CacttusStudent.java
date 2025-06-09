package oop.interfaces;

public class CacttusStudent extends StudentAdapter {
    @Override
    public float play() {
        System.out.println("CacttusStudent is playing with a cactus!");
        return 0;
    }
}

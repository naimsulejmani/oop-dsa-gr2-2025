package oop.interfaces;

public class Milk extends Object implements Perishable {
    private boolean isPerished = false;

    @Override
    public void perish() {
        isPerished = true;
    }

    @Override
    public boolean isPerished() {
        return isPerished;
    }
}

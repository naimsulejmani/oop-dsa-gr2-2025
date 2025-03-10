package oop.class_summary;

public class Counter {
    public static final int MAX_COUNT = 3;
    //variablat instance
    private int count;

    public int getCount() {
        return count;
    }

    public void increment() {
        if (count < MAX_COUNT) {
            count++;
        } else {
            reset();
        }

    }

    public void reset() {
        count = 0;
    }
}













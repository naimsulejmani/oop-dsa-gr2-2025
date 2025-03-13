package oop.class_summary.ushtrime;

public class Counter {
    private int count;
    private int maxCount;

    public Counter(int maxCount) {
        this.maxCount = maxCount;
    }

    public void increment() {
        if (count < maxCount) {
            ++count;
        } else {
            System.out.println("Ku ja ke msy!");
        }
    }

    public int getCount() {
        return count;
    }

    public int getMaxCount() {
        return maxCount;
    }

    public void reset() {
        count = 0;
    }

    public void decrement() {
        if (count > 0) {
            --count;
        } else {
            System.out.println("Ku ja ke msy!");
        }
    }
}

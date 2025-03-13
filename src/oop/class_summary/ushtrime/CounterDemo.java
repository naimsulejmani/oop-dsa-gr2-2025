package oop.class_summary.ushtrime;

public class CounterDemo {
    public static void main(String[] args) {
        Counter tespiht = new Counter(33);
        Counter studentInClass = new Counter(60);

        tespiht.increment();
        tespiht.increment();
        tespiht.decrement();
        System.out.println("Tespihti: " + tespiht.getCount());
    }
}

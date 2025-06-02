package oop.polymorphism;

import java.util.ArrayList;

public class StackWrong extends ArrayList {
    public void push(Object data) {
        addLast(data);
    }

    public Object pop() {
        if (isEmpty()) {
            return null;
        }
        return removeLast();
    }
}

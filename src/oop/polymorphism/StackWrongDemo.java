package oop.polymorphism;

import dsa.stack.Stack;

public class StackWrongDemo {
    public static void main(String[] args) {
        StackWrong stack = new StackWrong();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.addFirst(5);
        System.out.println(stack.pop());
        System.out.println(stack.size());

    }
}

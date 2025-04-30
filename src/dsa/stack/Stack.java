package dsa.stack;

public class Stack<T> {
    private static int MAX_SIZE = 1_000;
    private Element<T> top;
    private int size;

    public Stack() {
        //default constructor
    }

    public Stack(int max_size) {
        MAX_SIZE = max_size;
    }

    public boolean isEmpty() {
        return size == 0; //return top == null;
    }

    public boolean isFull() {
        return size == MAX_SIZE;
    }

    public int size() {
        return size;
    }

    public void push(T data) throws StackOverflowException {
        if (isFull()) {
            throw new StackOverflowException("Stack is full!");
        }
        Element<T> newElement = new Element<>(data, top);
        top = newElement;
        //top = new Element<>(data, top);
        size++;
    }

    public T pop() throws StackUnderflowException {
//        if (isEmpty()) {
//            throw new StackUnderflowException("Stack is empty!");
//        }
//        T data = top.getData();
        T data = peek();
        top = top.getNext();
        size--;
        return data;
    }

    public T peek() throws StackUnderflowException {
        if (isEmpty()) {
            throw new StackUnderflowException("Stack is empty!");
        }
        return top.getData();
    }

}


















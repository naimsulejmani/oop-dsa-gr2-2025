package dsa.stack;

public class StackArray<T extends Comparable<T>> {
    private static int MAX_SIZE = 1_000;
    private final Object[] stack;
    private int size;

    private T minimum;

    public StackArray() {
        stack = new Object[MAX_SIZE];
    }

    public StackArray(int max_size) {
        MAX_SIZE = max_size;
        stack = new Object[MAX_SIZE];
    }

    public boolean isEmpty() {
        return size == 0;
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

        if(isEmpty()){
            minimum=data;
        }
        if (data.compareTo(minimum) < 0) {
            minimum = data;
        }
        stack[size++] = data;
    }

    public T peek() throws StackUnderflowException {
        if (isEmpty()) {
            throw new StackUnderflowException("Stack is empty!");
        }

        return (T) stack[size - 1];
    }

    public T pop() throws StackUnderflowException {
        T data = peek();
        stack[--size] = null;
        return data;
    }


    public T getMinimum(){
        return minimum;
    }

}











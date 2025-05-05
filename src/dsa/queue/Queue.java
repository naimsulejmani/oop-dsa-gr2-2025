package dsa.queue;

public class Queue<T> {
    private final static int SPECIAL_EMPTY_VALUE = -1;
    private static int MAX_SIZE = 1_000;

    private int headIndex = SPECIAL_EMPTY_VALUE;
    private int tailIndex = SPECIAL_EMPTY_VALUE;

    private Object[] elements;

    public Queue() {
        this(1_000);
    }

    public Queue(int size) {
        if (size < 0) {
            throw new IllegalArgumentException("Size cannot be negative");
        }
        MAX_SIZE = size;
        elements = new Object[MAX_SIZE];
    }

    public boolean isEmpty() {
        return headIndex == SPECIAL_EMPTY_VALUE;
    }

    //nese elementi vijues qe do te insertohet pointon aty ku pointon headIndex
    //atehere eshte full, perndryshe nuk eshte full!
    public boolean isFull() {
        return (tailIndex + 1) % MAX_SIZE == headIndex;
    }

    public void enqueue(T data) throws QueueOverflowException {
        if (isFull()) {
            throw new QueueOverflowException("Queue is full!");
        }
        tailIndex = (tailIndex + 1) % MAX_SIZE;
        elements[tailIndex] = data;

        //ky eshte rasti kur queue eshte empty dhe headIndex eshte -1
        if (headIndex == SPECIAL_EMPTY_VALUE) headIndex = tailIndex;
    }

    public T dequeue() throws QueueUnderflowException {
//        if (isEmpty()) {
//            throw new QueueUnderflowException("Queue is empty!");
//        }
//
//        T data = (T) elements[headIndex];
        T data = peek();
        elements[headIndex] = null;
        if (headIndex == tailIndex) {
            headIndex = tailIndex = SPECIAL_EMPTY_VALUE;
        } else {
            headIndex = (headIndex + 1) % MAX_SIZE;
        }
        return data;
    }

    public T peek() throws QueueUnderflowException {
        if (isEmpty()) {
            throw new QueueUnderflowException("Queue is empty!");
        }
        return (T) elements[headIndex];
    }


    public int size() {
        if (isEmpty()) {
            return 0;
        }

        return tailIndex >= headIndex ? (tailIndex - headIndex + 1) : (MAX_SIZE + tailIndex - headIndex + 1);
    }

    public boolean offer(T data) {
        try {
            enqueue(data);
            return true;
        } catch (QueueOverflowException ex) {
            return false;
        }
    }

}


























package dsa.stack;

public class StackUnderflowException extends Exception {
    public StackUnderflowException() {
    }

    public StackUnderflowException(String message) {
        super(message);
    }
}

package oop.interfaces;

public class KeyListenerDemo {
    public static void main(String[] args) {

        if (args.length > 0) {
            String listenerType = args[0].toUpperCase();
            KeyListener listener = null;
            switch (listenerType) {
                case "EN":
                    listener = new EnKeyListener();
                    break;
                case "VJ":
                    listener = new VjosaKeyListener();
                    break;
                default:
                    System.out.println("Unknown key listener type: " + listenerType);
                    break;
            }
            if (listener != null) {
                simulateKeyThings(listener);
            }
        }
    }

    public static void simulateKeyThings(KeyListener listener) {
        listener.keyPressed('a');
        listener.keyDown('b');
        listener.keyUp('c');
    }
}

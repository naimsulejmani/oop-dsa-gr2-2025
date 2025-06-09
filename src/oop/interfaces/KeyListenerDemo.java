package oop.interfaces;

public class KeyListenerDemo {
    public static void main(String[] args) {

        if (args.length > 0) {
            String listenerType = args[0].toUpperCase();
            KeyListener listener = null;
            switch (listenerType) {
                case "EN":
                    listener = new EnKeyListener();

                    if(listener instanceof KeyListener) {
                        System.out.println("INSTANCE E KEY LISTENER");
                    }

                    if(listener instanceof Object) {
                        System.out.println("INSTANCE E OBJECT");
                    }
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

        if (listener instanceof EnKeyListener) {
            System.out.println("Using EN implementation");
        } else if (listener instanceof VjosaKeyListener vj1) {
//            VjosaKeyListener vjListener = (VjosaKeyListener)listener;
//            vjListener.test();
            vj1.test();
            System.out.println("Using VJ implementation");
        }

        listener.keyPressed('a');
        listener.keyDown('b');
        listener.keyUp('c');
    }
}

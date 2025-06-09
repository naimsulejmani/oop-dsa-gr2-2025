package oop.interfaces;

public class EnKeyListener implements KeyListener {
    @Override
    public void keyPressed(char key) {
        System.out.println("EN -> You have pressed the key: " + key);
    }

    @Override
    public void keyDown(char key) {
        System.out.println("EN -> You have pressed the key down: " + key);
    }

    @Override
    public void keyUp(char key) {
        System.out.println("EN -> You have released the key: " + key);
    }
}

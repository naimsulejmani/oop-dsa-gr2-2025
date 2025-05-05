package oop.inheritance.aviary;

import java.util.Arrays;

public class TalkingParrot extends Parrot {
    private String[] words;

    public TalkingParrot(String call, String color, String[] words) {
        super(call, color, "fruits");
        this.words = words;
    }

    public String talk() {
        return words[(int) (Math.random() * words.length)];
    }

    @Override
    public String toString() {
        return "TalkingParrot{" + super.toString() + " " + "words=" + Arrays.toString(words) + '}';
    }
}








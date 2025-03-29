package oop.enums;

public class CardSuitDemo {
    public static void main(String[] args) {

       drawSuitOnCard(2);
       drawSuitOnCard(-3);


       drawSuitOnCard(CardSuit.CLUBS);
       drawSuitOnCard(CardSuit.HEARTS);

    }

    public static void drawSuitOnCard(int suit) {
        System.out.println(((int) (Math.random() * 13)) + 1 + " of " + suit);
    }

    public static void drawSuitOnCard(CardSuit suit) {
        System.out.println(((int) (Math.random() * 13)) + 1 + " of " + suit);
    }
}

package oop.introduction;

public class Pokemon {
    public String name;
    public String type;
    public int health;


    public boolean dodge() {
        return Math.random() > 0.5;
    }

    public void attack(Pokemon enemy) {
        if (!enemy.dodge()) {
            enemy.health -= 10;
        } else {
            System.out.println("Enemy dodged the attack!");
        }
    }
}













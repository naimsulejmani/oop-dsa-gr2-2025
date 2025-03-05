package oop.introduction;

public class PokemonDemo {
    public static void main(String[] args) {
        Pokemon pikachu = new Pokemon();
        pikachu.name="Pikachu";
        pikachu.type="Electric";
        pikachu.health=100;

        Pokemon bulbasaur = new Pokemon();
        bulbasaur.name="Bulbasaur";
        bulbasaur.type="Grass";
        bulbasaur.health=100;


        pikachu.attack(bulbasaur);
        pikachu.attack(bulbasaur);
        pikachu.attack(bulbasaur);

        System.out.println(bulbasaur.health);


    }
}

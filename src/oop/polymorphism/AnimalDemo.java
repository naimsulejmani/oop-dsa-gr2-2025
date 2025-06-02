package oop.polymorphism;

public class AnimalDemo {
    public static void main(String[] args) {
        //upcasting
        Animal animal = new Dog();
        Animal animal2 = new Cat();
        Animal animal3 = new Animal();

        makeAnimalSound(animal);
        makeAnimalSound(animal2);
        makeAnimalSound(animal3);

    }
    //te kjo metode munde te dergojme parametra si tipit: Animal, Cat, Dog, Lion,...
    public static void makeAnimalSound(Animal animal) {
        animal.makeSound();

        if(animal instanceof Dog) {
            System.out.println("Animal is a DOG!");
            Dog dog = (Dog) animal; //downcasting;
            dog.fetch();
        } else if(animal instanceof Cat) {
            System.out.println("Animal is a Cat!");
        } else {
            System.out.println("Animal is of unknown type!");
        }
        // instanceof perdoret per te kontrolluar nese nje objekt eshte i nje lloji te caktuar te femise
        // sa ma konkrete te jete objekti, pastaj duke e rrite nivelin
    }
}

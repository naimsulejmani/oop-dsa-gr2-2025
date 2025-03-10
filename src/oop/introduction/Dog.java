package oop.introduction;

public class Dog {
    //instance variables
    private String name;
    private float weight;
    private String favouriteToy;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public String getFavouriteToy() {
        return favouriteToy;
    }

    public void makeFavourite(String favouriteToy) {
        this.favouriteToy = favouriteToy;
    }

    /*
        Kudo qe keni kompare zakonisht perdoret int:
        kur krahasojme obj1 me obj2 kthejme:
        vlere pozitive nese obj1>obj2
        vlere negative nese obj1<obj2
        vlere 0 nese obj1==obj2

     */

    public int compare(Dog anotherDog) {
        //nese kishte qene integer
        // return this.weight - anotherDog.weight;
        if (this.weight > anotherDog.weight) {
            return 1;
        } else if (this.weight < anotherDog.weight) {
            return -1;
        } else {
            return 0;
        }

    }
}









package oop.associations.game;

import oop.class_summary.ushtrime.Point;

public class GameDemo {
    public static void main(String[] args) {
        AntiAirCraftGun gun = new AntiAirCraftGun(new Point(2, 3));

        Bomber f35 = new Bomber(new Point(5, 6));

        gun.setTarget(f35);

        f35.setTarget(gun);

        gun.fire();
        f35.fire();

        System.out.println("Gun health: " + gun.getHealth());
        System.out.println("Bomber health: " + f35.getHealth());

    }
}

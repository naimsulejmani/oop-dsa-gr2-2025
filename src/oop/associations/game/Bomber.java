package oop.associations.game;

import oop.class_summary.ushtrime.Point;

public class Bomber {
    private Point position;
    private int health = 100;
    private AntiAirCraftGun target;

    public Bomber(Point position) {
        this.position = position;
    }

    public Bomber() {
        this(new Point(0, 0));
    }

    public Point getPosition() {
        return position;
    }

    public void setPosition(Point position) {
        this.position = position;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public AntiAirCraftGun getTarget() {
        return target;
    }

    public void setTarget(AntiAirCraftGun target) {
        this.target = target;
    }

    public boolean isDestroyed() {
        return health == 0;
    }

    public void fire() {
        if (target == null) {
            System.out.println("Nothing on radar!");
            return;
        }

        if (target.isDestroyed()) {
            target = null;
            System.out.println("Target already destroyed!");
            return;
        }

        if (!(target.getPosition().distanceTo(this.position) < 50)) {
            System.out.println("Target out of range!");
            return;
        }
        if (!(Math.random() > 0.5)) {
            System.out.println("Miss!");
            return;
        }
        int damage = (int) (Math.random() * 100) + 1;

        if (damage >= target.getHealth()) {
            target.setHealth(0);
            System.out.println("Target destroyed!");
        } else {
            target.setHealth(target.getHealth() - damage);
            System.out.println("Damage: " + damage);
        }

    }
}

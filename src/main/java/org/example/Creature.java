package org.example;

public abstract class Creature extends Entity {
    public final int speed;
    public final int hp;
    public Coordinates coordinates;

    protected Creature(int speed, int hp, Coordinates coordinates) {
        this.speed = speed;
        this.hp = hp;
        this.coordinates = coordinates;
    }
}

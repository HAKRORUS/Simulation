package org.example.Entites;

import org.example.Coordinates;

public abstract class Creature extends Entity {
    public final int speed;
    public final int hp;

    protected Creature(int speed, int hp, Coordinates coordinates) {
        super(coordinates);
        this.speed = speed;
        this.hp = hp;
    }
}

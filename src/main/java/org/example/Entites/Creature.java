package org.example.Entites;

import org.example.Coordinates;
import org.example.GameMap;

public abstract class Creature extends Entity {
    public final int speed;
    public final int hp;

    protected Creature(int speed, int hp, Coordinates coordinates) {
        super(coordinates);
        this.speed = speed;
        this.hp = hp;
    }

    public void makeMove() {
    }

    public abstract Coordinates makeMove(GameMap gameMap);
}

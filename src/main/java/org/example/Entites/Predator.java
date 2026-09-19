package org.example.Entites;

import org.example.Coordinates;
import org.example.GameMap;

public class Predator extends Creature {

    public Predator(int speed, int hp, Coordinates coordinates) {
        super(speed,hp, coordinates);
    }

    @Override
    public Coordinates makeMove(GameMap gameMap) {

        return null;
    }

}

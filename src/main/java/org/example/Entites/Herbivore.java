package org.example.Entites;

import org.example.Coordinates;
import org.example.CoordinatesShift;

import java.util.HashSet;
import java.util.Set;

public class Herbivore extends Creature {
    public Herbivore(int speed, int hp, Coordinates coordinates) {
        super(speed,hp, coordinates);
    }

    @Override
    public void makeMove() {
        Set<CoordinatesShift> result = new HashSet<>();

        for (int xShift = -1; xShift <= 1; xShift++) {
            for (int yShift = -1; yShift <= 1; yShift++) {
                if (yShift == 0 && xShift == 0) {
                    continue;
                }
                result.add(new CoordinatesShift(xShift,yShift));
            }
        }
         (int) (Math.random() * (15 - 10 + 1)) + 10
        while ()
    }
}
